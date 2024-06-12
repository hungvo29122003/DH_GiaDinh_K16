using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Buoi2.TongHop
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            String a = txt_Add_SP1.Text;
            list_DS_SP.Items.Add(a);
        }

        private void lbl_ViTri_Click(object sender, EventArgs e)
        {

        }
        private void txt_Add_SP2_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_Add_SP_Vitri_Click(object sender, EventArgs e)
        {
            String a = txt_Add_SP2.Text;


        }

        private void comboBox_Vitri_SelectedIndexChanged(object sender, EventArgs e)
        {
            comboBox_Vitri.Items.Clear();
            int VT = list_DS_SP.Items.Count;
            for (int i = 0; i < VT; i++)
            {
                comboBox_Vitri.Items.Add(i.ToString());
            }
        }
    }
}
