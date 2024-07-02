namespace QLSV
{
    partial class DSSv
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
            this.lbl_SV = new System.Windows.Forms.Label();
            this.lbl_Ten_SV = new System.Windows.Forms.Label();
            this.lb_GioiTinh = new System.Windows.Forms.Label();
            this.lbl_SDT = new System.Windows.Forms.Label();
            this.lbl_MaLop = new System.Windows.Forms.Label();
            this.txt_Ma_SV = new System.Windows.Forms.TextBox();
            this.txt_TenSV = new System.Windows.Forms.TextBox();
            this.CB_Gioi_Tinh = new System.Windows.Forms.ComboBox();
            this.txt_SDT = new System.Windows.Forms.TextBox();
            this.txt_MaLop = new System.Windows.Forms.TextBox();
            this.btn_Add = new System.Windows.Forms.Button();
            this.btn_Delete = new System.Windows.Forms.Button();
            this.btn_Sua = new System.Windows.Forms.Button();
            this.btn_Exit = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(-2, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(802, 234);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // lbl_SV
            // 
            this.lbl_SV.AutoSize = true;
            this.lbl_SV.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_SV.Location = new System.Drawing.Point(72, 280);
            this.lbl_SV.Name = "lbl_SV";
            this.lbl_SV.Size = new System.Drawing.Size(53, 20);
            this.lbl_SV.TabIndex = 1;
            this.lbl_SV.Text = "MaSV";
            // 
            // lbl_Ten_SV
            // 
            this.lbl_Ten_SV.AutoSize = true;
            this.lbl_Ten_SV.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Ten_SV.Location = new System.Drawing.Point(72, 387);
            this.lbl_Ten_SV.Name = "lbl_Ten_SV";
            this.lbl_Ten_SV.Size = new System.Drawing.Size(58, 20);
            this.lbl_Ten_SV.TabIndex = 2;
            this.lbl_Ten_SV.Text = "TenSV";
            // 
            // lb_GioiTinh
            // 
            this.lb_GioiTinh.AutoSize = true;
            this.lb_GioiTinh.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lb_GioiTinh.Location = new System.Drawing.Point(80, 471);
            this.lb_GioiTinh.Name = "lb_GioiTinh";
            this.lb_GioiTinh.Size = new System.Drawing.Size(40, 20);
            this.lb_GioiTinh.TabIndex = 3;
            this.lb_GioiTinh.Text = "Phái";
            // 
            // lbl_SDT
            // 
            this.lbl_SDT.AutoSize = true;
            this.lbl_SDT.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_SDT.Location = new System.Drawing.Point(339, 280);
            this.lbl_SDT.Name = "lbl_SDT";
            this.lbl_SDT.Size = new System.Drawing.Size(41, 20);
            this.lbl_SDT.TabIndex = 4;
            this.lbl_SDT.Text = "SDT";
            // 
            // lbl_MaLop
            // 
            this.lbl_MaLop.AutoSize = true;
            this.lbl_MaLop.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_MaLop.Location = new System.Drawing.Point(339, 387);
            this.lbl_MaLop.Name = "lbl_MaLop";
            this.lbl_MaLop.Size = new System.Drawing.Size(62, 20);
            this.lbl_MaLop.TabIndex = 5;
            this.lbl_MaLop.Text = "Mã Lớp";
            // 
            // txt_Ma_SV
            // 
            this.txt_Ma_SV.BackColor = System.Drawing.Color.Gainsboro;
            this.txt_Ma_SV.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Ma_SV.Location = new System.Drawing.Point(138, 280);
            this.txt_Ma_SV.Name = "txt_Ma_SV";
            this.txt_Ma_SV.Size = new System.Drawing.Size(144, 26);
            this.txt_Ma_SV.TabIndex = 6;
            // 
            // txt_TenSV
            // 
            this.txt_TenSV.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_TenSV.Location = new System.Drawing.Point(138, 387);
            this.txt_TenSV.Name = "txt_TenSV";
            this.txt_TenSV.Size = new System.Drawing.Size(195, 26);
            this.txt_TenSV.TabIndex = 7;
            // 
            // CB_Gioi_Tinh
            // 
            this.CB_Gioi_Tinh.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.CB_Gioi_Tinh.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_Gioi_Tinh.FormattingEnabled = true;
            this.CB_Gioi_Tinh.Location = new System.Drawing.Point(146, 462);
            this.CB_Gioi_Tinh.Name = "CB_Gioi_Tinh";
            this.CB_Gioi_Tinh.Size = new System.Drawing.Size(122, 28);
            this.CB_Gioi_Tinh.TabIndex = 8;
            // 
            // txt_SDT
            // 
            this.txt_SDT.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_SDT.Location = new System.Drawing.Point(416, 279);
            this.txt_SDT.Name = "txt_SDT";
            this.txt_SDT.Size = new System.Drawing.Size(132, 26);
            this.txt_SDT.TabIndex = 9;
            // 
            // txt_MaLop
            // 
            this.txt_MaLop.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_MaLop.Location = new System.Drawing.Point(416, 387);
            this.txt_MaLop.Name = "txt_MaLop";
            this.txt_MaLop.Size = new System.Drawing.Size(132, 26);
            this.txt_MaLop.TabIndex = 10;
            // 
            // btn_Add
            // 
            this.btn_Add.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Add.Location = new System.Drawing.Point(633, 280);
            this.btn_Add.Name = "btn_Add";
            this.btn_Add.Size = new System.Drawing.Size(121, 36);
            this.btn_Add.TabIndex = 11;
            this.btn_Add.Text = "Thêm";
            this.btn_Add.UseVisualStyleBackColor = true;
            this.btn_Add.Click += new System.EventHandler(this.btn_Add_Click);
            // 
            // btn_Delete
            // 
            this.btn_Delete.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Delete.Location = new System.Drawing.Point(633, 342);
            this.btn_Delete.Name = "btn_Delete";
            this.btn_Delete.Size = new System.Drawing.Size(121, 36);
            this.btn_Delete.TabIndex = 12;
            this.btn_Delete.Text = "Xóa";
            this.btn_Delete.UseVisualStyleBackColor = true;
            this.btn_Delete.Click += new System.EventHandler(this.btn_Delete_Click);
            // 
            // btn_Sua
            // 
            this.btn_Sua.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Sua.Location = new System.Drawing.Point(633, 400);
            this.btn_Sua.Name = "btn_Sua";
            this.btn_Sua.Size = new System.Drawing.Size(121, 36);
            this.btn_Sua.TabIndex = 13;
            this.btn_Sua.Text = "Sữa";
            this.btn_Sua.UseVisualStyleBackColor = true;
            this.btn_Sua.Click += new System.EventHandler(this.btn_Sua_Click);
            // 
            // btn_Exit
            // 
            this.btn_Exit.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Exit.Location = new System.Drawing.Point(633, 457);
            this.btn_Exit.Name = "btn_Exit";
            this.btn_Exit.Size = new System.Drawing.Size(121, 36);
            this.btn_Exit.TabIndex = 14;
            this.btn_Exit.Text = "Thoát";
            this.btn_Exit.UseVisualStyleBackColor = true;
            this.btn_Exit.Click += new System.EventHandler(this.btn_Exit_Click);
            // 
            // DSSv
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 529);
            this.Controls.Add(this.btn_Exit);
            this.Controls.Add(this.btn_Sua);
            this.Controls.Add(this.btn_Delete);
            this.Controls.Add(this.btn_Add);
            this.Controls.Add(this.txt_MaLop);
            this.Controls.Add(this.txt_SDT);
            this.Controls.Add(this.CB_Gioi_Tinh);
            this.Controls.Add(this.txt_TenSV);
            this.Controls.Add(this.txt_Ma_SV);
            this.Controls.Add(this.lbl_MaLop);
            this.Controls.Add(this.lbl_SDT);
            this.Controls.Add(this.lb_GioiTinh);
            this.Controls.Add(this.lbl_Ten_SV);
            this.Controls.Add(this.lbl_SV);
            this.Controls.Add(this.dataGridView1);
            this.Name = "DSSv";
            this.Text = "DSSv";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.DSSv_FormClosing);
            this.Load += new System.EventHandler(this.DSSv_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Label lbl_SV;
        private System.Windows.Forms.Label lbl_Ten_SV;
        private System.Windows.Forms.Label lb_GioiTinh;
        private System.Windows.Forms.Label lbl_SDT;
        private System.Windows.Forms.Label lbl_MaLop;
        private System.Windows.Forms.TextBox txt_Ma_SV;
        private System.Windows.Forms.TextBox txt_TenSV;
        private System.Windows.Forms.ComboBox CB_Gioi_Tinh;
        private System.Windows.Forms.TextBox txt_SDT;
        private System.Windows.Forms.TextBox txt_MaLop;
        private System.Windows.Forms.Button btn_Add;
        private System.Windows.Forms.Button btn_Delete;
        private System.Windows.Forms.Button btn_Sua;
        private System.Windows.Forms.Button btn_Exit;
    }
}