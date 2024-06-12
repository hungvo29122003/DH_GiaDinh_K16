namespace buoi4_ListView
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
            ListViewSV = new ListView();
            CL_MASV = new ColumnHeader();
            CL_Name = new ColumnHeader();
            btn_Add = new Button();
            btn_Delete = new Button();
            btn_Sua = new Button();
            label1 = new Label();
            label2 = new Label();
            txt_MASV = new TextBox();
            txt_Name = new TextBox();
            SuspendLayout();
            // 
            // ListViewSV
            // 
            ListViewSV.Columns.AddRange(new ColumnHeader[] { CL_MASV, CL_Name });
            ListViewSV.FullRowSelect = true;
            ListViewSV.GridLines = true;
            ListViewSV.Location = new Point(158, 139);
            ListViewSV.Name = "ListViewSV";
            ListViewSV.Size = new Size(483, 319);
            ListViewSV.TabIndex = 0;
            ListViewSV.UseCompatibleStateImageBehavior = false;
            ListViewSV.View = View.Details;
            ListViewSV.Click += ListViewSV_Click;
            // 
            // CL_MASV
            // 
            CL_MASV.Text = "MÃ SV";
            CL_MASV.Width = 200;
            // 
            // CL_Name
            // 
            CL_Name.Text = "Họ và tên ";
            CL_Name.Width = 200;
            // 
            // btn_Add
            // 
            btn_Add.Location = new Point(38, 30);
            btn_Add.Name = "btn_Add";
            btn_Add.Size = new Size(152, 23);
            btn_Add.TabIndex = 1;
            btn_Add.Text = "Thêm";
            btn_Add.UseVisualStyleBackColor = true;
            btn_Add.Click += btn_Add_Click;
            // 
            // btn_Delete
            // 
            btn_Delete.Location = new Point(288, 30);
            btn_Delete.Name = "btn_Delete";
            btn_Delete.Size = new Size(164, 23);
            btn_Delete.TabIndex = 2;
            btn_Delete.Text = "Xóa";
            btn_Delete.UseVisualStyleBackColor = true;
            btn_Delete.Click += btn_Delete_Click;
            // 
            // btn_Sua
            // 
            btn_Sua.Location = new Point(533, 30);
            btn_Sua.Name = "btn_Sua";
            btn_Sua.Size = new Size(163, 23);
            btn_Sua.TabIndex = 3;
            btn_Sua.Text = "Sửa";
            btn_Sua.UseVisualStyleBackColor = true;
            btn_Sua.Click += btn_Sua_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(158, 76);
            label1.Name = "label1";
            label1.Size = new Size(38, 15);
            label1.TabIndex = 4;
            label1.Text = "Mã sv";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(158, 108);
            label2.Name = "label2";
            label2.Size = new Size(58, 15);
            label2.TabIndex = 5;
            label2.Text = "Họ và tên";
            // 
            // txt_MASV
            // 
            txt_MASV.Location = new Point(227, 68);
            txt_MASV.Name = "txt_MASV";
            txt_MASV.Size = new Size(225, 23);
            txt_MASV.TabIndex = 6;
            // 
            // txt_Name
            // 
            txt_Name.Location = new Point(227, 100);
            txt_Name.Name = "txt_Name";
            txt_Name.Size = new Size(225, 23);
            txt_Name.TabIndex = 7;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 509);
            Controls.Add(txt_Name);
            Controls.Add(txt_MASV);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(btn_Sua);
            Controls.Add(btn_Delete);
            Controls.Add(btn_Add);
            Controls.Add(ListViewSV);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private ListView ListViewSV;
        private ColumnHeader CL_MASV;
        private ColumnHeader CL_Name;
        private Button btn_Add;
        private Button btn_Delete;
        private Button btn_Sua;
        private Label label1;
        private Label label2;
        private TextBox txt_MASV;
        private TextBox txt_Name;
    }
}
