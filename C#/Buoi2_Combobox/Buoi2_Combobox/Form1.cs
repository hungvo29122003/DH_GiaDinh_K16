using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Buoi2_Combobox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_TH_Click(object sender, EventArgs e)
        {
            if(comboBox_Color.Text == "Xanh")
            {
                lbl1.ForeColor = Color.Blue;
            }
            if(comboBox_Color.Text == "Đỏ")
            {
                lbl1.ForeColor = Color.Red;
            }
            if(comboBox_Color.Text == "Tím")
            {
                lbl1.ForeColor = Color.Purple;
            }
            if (comboBox_Color.Text == "Vàng")
            {
                lbl1.ForeColor = Color.Yellow;
            }
            if(comboBox_FontSize.Text == "10")
            {
                lbl1.Font = new Font("Segoe UI", 10);
            }
            if(comboBox_FontSize.Text == "14")
                {
                lbl1.Font = new Font("Segoe UIl", 14);
            }
            if(comboBox_FontSize.Text == "16")
            {
                lbl1.Font = new Font("Segoe UIl", 16);
            }
            if(comboBox_FontSize.Text == "18")
            {
                lbl1.Font = new Font("Segoe UI", 18);
            }    
        }

        private void comboBox_FontSize_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void comboBox_Color_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
