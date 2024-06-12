namespace Buoi3.checkbox_radioBTN
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_Save_Click(object sender, EventArgs e)
        {
            if (this.CheckName() == true)
            {
                String str = "";

                lst_tt.Items.Clear();
                lst_tt.Items.Add(txt_Name.Text);
                lst_tt.Items.Add(txt_Class.Text);
                str += "Họ và tên: " + txt_Name.Text + ",";
                str += "lớp: " + txt_Class.Text + ",";
                if (rb_Male.Checked == true)
                {
                    lst_tt.Items.Add("Nam");
                    str += "Giới tính: nam, ";
                }
                if (rb_Female.Checked == true)
                {
                    lst_tt.Items.Add("Nữ");
                    str += "Giới Tính: Nữ, ";
                }
                if (cb_LTTQ.Checked == true)
                {
                    lst_tt.Items.Add("Lập trình trực quan ");
                    str += "Lập trinh trực quan, ";
                }
                if (cb_LT_WEB.Checked == true)
                {
                    lst_tt.Items.Add("Lập trình Website");
                    str += "Lập trình Website, ";
                }
                if (cb_LT_QL.Checked == true)
                {
                    lst_tt.Items.Add("Lập trình quản lý");
                    str += "lập trình quản lý, ";
                }
                if (cb_ANM.Checked == true)
                {
                    lst_tt.Items.Add("An ninh mạng");
                    str += "An ninh mạng, ";
                }
                using (StreamWriter sw = new StreamWriter("luu.txt"))
                {
                    sw.WriteLine(str);
                }
                textBox1.Text = str;
            }
        }
        private bool CheckName()
        {
            // kt txt hoten
            if (String.IsNullOrEmpty(txt_Name.Text))
            {
                MessageBox.Show("Vui lòng nhập họ tên ", "Thông báo",
                     MessageBoxButtons.OK, MessageBoxIcon.Error);
                txt_Name.Focus();
                return false;
            }
            // kt txt lớp
            if (string.IsNullOrEmpty(txt_Class.Text))
            {
                MessageBox.Show("Vui lòng nhập lớp ", "Thông báo",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
                txt_Class.Focus();
                return false;
            }
            return true;
        }

        private void txt_Name_TextChanged(object sender, EventArgs e)
        {

        }

        private void lbl_Name_Click(object sender, EventArgs e)
        {
            String s = txt_Name.Text;
        }

        private void lbl_Class_Click(object sender, EventArgs e)
        {
            String s = txt_Class.Text;
        }

        private void lst_tt_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_Exit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }

}
