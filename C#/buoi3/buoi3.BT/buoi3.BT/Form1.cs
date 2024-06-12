using System.Data.SqlTypes;
using System.Drawing.Text;

namespace buoi3.BT
{
    public partial class Form1 : Form
    {
        private double totalCustom = 0;
        private double totlalMoney = 0;
        private double currentMoney = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            SetButton();
        }
        private void txtSo_Kh_TextChanged(object sender, EventArgs e)
        {
            SetButton();
        }

        private void SetButton()
        {
            if ((txtTen_KH.Text.Length == 0) || (txtSo_Kh.Text.Length == 0))
            {
                btnTinhtien.Enabled = false;
            }
            else
            {
                btnTinhtien.Enabled = true;
            }
        }
        private void reloadTotal(object sender, EventArgs e)
        {
            this.txtT_KH.Text = this.totalCustom.ToString();
            this.txtT_Money.Text = this.totlalMoney.ToString() + "VND";
        }
        private void btnNhapLai_Click(object sender, EventArgs e)
        {
            txtTen_KH.Text = "";
            txtSo_Kh.Text = "";
            totalCustom = 0;
            totlalMoney = 0;
            currentMoney = 0;
            reset();
            reloadTotal(sender, e);
            btnThanhToan.Enabled = false;
            btnNhapLai.Enabled = false;
        }
        private void chuongTrinhDaLoad(object sender, EventArgs e)
        {
            txtTen_KH.Focus();
            btnTinhtien.Enabled = false;
            btnThanhToan.Enabled = false;
            btnNhapLai.Enabled = false;
        }
        private void chuongTrinhChuaLoad(object sender, EventArgs e)
        {
            btnNhapLai.Enabled = false;
            btnThanhToan.Enabled = false;
            btnThoat.Enabled = false;
            btnTinhtien.Enabled = false;
        }
        private void reset()
        {
            txtTen_KH.Text = "";
            txtSo_Kh.Text = "";
            cb_Sv.Checked = false;
            rbCF_Den.Checked = false;
            rbCF_Sua.Checked = false;
            rbCF_SuaDa.Checked = false;
            rbCF_Da.Checked = false;
            rbCF_Kem.Checked = false;
            cbBM_Trung.Checked = false;
            cbBM_Ca.Checked = false;
            cbMT_Trung.Checked = false;
            cbMX_Bò.Checked = false;
            cbMyCay.Checked = false;
        }

        private void txtSo_Kh_KeyPress(object sender, KeyPressEventArgs e)
        {
            char c = e.KeyChar;
            if (c < '0' || c > '9')
            {
                if(c != 8)
                {
                    e.Handled = true;
                }
            }
        }

        private void btnTinhtien_Click(object sender, EventArgs e)
        {
            currentMoney = TinhTien(sender, e);
            if (currentMoney > (double)0)
            {
                MessageBox.Show("Tổng tiền : " + currentMoney.ToString() + "VND", "Thành công", MessageBoxButtons.OK, MessageBoxIcon.Error);
                btnNhapLai.Enabled = true;
                btnThanhToan.Enabled = true;
            }
            else
            {
                MessageBox.Show("Bạn chưa chọn món nào ", "Thất bại", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
        private double TinhTien(object sender, EventArgs e)
        {
            double total = 0;
            if (rbCF_Den.Checked)
            {
                total += 20000;
            }
            if (rbCF_Sua.Checked)
            {
                total += 25000;
            }
            if (rbCF_SuaDa.Checked)
            {
                total += 30000;
            }
            if (rbCF_Da.Checked)
            {
                total += 25000;
            }
            if (rbCF_Kem.Checked)
            {
                total += 35000;
            }
            if (cbBM_Trung.Checked)
            {
                total += 15000;
            }
            if (cbBM_Ca.Checked)
            {
                total += 15000;
            }
            if (cbMT_Trung.Checked)
            {
                total += 20000;
            }
            if (cbMX_Bò.Checked)
            {
                total += 30000;
            }
            if (cbMyCay.Checked)
            {
                total += 50000;
            }
            if (cb_Sv.Checked)
            {
                total = total * 0.8;
            }
            return total;
        }
        private void btnThoat_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Bạn có muốn thoát không ?", "Thoát", MessageBoxButtons.YesNo) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            btnTinhtien.Enabled = false;
            btnThanhToan.Enabled = false;
            btnNhapLai.Enabled = false;
            chuongTrinhDaLoad(sender, e);

        }

        private void btnThanhToan_Click(object sender, EventArgs e)
        {
            totalCustom += 1;
            totlalMoney += currentMoney;
            currentMoney = 0;
            reloadTotal(sender, e);
            reset();
            btnThanhToan.Enabled = false;
            btnNhapLai.Enabled = false;
        }
    }
}
