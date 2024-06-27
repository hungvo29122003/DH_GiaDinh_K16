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

        private void DsLop_Click(object sender, EventArgs e)
        {
            DSLop dslop = new DSLop();
            dslop.ShowDialog();
        }

        private void thoátToolStripMenuItem_Click(object sender, EventArgs e)
        {
           if(MessageBox.Show("bạn có chắn muốn thoát ! ", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
