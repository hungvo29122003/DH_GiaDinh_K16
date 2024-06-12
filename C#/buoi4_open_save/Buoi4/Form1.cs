
namespace Buoi4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_Open_Click(object sender, EventArgs e)
        { // cach 1 
          // openFileDialog1.Filter = "ALL text files | *.txt";
          //if (openFileDialog1.ShowDialog() == DialogResult.OK)
          //{
          //  String fileName = openFileDialog1.FileName;
          //    MessageBox.Show(fileName);
          //    StreamReader sr = new StreamReader(fileName);
          //    textBox1.Text = sr.ReadToEnd();
          //    sr.Close();
          //}
            OpenFileDialog open = new OpenFileDialog();
            open.Filter = "ALL text files (*.txt) | *.txt";
            if (open.ShowDialog() == DialogResult.OK)
            {
                String fileName = open.FileName;
                StreamReader sr = new StreamReader(fileName);
                textBox1.Text = sr.ReadToEnd();
                sr.Close();
                this.Text = fileName;
            }
        }

        private void btn_Save_Click(object sender, EventArgs e)
        {
            /* cach 1
             * SaveFileDialog save = new SaveFileDialog();
             save.Filter = "ALL tetxt files (*.txt) | *.txt";
             if(save.ShowDialog() == DialogResult.OK)
             {
                 String fileName = save.FileName;
                 StreamWriter sw = new StreamWriter(fileName);
                 sw.Write(textBox1.Text);
                 sw.Close();
                 MessageBox.Show("Đã lưu thành công ! ");
             } */
            // cach 2
            saveFileDialog1.Filter = "ALL text files (*.txt) | *.txt";
            if (saveFileDialog1.ShowDialog() == DialogResult.OK)
            {
                String fileName = saveFileDialog1.FileName;
                StreamWriter sw = new StreamWriter(fileName);
                sw.Write(textBox1.Text);
                sw.Close();
                MessageBox.Show("Đã lưu thành công ");
            }

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            DateTime toDay = DateTime.Now;
            label1.Text = toDay.ToString();
        }
    }
}
