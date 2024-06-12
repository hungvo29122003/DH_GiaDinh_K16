using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Buoi2.listbox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            String str = "";
            foreach (String item in listBox1.SelectedItems)
            {
                str = str + item + "\n ";
            }
            MessageBox.Show(str);
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btn2_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void listBox_Load_SelectedIndexChanged(object sender, EventArgs e)
        {
            listBox1.Sorted = true;
            listBox1.Items.Clear();
            listBox1.Items.Add("Võ Phi Hùng");
            listBox1.Items.Add("Không biết nữa");


        }

        private void button1_Click(object sender, EventArgs e)
        {
            listBox1.Sorted = true;
            listBox1.Items.Clear();
            listBox1.Items.Add(textBox1.Text);
        }
    }
}
