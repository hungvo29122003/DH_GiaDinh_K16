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
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();

        }
        private void DS_lop_Click(object sender, EventArgs e)
        {
            DSLop ds_lop = new DSLop(this);
            ds_lop.Show();
            this.Hide();
        }

        private void exit_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("bạn có chắn muốn thoát ! ", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }

        private void DS_SV_Click(object sender, EventArgs e)
        {
            DSSv dssv = new DSSv(this);
            dssv.Show();
            this.Hide();
        }

        private void DS_Monhoc_Click(object sender, EventArgs e)
        {
            DSMON_HOC dsMonHoc = new DSMON_HOC(this);
            dsMonHoc.Show();
            this.Hide();

        }
    }
}
