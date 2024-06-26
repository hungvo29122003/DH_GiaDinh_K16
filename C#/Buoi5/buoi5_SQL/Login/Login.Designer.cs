namespace Login
{
    partial class Login
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.lbl_User = new System.Windows.Forms.Label();
            this.lbl_Pass = new System.Windows.Forms.Label();
            this.lbl_Type = new System.Windows.Forms.Label();
            this.txtName = new System.Windows.Forms.TextBox();
            this.txt_Pass = new System.Windows.Forms.TextBox();
            this.txt_Type = new System.Windows.Forms.TextBox();
            this.cb_ShowPass = new System.Windows.Forms.CheckBox();
            this.btn_Add = new System.Windows.Forms.Button();
            this.btn_Delete = new System.Windows.Forms.Button();
            this.btn_Login = new System.Windows.Forms.Button();
            this.btn_Sua = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(12, 2);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(654, 229);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // lbl_User
            // 
            this.lbl_User.AutoSize = true;
            this.lbl_User.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_User.Location = new System.Drawing.Point(84, 264);
            this.lbl_User.Name = "lbl_User";
            this.lbl_User.Size = new System.Drawing.Size(83, 20);
            this.lbl_User.TabIndex = 2;
            this.lbl_User.Text = "Username";
            // 
            // lbl_Pass
            // 
            this.lbl_Pass.AutoSize = true;
            this.lbl_Pass.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Pass.Location = new System.Drawing.Point(84, 313);
            this.lbl_Pass.Name = "lbl_Pass";
            this.lbl_Pass.Size = new System.Drawing.Size(75, 20);
            this.lbl_Pass.TabIndex = 3;
            this.lbl_Pass.Text = "Mật khẩu";
            // 
            // lbl_Type
            // 
            this.lbl_Type.AutoSize = true;
            this.lbl_Type.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Type.Location = new System.Drawing.Point(84, 359);
            this.lbl_Type.Name = "lbl_Type";
            this.lbl_Type.Size = new System.Drawing.Size(43, 20);
            this.lbl_Type.TabIndex = 4;
            this.lbl_Type.Text = "Type";
            // 
            // txtName
            // 
            this.txtName.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtName.Location = new System.Drawing.Point(218, 258);
            this.txtName.Name = "txtName";
            this.txtName.Size = new System.Drawing.Size(192, 26);
            this.txtName.TabIndex = 5;
            // 
            // txt_Pass
            // 
            this.txt_Pass.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Pass.Location = new System.Drawing.Point(218, 307);
            this.txt_Pass.Name = "txt_Pass";
            this.txt_Pass.Size = new System.Drawing.Size(192, 26);
            this.txt_Pass.TabIndex = 6;
            this.txt_Pass.TextChanged += new System.EventHandler(this.txt_Pass_TextChanged);
            // 
            // txt_Type
            // 
            this.txt_Type.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Type.Location = new System.Drawing.Point(218, 353);
            this.txt_Type.Name = "txt_Type";
            this.txt_Type.Size = new System.Drawing.Size(192, 26);
            this.txt_Type.TabIndex = 7;
            // 
            // cb_ShowPass
            // 
            this.cb_ShowPass.AutoSize = true;
            this.cb_ShowPass.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cb_ShowPass.Location = new System.Drawing.Point(218, 406);
            this.cb_ShowPass.Name = "cb_ShowPass";
            this.cb_ShowPass.Size = new System.Drawing.Size(131, 24);
            this.cb_ShowPass.TabIndex = 8;
            this.cb_ShowPass.Text = "Hiện mật khẩu";
            this.cb_ShowPass.UseVisualStyleBackColor = true;
            this.cb_ShowPass.CheckedChanged += new System.EventHandler(this.cb_ShowPass_CheckedChanged);
            // 
            // btn_Add
            // 
            this.btn_Add.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Add.Location = new System.Drawing.Point(517, 260);
            this.btn_Add.Name = "btn_Add";
            this.btn_Add.Size = new System.Drawing.Size(115, 41);
            this.btn_Add.TabIndex = 9;
            this.btn_Add.Text = "Thêm";
            this.btn_Add.UseVisualStyleBackColor = true;
            this.btn_Add.Click += new System.EventHandler(this.btn_Add_Click);
            // 
            // btn_Delete
            // 
            this.btn_Delete.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Delete.Location = new System.Drawing.Point(517, 353);
            this.btn_Delete.Name = "btn_Delete";
            this.btn_Delete.Size = new System.Drawing.Size(115, 38);
            this.btn_Delete.TabIndex = 10;
            this.btn_Delete.Text = "Xóa";
            this.btn_Delete.UseVisualStyleBackColor = true;
            this.btn_Delete.Click += new System.EventHandler(this.btn_Delete_Click);
            // 
            // btn_Login
            // 
            this.btn_Login.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Login.Location = new System.Drawing.Point(517, 307);
            this.btn_Login.Name = "btn_Login";
            this.btn_Login.Size = new System.Drawing.Size(115, 40);
            this.btn_Login.TabIndex = 11;
            this.btn_Login.Text = "Đăng nhập";
            this.btn_Login.UseVisualStyleBackColor = true;
            this.btn_Login.Click += new System.EventHandler(this.btn_Login_Click);
            // 
            // btn_Sua
            // 
            this.btn_Sua.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Sua.Location = new System.Drawing.Point(517, 397);
            this.btn_Sua.Name = "btn_Sua";
            this.btn_Sua.Size = new System.Drawing.Size(115, 42);
            this.btn_Sua.TabIndex = 12;
            this.btn_Sua.Text = "Sửa";
            this.btn_Sua.UseVisualStyleBackColor = true;
            this.btn_Sua.Click += new System.EventHandler(this.btn_Sua_Click);
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(670, 450);
            this.Controls.Add(this.btn_Sua);
            this.Controls.Add(this.btn_Login);
            this.Controls.Add(this.btn_Delete);
            this.Controls.Add(this.btn_Add);
            this.Controls.Add(this.cb_ShowPass);
            this.Controls.Add(this.txt_Type);
            this.Controls.Add(this.txt_Pass);
            this.Controls.Add(this.txtName);
            this.Controls.Add(this.lbl_Type);
            this.Controls.Add(this.lbl_Pass);
            this.Controls.Add(this.lbl_User);
            this.Controls.Add(this.dataGridView1);
            this.Name = "Login";
            this.Text = "Login";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Label lbl_User;
        private System.Windows.Forms.Label lbl_Pass;
        private System.Windows.Forms.Label lbl_Type;
        private System.Windows.Forms.TextBox txtName;
        private System.Windows.Forms.TextBox txt_Pass;
        private System.Windows.Forms.TextBox txt_Type;
        private System.Windows.Forms.CheckBox cb_ShowPass;
        private System.Windows.Forms.Button btn_Add;
        private System.Windows.Forms.Button btn_Delete;
        private System.Windows.Forms.Button btn_Login;
        private System.Windows.Forms.Button btn_Sua;
    }
}

