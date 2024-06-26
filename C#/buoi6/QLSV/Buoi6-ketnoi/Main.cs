using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Buoi6_ketnoi
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
    }
}
