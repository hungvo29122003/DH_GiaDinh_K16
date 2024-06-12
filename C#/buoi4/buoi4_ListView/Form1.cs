namespace buoi4_ListView
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            String[] sv = { "001", "Nguyễn Văn A" };
            ListViewItem list = new ListViewItem(sv);
            ListViewSV.Items.Add(list);
        }

        private void btn_Add_Click(object sender, EventArgs e)
        {
            String[] sv = { txt_MASV.Text, txt_Name.Text };
            ListViewItem list = new ListViewItem(sv);
            ListViewSV.Items.Add(list);
        }

        private void btn_Delete_Click(object sender, EventArgs e)
        {
            foreach (ListViewItem item in ListViewSV.SelectedItems)
            {
                item.Remove();
            }
        }

        private void btn_Sua_Click(object sender, EventArgs e)
        {
            if(ListViewSV.FocusedItem != null && ListViewSV.FocusedItem.Index >= 0)
            {
                ListViewItem item = ListViewSV.FocusedItem;
                item.SubItems[0].Text = txt_MASV.Text;
                item.SubItems[1].Text = txt_Name.Text;
            } 
        }

        private void ListViewSV_Click(object sender, EventArgs e)
        {
            if(ListViewSV.SelectedItems.Count > 0)
            {
                txt_Name.Text = ListViewSV.SelectedItems[0].Text;
                txt_MASV.Text = ListViewSV.SelectedItems[0].Text;
            }
        }
    }
}
