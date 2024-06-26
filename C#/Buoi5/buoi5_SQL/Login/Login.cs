using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
namespace Login
{
    public partial class Login : Form
    {
        SqlConnection conn = new SqlConnection(@"Data Source=Hung;Initial Catalog=QLCongty;Integrated Security=True");
        public Login()
        {
            InitializeComponent();
        }
        private void chuaLoad()
        {
            SqlDataAdapter adapter = new SqlDataAdapter();
            SqlCommand cmd = conn.CreateCommand();
            cmd.CommandText = "SELECT * FROM Account";
            adapter.SelectCommand = cmd;
            DataTable dt = new DataTable();
            adapter.Fill(dt);
            dataGridView1.DataSource = dt;
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            conn.Open();
            chuaLoad();
            matKhauAn();
            conn.Close();

        }


        private void btn_Add_Click(object sender, EventArgs e)
        {
            conn.Open();
            String user = txtName.Text;
            String password = txt_Pass.Text;
            string type = txt_Type.Text;
            SqlCommand checkUserCmd = conn.CreateCommand();
            checkUserCmd.CommandText = "SELECT COUNT(*) FROM Account WHERE UserName = @user";
            checkUserCmd.Parameters.AddWithValue("@user", user);
            // cmd.ExecuteNonQuery();
            //MessageBox.Show("Đã Thêm thành công", "Thông báo");
            int countUser = (int)checkUserCmd.ExecuteScalar();
            if(countUser > 0)
            {
                MessageBox.Show("Tài khoản đã tồn tại ! ", "thông báo",MessageBoxButtons.OK,MessageBoxIcon.Warning);
            }
            else
            {
                SqlCommand addcmd = conn.CreateCommand();
                addcmd.CommandText = "INSERT INTO Account VALUES(@user, @password, @type)";
                addcmd.Parameters.AddWithValue("@user", user);
                addcmd.Parameters.AddWithValue ("Password", password);
                addcmd.Parameters.AddWithValue("@type", type);
                addcmd.ExecuteNonQuery();
                MessageBox.Show("thêm thành công! ", "Thông báo", MessageBoxButtons.OK,MessageBoxIcon.Warning);
                chuaLoad();
            }
            conn.Close();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            int index = dataGridView1.CurrentRow.Index;
            txtName.Text = dataGridView1.Rows[index].Cells[0].Value.ToString();
            txt_Pass.Text = dataGridView1.Rows[index].Cells[1].Value.ToString();
            txt_Type.Text = dataGridView1.Rows[index].Cells[2].Value.ToString();
        }

        private void btn_Login_Click(object sender, EventArgs e)
        {
            conn.Open();
            Form1 Qlnv = new Form1();
            Qlnv.Show();
            this.Hide();
            conn.Close();
        }
        private void matKhauAn()
        {
            txt_Pass.Text = "";
            txt_Pass.PasswordChar = '*';
        }

        private void cb_ShowPass_CheckedChanged(object sender, EventArgs e)
        {
            matKhauThuc();
        }
        private void matKhauThuc()
        {
            if (cb_ShowPass.Checked)
            {
                txt_Pass.PasswordChar = '\0';
            }
            else
            {
                txt_Pass.PasswordChar = '*';
            }
        }

        private void txt_Pass_TextChanged(object sender, EventArgs e)
        {
            matKhauThuc();
        }
        private void clearTextbox()
        {
            txtName.Text = "";
            txt_Pass.Text = "";
            txt_Type.Text = "";
        }
        private void btn_Delete_Click(object sender, EventArgs e)
        {
            String User = txtName.Text;
            if (String.IsNullOrEmpty(User))
            {
                MessageBox.Show("vui lòng chọn tài khoản cần xóa trong danh sách ! ", "thông báo");
                return;
            }
            if (MessageBox.Show("Bạn có chắc chắn muốn xóa tài khoản này! ", "thông báo ", MessageBoxButtons.YesNo) == DialogResult.Yes){
                conn.Open();
                SqlCommand deleteCMD = conn.CreateCommand();
                deleteCMD.CommandText = "DELETE FROM Account WHERE userName = @user";
                deleteCMD.Parameters.AddWithValue("@user", User);
                deleteCMD.ExecuteNonQuery();
                MessageBox.Show("Đã xóa thành công", "thông báo");
                chuaLoad();
                clearTextbox();
            }
            conn.Close();
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            String user = txtName.Text;
            String pass = txt_Pass.Text;
            String type = txt_Type.Text;
            conn.Open();
            SqlCommand suaCMD = conn.CreateCommand();
            suaCMD.CommandText = "UPDATE Account SET Password =  @password, type = @type WHERE UserName = @user";
            suaCMD.Parameters.AddWithValue("@user", txtName.Text);
            suaCMD.Parameters.AddWithValue("@password", txt_Pass.Text);
            suaCMD.Parameters.AddWithValue("@type", txt_Type.Text);

            int rowsAffected = suaCMD.ExecuteNonQuery();
            if(rowsAffected > 0)
            {
                MessageBox.Show("Thông tin tài khoản được cập nhật thành công", "Thông báo");
                chuaLoad();
            }
            else
            {
                MessageBox.Show("Không tìm thấy tài khoản để cập nhật", "Lỗi", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            conn.Close() ;
        }
    }
}
