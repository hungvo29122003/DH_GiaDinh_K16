namespace Buoi3.checkbox_radioBTN
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
            lblTT = new Label();
            lbl_Name = new Label();
            lbl_Class = new Label();
            txt_Name = new TextBox();
            txt_Class = new TextBox();
            rb_Male = new RadioButton();
            rb_Female = new RadioButton();
            grb_Gender = new GroupBox();
            grb_Subject = new GroupBox();
            cb_ANM = new CheckBox();
            cb_LT_QL = new CheckBox();
            cb_LT_WEB = new CheckBox();
            cb_LTTQ = new CheckBox();
            btn_Save = new Button();
            btn_Exit = new Button();
            lst_tt = new ListBox();
            textBox1 = new TextBox();
            grb_Gender.SuspendLayout();
            grb_Subject.SuspendLayout();
            SuspendLayout();
            // 
            // lblTT
            // 
            lblTT.AutoSize = true;
            lblTT.Font = new Font("Segoe UI", 20.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblTT.Location = new Point(176, 25);
            lblTT.Name = "lblTT";
            lblTT.Size = new Size(264, 37);
            lblTT.TabIndex = 0;
            lblTT.Text = "Thông tin Sinh viên";
            // 
            // lbl_Name
            // 
            lbl_Name.AutoSize = true;
            lbl_Name.Location = new Point(59, 101);
            lbl_Name.Name = "lbl_Name";
            lbl_Name.Size = new Size(67, 15);
            lbl_Name.TabIndex = 1;
            lbl_Name.Text = "Họ và tên : ";
            lbl_Name.Click += lbl_Name_Click;
            // 
            // lbl_Class
            // 
            lbl_Class.AutoSize = true;
            lbl_Class.Location = new Point(59, 148);
            lbl_Class.Name = "lbl_Class";
            lbl_Class.Size = new Size(36, 15);
            lbl_Class.TabIndex = 2;
            lbl_Class.Text = "Lớp : ";
            lbl_Class.Click += lbl_Class_Click;
            // 
            // txt_Name
            // 
            txt_Name.Location = new Point(153, 98);
            txt_Name.Name = "txt_Name";
            txt_Name.Size = new Size(222, 23);
            txt_Name.TabIndex = 3;
            txt_Name.TextChanged += txt_Name_TextChanged;
            // 
            // txt_Class
            // 
            txt_Class.Location = new Point(153, 145);
            txt_Class.Name = "txt_Class";
            txt_Class.Size = new Size(222, 23);
            txt_Class.TabIndex = 4;
            // 
            // rb_Male
            // 
            rb_Male.AutoSize = true;
            rb_Male.Checked = true;
            rb_Male.Location = new Point(53, 40);
            rb_Male.Name = "rb_Male";
            rb_Male.Size = new Size(51, 19);
            rb_Male.TabIndex = 5;
            rb_Male.TabStop = true;
            rb_Male.Text = "Nam";
            rb_Male.UseVisualStyleBackColor = true;
            // 
            // rb_Female
            // 
            rb_Female.AutoSize = true;
            rb_Female.Location = new Point(162, 40);
            rb_Female.Name = "rb_Female";
            rb_Female.Size = new Size(41, 19);
            rb_Female.TabIndex = 6;
            rb_Female.Text = "Nữ";
            rb_Female.UseVisualStyleBackColor = true;
            // 
            // grb_Gender
            // 
            grb_Gender.Controls.Add(rb_Male);
            grb_Gender.Controls.Add(rb_Female);
            grb_Gender.Location = new Point(123, 198);
            grb_Gender.Name = "grb_Gender";
            grb_Gender.Size = new Size(252, 100);
            grb_Gender.TabIndex = 7;
            grb_Gender.TabStop = false;
            grb_Gender.Text = "Giới tính";
            // 
            // grb_Subject
            // 
            grb_Subject.Controls.Add(cb_ANM);
            grb_Subject.Controls.Add(cb_LT_QL);
            grb_Subject.Controls.Add(cb_LT_WEB);
            grb_Subject.Controls.Add(cb_LTTQ);
            grb_Subject.Location = new Point(59, 333);
            grb_Subject.Name = "grb_Subject";
            grb_Subject.Size = new Size(364, 221);
            grb_Subject.TabIndex = 8;
            grb_Subject.TabStop = false;
            grb_Subject.Text = "Danh sách các môn học tự chọn ";
            // 
            // cb_ANM
            // 
            cb_ANM.AutoSize = true;
            cb_ANM.Location = new Point(94, 186);
            cb_ANM.Name = "cb_ANM";
            cb_ANM.Size = new Size(102, 19);
            cb_ANM.TabIndex = 3;
            cb_ANM.Text = "An ninh mạng";
            cb_ANM.UseVisualStyleBackColor = true;
            // 
            // cb_LT_QL
            // 
            cb_LT_QL.AutoSize = true;
            cb_LT_QL.Location = new Point(94, 143);
            cb_LT_QL.Name = "cb_LT_QL";
            cb_LT_QL.Size = new Size(115, 19);
            cb_LT_QL.TabIndex = 2;
            cb_LT_QL.Text = "Lập trình quản lý";
            cb_LT_QL.UseVisualStyleBackColor = true;
            // 
            // cb_LT_WEB
            // 
            cb_LT_WEB.AutoSize = true;
            cb_LT_WEB.Location = new Point(94, 98);
            cb_LT_WEB.Name = "cb_LT_WEB";
            cb_LT_WEB.Size = new Size(118, 19);
            cb_LT_WEB.TabIndex = 1;
            cb_LT_WEB.Text = "Lập trình Website";
            cb_LT_WEB.UseVisualStyleBackColor = true;
            // 
            // cb_LTTQ
            // 
            cb_LTTQ.AutoSize = true;
            cb_LTTQ.Location = new Point(94, 54);
            cb_LTTQ.Name = "cb_LTTQ";
            cb_LTTQ.Size = new Size(130, 19);
            cb_LTTQ.TabIndex = 0;
            cb_LTTQ.Text = "Lập trình trực quan ";
            cb_LTTQ.UseVisualStyleBackColor = true;
            // 
            // btn_Save
            // 
            btn_Save.Location = new Point(123, 591);
            btn_Save.Name = "btn_Save";
            btn_Save.Size = new Size(75, 23);
            btn_Save.TabIndex = 9;
            btn_Save.Text = "Lưu";
            btn_Save.UseVisualStyleBackColor = true;
            btn_Save.Click += btn_Save_Click;
            // 
            // btn_Exit
            // 
            btn_Exit.Location = new Point(266, 591);
            btn_Exit.Name = "btn_Exit";
            btn_Exit.Size = new Size(75, 23);
            btn_Exit.TabIndex = 10;
            btn_Exit.Text = "Thoát";
            btn_Exit.UseVisualStyleBackColor = true;
            btn_Exit.Click += btn_Exit_Click;
            // 
            // lst_tt
            // 
            lst_tt.FormattingEnabled = true;
            lst_tt.ItemHeight = 15;
            lst_tt.Location = new Point(462, 74);
            lst_tt.Name = "lst_tt";
            lst_tt.Size = new Size(357, 349);
            lst_tt.TabIndex = 11;
            lst_tt.SelectedIndexChanged += lst_tt_SelectedIndexChanged;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(874, 74);
            textBox1.Multiline = true;
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(352, 349);
            textBox1.TabIndex = 12;
            textBox1.TextChanged += textBox1_TextChanged;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1303, 626);
            Controls.Add(textBox1);
            Controls.Add(lst_tt);
            Controls.Add(btn_Exit);
            Controls.Add(btn_Save);
            Controls.Add(grb_Subject);
            Controls.Add(grb_Gender);
            Controls.Add(txt_Class);
            Controls.Add(txt_Name);
            Controls.Add(lbl_Class);
            Controls.Add(lbl_Name);
            Controls.Add(lblTT);
            Name = "Form1";
            Text = "Form1";
            grb_Gender.ResumeLayout(false);
            grb_Gender.PerformLayout();
            grb_Subject.ResumeLayout(false);
            grb_Subject.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label lblTT;
        private Label lbl_Name;
        private Label lbl_Class;
        private TextBox txt_Name;
        private TextBox txt_Class;
        private RadioButton rb_Male;
        private RadioButton rb_Female;
        private GroupBox grb_Gender;
        private GroupBox grb_Subject;
        private CheckBox cb_LT_QL;
        private CheckBox cb_LT_WEB;
        private CheckBox cb_LTTQ;
        private CheckBox cb_ANM;
        private Button btn_Save;
        private Button btn_Exit;
        private ListBox lst_tt;
        private TextBox textBox1;
    }
}
