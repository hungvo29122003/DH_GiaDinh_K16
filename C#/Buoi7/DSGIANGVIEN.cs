using Buoi7;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Buoi7
{
    public partial class DSGIANGVIEN : Form
    {
        ketnoi connect = new ketnoi();
        public DSGIANGVIEN()
        {
            InitializeComponent();
        }

        private void DSGiangVien_Load(object sender, EventArgs e)
        {
            string qr = "Select tencoso from COSO ";
            DataTable dt = connect.Execute(qr);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    cb_Co_So.Items.Add(dt.Rows[i][0].ToString());
                }
            }
        }

        private void menuXoa_Click(object sender, EventArgs e)
        {

            int index = dataGridView1.CurrentRow.Index;
            string magv = dataGridView1.Rows[index].Cells[0].Value.ToString();
            if (MessageBox.Show("Bạn muốn xoá " + magv + " không?", "Thông bao", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                string qr = "DELETE * FROM GIANGVIEN WHERE magv = " + magv;
                connect.ExecuteNonQuery(qr);
                MessageBox.Show("Đã xoá");
            }

        }

        private void cb_Co_So_SelectedIndexChanged(object sender, EventArgs e)
        {
            string tencoso = cb_Co_So.Text;
            string qr = "Select tendonvi " +
                "from COSO join DONVI on DONVI.macoso = COSO.macoso " +
                "Where COSO.tencoso = N'" + tencoso + "'";
            DataTable dt = connect.Execute(qr);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    cb_Don_Vi.Items.Add(dt.Rows[i][0].ToString());
                }
            }
        }

        private void cb_Don_Vi_SelectedIndexChanged(object sender, EventArgs e)
        {
            string tendonvi = cb_Don_Vi.Text;
            string qr = "Select *" +
               " FROM GIANGVIEN AS G join DONVI AS D on D.madonvi = G.madonvi " +
                "WHERE D.tendonvi = N'" + tendonvi + "'";
            DataTable dt = connect.Execute(qr);
            dataGridView1.DataSource = dt;
        }

        private void DSGIANGVIEN_Load_1(object sender, EventArgs e)
        {
            string qr = "Select tencoso from COSO ";
            DataTable dt = connect.Execute(qr);
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    cb_Co_So.Items.Add(dt.Rows[i][0].ToString());
                }
            }
        }
    }
}