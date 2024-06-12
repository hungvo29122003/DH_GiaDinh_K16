namespace Buoi4
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            btn_Open = new Button();
            btn_Save = new Button();
            openFileDialog1 = new OpenFileDialog();
            textBox1 = new TextBox();
            saveFileDialog1 = new SaveFileDialog();
            timer1 = new System.Windows.Forms.Timer(components);
            label1 = new Label();
            SuspendLayout();
            // 
            // btn_Open
            // 
            btn_Open.Font = new Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, 0);
            btn_Open.Location = new Point(45, 31);
            btn_Open.Name = "btn_Open";
            btn_Open.Size = new Size(89, 29);
            btn_Open.TabIndex = 0;
            btn_Open.Text = "Open";
            btn_Open.UseVisualStyleBackColor = true;
            btn_Open.Click += btn_Open_Click;
            // 
            // btn_Save
            // 
            btn_Save.Font = new Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, 0);
            btn_Save.Location = new Point(221, 31);
            btn_Save.Name = "btn_Save";
            btn_Save.Size = new Size(93, 29);
            btn_Save.TabIndex = 1;
            btn_Save.Text = "Save";
            btn_Save.UseVisualStyleBackColor = true;
            btn_Save.Click += btn_Save_Click;
            // 
            // openFileDialog1
            // 
            openFileDialog1.FileName = "openFileDialog1";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(26, 100);
            textBox1.Multiline = true;
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(762, 317);
            textBox1.TabIndex = 2;
            // 
            // timer1
            // 
            timer1.Enabled = true;
            timer1.Interval = 1000;
            timer1.Tick += timer1_Tick;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point, 0);
            label1.Location = new Point(511, 42);
            label1.Name = "label1";
            label1.Size = new Size(50, 20);
            label1.TabIndex = 3;
            label1.Text = "label1";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label1);
            Controls.Add(textBox1);
            Controls.Add(btn_Save);
            Controls.Add(btn_Open);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button btn_Open;
        private Button btn_Save;
        private OpenFileDialog openFileDialog1;
        private TextBox textBox1;
        private SaveFileDialog saveFileDialog1;
        private System.Windows.Forms.Timer timer1;
        private Label label1;
    }
}
