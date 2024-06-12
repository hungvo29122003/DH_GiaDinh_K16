namespace buoi4_treeView
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {

        }
        private bool kiemtra(String s)
        {
            for (int i = 0; i < treeView1.Nodes.Count; i++)
            {
                if (string.Compare(s, treeView1.Nodes[i].Text, true) == 0)
                {
                    return true;
                }
            }
            return false;

        }
        private void btnAddPB_Click(object sender, EventArgs e)
        {
            if (!kiemtra(txtPB.Text))
            {
                treeView1.Nodes.Add(txtPB.Text);
                cbPB.Items.Add(txtPB);
                txtPB.Text = string.Empty;
                txtPB.Focus();
            }
            else
            {
                MessageBox.Show("Trùng", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            string[] sp = { "Giám đốc", "Nhân viên", "Sales", "Thư kí" };
            foreach (string s in sp)
            {
                treeView1.Nodes.Add(s);
                cbPB.Items.Add(s);
            }
            cbPB.SelectedIndex = 0;
            treeView1.Nodes[0].Nodes.Add("Giám đốc MKT");
            treeView1.Nodes[0].Nodes.Add("Giám đốc bán hàng");
        }

        private void btnDeletePB_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("Bạn có muốn xóa không", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                if (treeView1.SelectedNode != null)
                {
                    cbPB.Items.Remove(treeView1.SelectedNode);
                    treeView1.Nodes.Remove(treeView1.SelectedNode);
                }
            }
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            int index = -1;
            foreach (TreeNode node in treeView1.Nodes)
            {
                if (node.Text == cbPB.Text)
                {
                    index = node.Index;
                    break;
                }
            }
            treeView1.Nodes[index].Nodes.Add(txtName.Text + "(" + txtMS.Text + ")" + "(" + txtDiachi.Text + ")");
            treeView1.ExpandAll();
        }

        private void btnExit_Click_1(object sender, EventArgs e)
        {
            if (MessageBox.Show("Ní có muốn thoát ", "Thông báo", MessageBoxButtons.YesNo, MessageBoxIcon.Warning) == DialogResult.Yes) {
                Application.Exit();
            }
        }
    }
}
