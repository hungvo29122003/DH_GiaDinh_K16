namespace Buoi2.TongHop
{
    partial class Form1
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
            this.list_DS_SP = new System.Windows.Forms.ListBox();
            this.lbl1 = new System.Windows.Forms.Label();
            this.txt_Add_SP1 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.lbl_Add_SP1 = new System.Windows.Forms.Label();
            this.btnAdd = new System.Windows.Forms.Button();
            this.label_Add_SP2 = new System.Windows.Forms.Label();
            this.txt_Add_SP2 = new System.Windows.Forms.TextBox();
            this.comboBox_Vitri = new System.Windows.Forms.ComboBox();
            this.lbl_ViTri = new System.Windows.Forms.Label();
            this.lbl_Search_SP = new System.Windows.Forms.Label();
            this.txt_Search_SP = new System.Windows.Forms.TextBox();
            this.btn_Search = new System.Windows.Forms.Button();
            this.btn_delete_SP = new System.Windows.Forms.Button();
            this.btn_Delete_List_SP = new System.Windows.Forms.Button();
            this.btn_Add_SP_Vitri = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // list_DS_SP
            // 
            this.list_DS_SP.FormattingEnabled = true;
            this.list_DS_SP.Location = new System.Drawing.Point(12, 49);
            this.list_DS_SP.Name = "list_DS_SP";
            this.list_DS_SP.Size = new System.Drawing.Size(236, 251);
            this.list_DS_SP.TabIndex = 0;
            // 
            // lbl1
            // 
            this.lbl1.AutoSize = true;
            this.lbl1.Location = new System.Drawing.Point(10, 33);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(120, 13);
            this.lbl1.TabIndex = 1;
            this.lbl1.Text = "Danh sách sản phẩm :  ";
            // 
            // txt_Add_SP1
            // 
            this.txt_Add_SP1.Location = new System.Drawing.Point(376, 62);
            this.txt_Add_SP1.Name = "txt_Add_SP1";
            this.txt_Add_SP1.Size = new System.Drawing.Size(181, 20);
            this.txt_Add_SP1.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(0, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "label1";
            // 
            // lbl_Add_SP1
            // 
            this.lbl_Add_SP1.AutoSize = true;
            this.lbl_Add_SP1.Location = new System.Drawing.Point(270, 69);
            this.lbl_Add_SP1.Name = "lbl_Add_SP1";
            this.lbl_Add_SP1.Size = new System.Drawing.Size(89, 13);
            this.lbl_Add_SP1.TabIndex = 4;
            this.lbl_Add_SP1.Text = "Thêm sản phẩm: ";
            // 
            // btnAdd
            // 
            this.btnAdd.Location = new System.Drawing.Point(593, 59);
            this.btnAdd.Name = "btnAdd";
            this.btnAdd.Size = new System.Drawing.Size(75, 23);
            this.btnAdd.TabIndex = 5;
            this.btnAdd.Text = "Thêm";
            this.btnAdd.UseVisualStyleBackColor = true;
            this.btnAdd.Click += new System.EventHandler(this.btnAdd_Click);
            // 
            // label_Add_SP2
            // 
            this.label_Add_SP2.AutoSize = true;
            this.label_Add_SP2.Location = new System.Drawing.Point(270, 175);
            this.label_Add_SP2.Name = "label_Add_SP2";
            this.label_Add_SP2.Size = new System.Drawing.Size(89, 13);
            this.label_Add_SP2.TabIndex = 6;
            this.label_Add_SP2.Text = "Thêm sản phẩm: ";
            // 
            // txt_Add_SP2
            // 
            this.txt_Add_SP2.Location = new System.Drawing.Point(376, 172);
            this.txt_Add_SP2.Name = "txt_Add_SP2";
            this.txt_Add_SP2.Size = new System.Drawing.Size(181, 20);
            this.txt_Add_SP2.TabIndex = 7;
            this.txt_Add_SP2.TextChanged += new System.EventHandler(this.txt_Add_SP2_TextChanged);
            // 
            // comboBox_Vitri
            // 
            this.comboBox_Vitri.FormattingEnabled = true;
            this.comboBox_Vitri.Location = new System.Drawing.Point(638, 171);
            this.comboBox_Vitri.Name = "comboBox_Vitri";
            this.comboBox_Vitri.Size = new System.Drawing.Size(75, 21);
            this.comboBox_Vitri.TabIndex = 8;
            this.comboBox_Vitri.SelectedIndexChanged += new System.EventHandler(this.comboBox_Vitri_SelectedIndexChanged);
            // 
            // lbl_ViTri
            // 
            this.lbl_ViTri.AutoSize = true;
            this.lbl_ViTri.Location = new System.Drawing.Point(574, 175);
            this.lbl_ViTri.Name = "lbl_ViTri";
            this.lbl_ViTri.Size = new System.Drawing.Size(58, 13);
            this.lbl_ViTri.TabIndex = 9;
            this.lbl_ViTri.Text = "Vị trí thêm:";
            this.lbl_ViTri.Click += new System.EventHandler(this.lbl_ViTri_Click);
            // 
            // lbl_Search_SP
            // 
            this.lbl_Search_SP.AutoSize = true;
            this.lbl_Search_SP.Location = new System.Drawing.Point(254, 270);
            this.lbl_Search_SP.Name = "lbl_Search_SP";
            this.lbl_Search_SP.Size = new System.Drawing.Size(125, 13);
            this.lbl_Search_SP.TabIndex = 10;
            this.lbl_Search_SP.Text = "Nhập sản phẩm cần tìm: ";
            // 
            // txt_Search_SP
            // 
            this.txt_Search_SP.Location = new System.Drawing.Point(376, 263);
            this.txt_Search_SP.Name = "txt_Search_SP";
            this.txt_Search_SP.Size = new System.Drawing.Size(181, 20);
            this.txt_Search_SP.TabIndex = 11;
            // 
            // btn_Search
            // 
            this.btn_Search.Location = new System.Drawing.Point(593, 263);
            this.btn_Search.Name = "btn_Search";
            this.btn_Search.Size = new System.Drawing.Size(75, 23);
            this.btn_Search.TabIndex = 12;
            this.btn_Search.Text = "Tìm Kiếm ";
            this.btn_Search.UseVisualStyleBackColor = true;
            // 
            // btn_delete_SP
            // 
            this.btn_delete_SP.Location = new System.Drawing.Point(283, 410);
            this.btn_delete_SP.Name = "btn_delete_SP";
            this.btn_delete_SP.Size = new System.Drawing.Size(128, 23);
            this.btn_delete_SP.TabIndex = 13;
            this.btn_delete_SP.Text = "Xóa sản phẩm";
            this.btn_delete_SP.UseVisualStyleBackColor = true;
            // 
            // btn_Delete_List_SP
            // 
            this.btn_Delete_List_SP.Location = new System.Drawing.Point(485, 410);
            this.btn_Delete_List_SP.Name = "btn_Delete_List_SP";
            this.btn_Delete_List_SP.Size = new System.Drawing.Size(168, 23);
            this.btn_Delete_List_SP.TabIndex = 14;
            this.btn_Delete_List_SP.Text = "Xóa danh sách sản phẩm";
            this.btn_Delete_List_SP.UseVisualStyleBackColor = true;
            // 
            // btn_Add_SP_Vitri
            // 
            this.btn_Add_SP_Vitri.Location = new System.Drawing.Point(766, 171);
            this.btn_Add_SP_Vitri.Name = "btn_Add_SP_Vitri";
            this.btn_Add_SP_Vitri.Size = new System.Drawing.Size(75, 23);
            this.btn_Add_SP_Vitri.TabIndex = 15;
            this.btn_Add_SP_Vitri.Text = "Thêm";
            this.btn_Add_SP_Vitri.UseVisualStyleBackColor = true;
            this.btn_Add_SP_Vitri.Click += new System.EventHandler(this.btn_Add_SP_Vitri_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(867, 450);
            this.Controls.Add(this.btn_Add_SP_Vitri);
            this.Controls.Add(this.btn_Delete_List_SP);
            this.Controls.Add(this.btn_delete_SP);
            this.Controls.Add(this.btn_Search);
            this.Controls.Add(this.txt_Search_SP);
            this.Controls.Add(this.lbl_Search_SP);
            this.Controls.Add(this.lbl_ViTri);
            this.Controls.Add(this.comboBox_Vitri);
            this.Controls.Add(this.txt_Add_SP2);
            this.Controls.Add(this.label_Add_SP2);
            this.Controls.Add(this.btnAdd);
            this.Controls.Add(this.lbl_Add_SP1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.txt_Add_SP1);
            this.Controls.Add(this.lbl1);
            this.Controls.Add(this.list_DS_SP);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox list_DS_SP;
        private System.Windows.Forms.Label lbl1;
        private System.Windows.Forms.TextBox txt_Add_SP1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lbl_Add_SP1;
        private System.Windows.Forms.Button btnAdd;
        private System.Windows.Forms.Label label_Add_SP2;
        private System.Windows.Forms.TextBox txt_Add_SP2;
        private System.Windows.Forms.ComboBox comboBox_Vitri;
        private System.Windows.Forms.Label lbl_ViTri;
        private System.Windows.Forms.Label lbl_Search_SP;
        private System.Windows.Forms.TextBox txt_Search_SP;
        private System.Windows.Forms.Button btn_Search;
        private System.Windows.Forms.Button btn_delete_SP;
        private System.Windows.Forms.Button btn_Delete_List_SP;
        private System.Windows.Forms.Button btn_Add_SP_Vitri;
    }
}

