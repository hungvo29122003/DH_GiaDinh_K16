using System;
using System.Data;
using System.Data.SqlClient;
using System.Windows.Forms;
using CrystalDecisions.CrystalReports.Engine;
using CrystalDecisions.Windows.Forms;

namespace QL_ThuVien
{
    public partial class Form1 : Form
    {
        private Ketnoi connnection;
        private string tableName = "DocGia";
        private rptDocGia rptDocGia;

        public Form1()
        {
            InitializeComponent();
            rptDocGia = new rptDocGia();
            connnection = new Ketnoi();
            // Đăng ký sự kiện CellClick
            dataGridViewPrintDocGia.CellClick += dataGridViewPrintDocGia_CellClick;
        }

        private void reloadData()
        {
            connnection.openConnection();
            string str = "Select * From " + this.tableName;
            string maDocGia = cbMaDocGia.Text;
            string tenDocGia = cbTenDocGia.Text;

            if (!string.IsNullOrEmpty(maDocGia))
            {
                str += " where MaDocGia = @MaDocGia";
            }
            else if (!string.IsNullOrEmpty(tenDocGia))
            {
                str += " where TenDocGia = @TenDocGia";
            }

            SqlDataAdapter adapter = new SqlDataAdapter(str, connnection.getConnection());
            if (!string.IsNullOrEmpty(maDocGia))
            {
                adapter.SelectCommand.Parameters.AddWithValue("@MaDocGia", maDocGia);
            }
            else if (!string.IsNullOrEmpty(tenDocGia))
            {
                adapter.SelectCommand.Parameters.AddWithValue("@TenDocGia", tenDocGia);
            }

            DataTable dt = new DataTable();
            adapter.Fill(dt);
            dataGridViewPrintDocGia.DataSource = dt;
            connnection.closeConnection();
        }

        private void dataGridViewPrintDocGia_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                int index = dataGridViewPrintDocGia.CurrentCell.RowIndex;
                cbMaDocGia.Text = dataGridViewPrintDocGia.Rows[index].Cells[0].Value.ToString();
                cbTenDocGia.Text = dataGridViewPrintDocGia.Rows[index].Cells[1].Value.ToString();
            }
        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            try
            {
                CrystalReportViewer reportViewer = new CrystalReportViewer();
                ReportDocument reportDoc = new ReportDocument();

                string reportPath = @"F:\DEV\C#\QL_ThuVien\BaoCao\rptDocGia.rpt"; // Đường dẫn đến tệp báo cáo
                reportDoc.Load(reportPath);

                // Kiểm tra và thiết lập tham số
                if (cbMaDocGia.SelectedItem != null)
                {
                    reportDoc.SetParameterValue("MaDocGia", cbMaDocGia.SelectedItem.ToString());
                }

                reportViewer.ReportSource = reportDoc;

                Form reportForm = new Form();
                reportForm.Controls.Add(reportViewer);
                reportViewer.Dock = DockStyle.Fill;
                reportForm.ShowDialog();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Có lỗi xảy ra: " + ex.Message);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            reloadData();
        }
    }
}
