
using QLSV;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace QLSV

{
    public partial class DSSv : Form
      
    {
        ketnoi connection = new ketnoi();
        
        public DSSv()
        {
            InitializeComponent();
        }
        private void gioiTinh()
        {
            
            CB_Gioi_Tinh.Items.Clear();
            CB_Gioi_Tinh.Items.Add("Nam");
            CB_Gioi_Tinh.Items.Add("Nữ");
        }
        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            int index = dataGridView1.CurrentRow.Index;
            txt_Ma_SV.Text = dataGridView1.Rows[index].Cells[0].Value.ToString();
            txt_TenSV.Text = dataGridView1.Rows[index].Cells[1].Value.ToString();
            CB_Gioi_Tinh.Text = dataGridView1.Rows[index].Cells[2].Value.ToString();
            txt_SDT.Text = dataGridView1.Rows[index].Cells[3].Value.ToString();
            txt_MaLop.Text = dataGridView1.Rows[index].Cells[4].Value.ToString();
        }

        private void DSSv_Load(object sender, EventArgs e)
        {
            gioiTinh();
            resetButton();
            loadData();
        }
        private void resetButton()
        {
            txt_Ma_SV.Enabled = false;
            txt_TenSV.Text = "";
            CB_Gioi_Tinh.Text = "";
            txt_SDT.Text = "";
            txt_MaLop.Text = "";
        }

        private void btn_Add_Click(object sender, EventArgs e)
        {
            String maSv = txt_Ma_SV.Text;
            String tenSv = txt_TenSV.Text;
            String sdt = txt_SDT.Text;
            string maLop = txt_MaLop.Text;
            String gioiTinh = CB_Gioi_Tinh.Text;
            if(String.IsNullOrEmpty(maLop) || String.IsNullOrEmpty(tenSv) || String.IsNullOrEmpty(sdt) 
                || String.IsNullOrEmpty(maLop) || String.IsNullOrEmpty(gioiTinh))
            {
                MessageBox.Show("Vui lòng nhập đầy đủ thông tin ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                String insertQuery = "INSERT INTO SINHVIEN VALUES(@tensv, @phai, @sdt, @malop)";
                connection.openConnection();
                SqlCommand addSV = new SqlCommand(insertQuery, connection.getConn());
                //addSV.Parameters.AddWithValue("@masv", maSv);
                addSV.Parameters.AddWithValue("@tensv", tenSv);
                addSV.Parameters.AddWithValue("@phai", gioiTinh);
                addSV.Parameters.AddWithValue("@sdt", sdt);
                addSV.Parameters.AddWithValue("@malop", maLop);
                addSV.ExecuteNonQuery();
                connection.closeConnection();
                resetButton();
                loadData();
                MessageBox.Show("Thêm thành công ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Information);
                connection.closeConnection();
            }
           // ketnoi.closeConnection();
        }
        public void loadData()
        {
            string query = "select * from SinhVien";
            dataGridView1.DataSource = connection.Execute(query);
        }

        private void btn_Exit_Click(object sender, EventArgs e)
        {
            if(MessageBox.Show("Bạn có muốn thoát ! ", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                this.Hide();
                Main main = new Main();
                main.ShowDialog();
            }
        }

        private void btn_Delete_Click(object sender, EventArgs e)
        {
            
            if(String.IsNullOrEmpty(txt_Ma_SV.Text))
            {
                MessageBox.Show("Vui lòng chọn sinh viên cần xóa ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Information );
            } else
            {
                int maSv = Convert.ToInt32(txt_Ma_SV.Text);
                String deleteQuery = "DELETE FROM SinhVien WHERE MaSV = "+maSv;
                //connection.openConnection();
                //SqlCommand deleteSV = new SqlCommand(deleteQuery, connection.getConn());
                //deleteSV.Parameters.AddWithValue("@masv", maSv);
                //deleteSV.ExecuteNonQuery();
                connection.ExecuteNonQuery(deleteQuery);
                MessageBox.Show("Đã xóa thành công !", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
                loadData();
            }
            connection.closeConnection() ;

        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            String tenSV = txt_TenSV.Text;
            String sdt = txt_SDT.Text;
            String maLop = txt_MaLop.Text;
            String gioiTinh = CB_Gioi_Tinh.Text;
            if (String.IsNullOrEmpty(txt_Ma_SV.Text))
            {
                MessageBox.Show("Vui lòng chọn sinh viên cần sửa ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error );
            } else
            {
                int maSV = Convert.ToInt32(txt_Ma_SV.Text);
                String updateQuery = "UPDATE SinhVien SET TenSV = N'"+tenSV+"', Phai = N'"+gioiTinh+"', SDT = N'"+sdt+"', MaLop =N'"+maLop+"'  WHERE MaSV = "+maSV;
                connection.ExecuteNonQuery(updateQuery);
                loadData() ;
                
            }
        }
    }
}
