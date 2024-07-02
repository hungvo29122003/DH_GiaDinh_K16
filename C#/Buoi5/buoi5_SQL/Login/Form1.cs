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
using System.Xml.Linq;

namespace Login
{
    public partial class Form1 : Form
    {
        SqlConnection conn = new SqlConnection((@"Data Source=Hung;Initial Catalog=QLCongty;Integrated Security=True"));
        DataTable dt = new DataTable();
        public Form1()
        {
            InitializeComponent();
        }
        private void GioiTinh()
        {
            cb_GioiTinh.Items.Clear();
            cb_GioiTinh.Items.Add("Nam");
            cb_GioiTinh.Items.Add("Nữ");
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           conn.Open();
           GioiTinh();
           reloatData();
           resetButton();
           conn.Close();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            int index = dataGridView1.CurrentRow.Index;
            txt_MANV.Text = dataGridView1.Rows[index].Cells[0].Value.ToString();
            txt_Name.Text = dataGridView1.Rows[index].Cells[1].Value.ToString();
            dateTimePicker1.Text = dataGridView1.Rows[index].Cells[2].Value.ToString();
            cb_GioiTinh.Text = dataGridView1.Rows[index].Cells[3].Value.ToString();
            txt_ChucVu.Text = dataGridView1.Rows[index].Cells[4].Value.ToString();
            txt_TienLuong.Text = dataGridView1.Rows[index].Cells[5].Value.ToString();
        }

        private void btn_Thoat_Click(object sender, EventArgs e)
        {
            if(MessageBox.Show("Bạn có chắc muốn thoát", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

        private void btn_Them_Click(object sender, EventArgs e)
        {
            conn.Open();
            String manv = txt_MANV.Text;
            String name = txt_Name.Text;
            String ngaySinh = dateTimePicker1.Value.ToString();
            String gioiTinh = cb_GioiTinh.Text;
            String chucVU = txt_ChucVu.Text;
            String tienLuong = txt_TienLuong.Text;
            if (string.IsNullOrEmpty(manv) || string.IsNullOrEmpty(name) || string.IsNullOrEmpty(gioiTinh)
                || string.IsNullOrEmpty(chucVU) || string.IsNullOrEmpty(tienLuong)){
                return;
            }
            else {
                SqlCommand checkManv = conn.CreateCommand();
                checkManv.CommandText = "SELECT COUNT(*) FROM ThongTinNhanVien WHERE manv = @manv";
                checkManv.Parameters.AddWithValue("@manv", manv);
                int countManv = (int)checkManv.ExecuteScalar();
                if (countManv > 0) {
                    MessageBox.Show("Nhân viên đã tồn tại ! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    SqlCommand addManv = conn.CreateCommand();
                    addManv.CommandText = "INSERT INTO ThongTinNhanVien VALUES(@manv, @tennv, @ngaysinh, @gioitinh, @chucvu, @tienluong)";
                    addManv.Parameters.AddWithValue("@manv", manv);
                    addManv.Parameters.AddWithValue("@tennv", name);
                    addManv.Parameters.AddWithValue("@ngaysinh", ngaySinh);
                    addManv.Parameters.AddWithValue("@gioitinh", gioiTinh);
                    addManv.Parameters.AddWithValue("@chucvu", chucVU);
                    addManv.Parameters.AddWithValue("@tienluong", tienLuong);
                    addManv.ExecuteNonQuery();
                    resetButton();
                    reloatData();
                    MessageBox.Show("thêm thành công! ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
            }
            conn.Close();
           
            // cmd.ExecuteNonQuery();
            //MessageBox.Show("Đã Thêm thành công", "Thông báo");
        }
        private void reloatData()
        {   
            SqlCommand reloatCmd = conn.CreateCommand();
            reloatCmd.CommandText = "Select * From ThongTinNhanVien";
            SqlDataAdapter adapter = new SqlDataAdapter();
            adapter.SelectCommand = reloatCmd;
            dt.Clear();
            adapter.Fill(dt);
            dataGridView1.DataSource = dt;
        }
        private void resetButton()
        {
            txt_MANV.Text = "";
            txt_Name.Text = "";
            cb_GioiTinh.Text = "";
            dateTimePicker1.Text = "";
            txt_ChucVu.Text = "";
            txt_TienLuong.Text = "";
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            conn.Open();
            String manv = txt_MANV.Text;
            String tennv = txt_Name.Text;
            String gioitinh = cb_GioiTinh.Text;
            String ngaysinh = dateTimePicker1.Text;
            String chucvu = txt_ChucVu.Text;
            String tienluong = txt_TienLuong.Text;
            SqlCommand suaCMD = conn.CreateCommand();
            suaCMD.CommandText = "UPDATE ThongTinNhanVien SET TenNV =  @tennv, NgaySinh = @ngaysinh, GioiTinh = @gioitinh, ChucVu = @chucvu, TienLuong = @tienluong WHERE manv = @manv";
            suaCMD.Parameters.AddWithValue("@manv", manv);
            suaCMD.Parameters.AddWithValue("@tennv", tennv);
            suaCMD.Parameters.AddWithValue("@ngaysinh", ngaysinh);
            suaCMD.Parameters.AddWithValue("gioitinh", gioitinh);
            suaCMD.Parameters.AddWithValue("@chucvu", chucvu);
            suaCMD.Parameters.AddWithValue("@tienluong", tienluong);
           
            int rowsAffected = suaCMD.ExecuteNonQuery();
            if (rowsAffected > 0)
            {
                MessageBox.Show("Thông tin tài khoản được cập nhật thành công", "Thông báo");
                reloatData();
            }
            else
            {
                MessageBox.Show("Không tìm thấy tài khoản để cập nhật", "Lỗi", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            conn.Close();
        }

        private void btn_xoa_Click(object sender, EventArgs e)
        {
            String manv = txt_MANV.Text;
            if (String.IsNullOrEmpty(manv))
            {
                MessageBox.Show("vui lòng chọn nhân viên cần xóa trong danh sách ! ", "thông báo");
                return;
            }
            if (MessageBox.Show("Bạn có chắc chắn muốn xóa nhân viên này! ", "thông báo ", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                conn.Open();
                SqlCommand deleteCMD = conn.CreateCommand();
                deleteCMD.CommandText = "DELETE FROM ThongTinNhanVien WHERE manv = @manv";
                deleteCMD.Parameters.AddWithValue("@manv", manv);
                deleteCMD.ExecuteNonQuery();
                MessageBox.Show("Đã xóa thành công", "thông báo");
                reloatData();
                resetButton();
            }
            conn.Close();
        }
    }
}
