using buoi6;
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
    public partial class DSLop : Form
    {
        ketnoi ketnoi = new ketnoi();
        public DSLop()
        {
            InitializeComponent();
        }
        public void loadData()
        {
            String qr = "Select *  From LOP";
            dataGridView1.DataSource = ketnoi.Execute(qr);
        }
        private void DSLop_Load(object sender, EventArgs e)
        {
            txt_add_TenLOP.Text = "";
           loadData();
        }

        private void btn_add_Click(object sender, EventArgs e)
        {
            String query = "INSERT INTO LOP VALUES (N'" + txt_add_TenLOP.Text + "')";
            ketnoi.ExecuteNonQuery(query);
            loadData();
        }

        private void btn_Delete_Click(object sender, EventArgs e)
        {
            int id = 0;
            int index = dataGridView1.CurrentRow.Index;
            id = Convert.ToInt32( dataGridView1.Rows[index].Cells[0].Value);
            String query = "DELETE FROM LOP WHERE Malop = " + id;
            ketnoi.ExecuteNonQuery(query);
            loadData();
        }
    }
}
