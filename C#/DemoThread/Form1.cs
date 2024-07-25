using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DemoThread
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
   
        private void btn_click_Click(object sender, EventArgs e)
        {
            Thread th = new Thread(() =>
            {
                for (int i = 0; i < Convert.ToInt32(textBox1.Text); i++)
                {
                    label1.Text = i.ToString();
                }
            })
            {  IsBackground = true};
            th.Start();
        }
    }
}
