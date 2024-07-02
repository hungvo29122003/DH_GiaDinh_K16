using QLSV;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace QLSV
{
    public partial class DSMON_HOC : Form
    {
        ketnoi connection = new ketnoi();
        private Main main;
        public DSMON_HOC(Main main)
        {
            InitializeComponent();
            this.main = main;
        }
        public void resetbutton()
        {
            txt_Ma_MH.Enabled = false;
            txt_Mo_ta.Text = "";
            txt_So_TC.Text = "";
        }
        public void loadData()
        {
            String query = "SELECT * FROM MonHoc";
            dataGridView1.DataSource = connection.Execute(query);
        }
        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            int index = dataGridView1.CurrentRow.Index;
            txt_Ma_MH.Text = dataGridView1.Rows[index].Cells[0].Value.ToString();
            txt_TenMH.Text = dataGridView1.Rows[index].Cells[1].Value.ToString();
            txt_So_TC.Text = dataGridView1.Rows[index].Cells[2].Value.ToString();
            txt_Mo_ta.Text = dataGridView1.Rows[index].Cells[3].Value.ToString();
        }

        private void MON_HOC_Load(object sender, EventArgs e)
        {
            resetbutton();
            loadData();
            
        }

        private void btn_Add_Click(object sender, EventArgs e)
        {
            String maMH = txt_Ma_MH.Text;
            String tenMH = txt_TenMH.Text;
            String soTC = txt_So_TC.Text;
            String moTa = txt_Mo_ta.Text;
            if(String.IsNullOrEmpty(tenMH) || String.IsNullOrEmpty(soTC)
                || String.IsNullOrEmpty(moTa))
            {
                MessageBox.Show("Vui lòng nhập đầy đủ thông tin ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                String insertQuerry = "INSERT INTO MonHoc VALUES(N'" + tenMH + "', N'" + soTC + "', N'" + moTa + "')";
                connection.ExecuteNonQuery(insertQuerry);
                loadData();
            }
        }

        private void btn_Delete_Click(object sender, EventArgs e)
        {
            String tenMH = txt_TenMH.Text;
            String soTC = txt_So_TC.Text;
            String moTa = txt_Mo_ta.Text;
            if (String.IsNullOrEmpty(txt_Ma_MH.Text))
            {
                MessageBox.Show("Vui lòng chọn môn học cần xóa ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                int maMH = Convert.ToInt32(txt_Ma_MH.Text);
                String query = "DELETE FROM MonHoc WHERE MaMH = "+maMH;
                connection.ExecuteNonQuery(query);
                MessageBox.Show("Môn học đã được xóa thành công ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Information);
                loadData();
            }
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            String tenMH = txt_TenMH.Text;
            String soTC = txt_So_TC.Text;
            String moTa = txt_Mo_ta.Text;
            if(String.IsNullOrEmpty(txt_Ma_MH.Text))
            {
                MessageBox.Show("Vui lòng chọn môn để sửa ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                int maMH = Convert.ToInt32(txt_Ma_MH.Text);
                String query = "UPDATE MonHoc SET TenMH = N'" + tenMH + "', SoTC = N'" + soTC + "', MoTa = N'" + moTa + "' WHERE MaMH = "+maMH;
                connection.ExecuteNonQuery (query);
                loadData ();
            }
        }

        private void btn_Exit_Click(object sender, EventArgs e)
        {
            if(MessageBox.Show("Bạn có chắc muốn thoát !", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                closeFrom();
            }
        }
        private void closeFrom()
        {
            this.main.Show();
            this.Hide ();
        }
    }
}
