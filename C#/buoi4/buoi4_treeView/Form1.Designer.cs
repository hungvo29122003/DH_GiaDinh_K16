namespace buoi4_treeView
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
            treeView1 = new TreeView();
            groupBox1 = new GroupBox();
            btnDeletePB = new Button();
            btnAddPB = new Button();
            txtPB = new TextBox();
            label1 = new Label();
            label2 = new Label();
            lblMS = new Label();
            lblName = new Label();
            txtMS = new TextBox();
            txtName = new TextBox();
            label3 = new Label();
            label4 = new Label();
            txtDiachi = new TextBox();
            cbPB = new ComboBox();
            btnAdd = new Button();
            btnExit = new Button();
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // treeView1
            // 
            treeView1.Location = new Point(14, 41);
            treeView1.Name = "treeView1";
            treeView1.Size = new Size(262, 253);
            treeView1.TabIndex = 0;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(btnDeletePB);
            groupBox1.Controls.Add(btnAddPB);
            groupBox1.Controls.Add(txtPB);
            groupBox1.Controls.Add(label1);
            groupBox1.Controls.Add(treeView1);
            groupBox1.Font = new Font("Segoe UI", 11.25F, FontStyle.Bold, GraphicsUnit.Point, 0);
            groupBox1.Location = new Point(23, 42);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(282, 461);
            groupBox1.TabIndex = 1;
            groupBox1.TabStop = false;
            groupBox1.Text = "PHÒNG BAN";
            // 
            // btnDeletePB
            // 
            btnDeletePB.Location = new Point(127, 413);
            btnDeletePB.Name = "btnDeletePB";
            btnDeletePB.Size = new Size(149, 32);
            btnDeletePB.TabIndex = 4;
            btnDeletePB.Text = "Xóa Phòng ban";
            btnDeletePB.UseVisualStyleBackColor = true;
            btnDeletePB.Click += btnDeletePB_Click;
            // 
            // btnAddPB
            // 
            btnAddPB.Location = new Point(127, 360);
            btnAddPB.Name = "btnAddPB";
            btnAddPB.Size = new Size(149, 32);
            btnAddPB.TabIndex = 3;
            btnAddPB.Text = "Thêm Phòng ban";
            btnAddPB.UseVisualStyleBackColor = true;
            btnAddPB.Click += btnAddPB_Click;
            // 
            // txtPB
            // 
            txtPB.Location = new Point(127, 313);
            txtPB.Name = "txtPB";
            txtPB.Size = new Size(149, 27);
            txtPB.TabIndex = 2;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(21, 320);
            label1.Name = "label1";
            label1.Size = new Size(84, 20);
            label1.TabIndex = 1;
            label1.Text = "Phòng ban";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 18F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label2.Location = new Point(510, 83);
            label2.Name = "label2";
            label2.Size = new Size(232, 32);
            label2.TabIndex = 2;
            label2.Text = "HỒ SƠ NHÂN VIÊN";
            // 
            // lblMS
            // 
            lblMS.AutoSize = true;
            lblMS.Location = new Point(359, 158);
            lblMS.Name = "lblMS";
            lblMS.Size = new Size(39, 15);
            lblMS.TabIndex = 3;
            lblMS.Text = "Mã số";
            // 
            // lblName
            // 
            lblName.AutoSize = true;
            lblName.Location = new Point(556, 158);
            lblName.Name = "lblName";
            lblName.Size = new Size(61, 15);
            lblName.TabIndex = 4;
            lblName.Text = "Họ và tên ";
            // 
            // txtMS
            // 
            txtMS.Location = new Point(434, 150);
            txtMS.Name = "txtMS";
            txtMS.Size = new Size(100, 23);
            txtMS.TabIndex = 5;
            // 
            // txtName
            // 
            txtName.Location = new Point(623, 150);
            txtName.Name = "txtName";
            txtName.Size = new Size(196, 23);
            txtName.TabIndex = 6;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(359, 256);
            label3.Name = "label3";
            label3.Size = new Size(43, 15);
            label3.TabIndex = 7;
            label3.Text = "Địa chỉ";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(359, 339);
            label4.Name = "label4";
            label4.Size = new Size(65, 15);
            label4.TabIndex = 8;
            label4.Text = "Phòng ban";
            // 
            // txtDiachi
            // 
            txtDiachi.Location = new Point(434, 246);
            txtDiachi.Name = "txtDiachi";
            txtDiachi.Size = new Size(295, 23);
            txtDiachi.TabIndex = 9;
            // 
            // cbPB
            // 
            cbPB.FormattingEnabled = true;
            cbPB.Location = new Point(445, 331);
            cbPB.Name = "cbPB";
            cbPB.Size = new Size(284, 23);
            cbPB.TabIndex = 10;
            // 
            // btnAdd
            // 
            btnAdd.Location = new Point(487, 421);
            btnAdd.Name = "btnAdd";
            btnAdd.Size = new Size(75, 23);
            btnAdd.TabIndex = 11;
            btnAdd.Text = "Thêm ";
            btnAdd.UseVisualStyleBackColor = true;
            btnAdd.Click += btnAdd_Click;
            // 
            // btnExit
            // 
            btnExit.Location = new Point(624, 421);
            btnExit.Name = "btnExit";
            btnExit.Size = new Size(75, 23);
            btnExit.TabIndex = 12;
            btnExit.Text = "Thoát";
            btnExit.UseVisualStyleBackColor = true;
            btnExit.Click += btnExit_Click_1;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(895, 515);
            Controls.Add(btnExit);
            Controls.Add(btnAdd);
            Controls.Add(cbPB);
            Controls.Add(txtDiachi);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(txtName);
            Controls.Add(txtMS);
            Controls.Add(lblName);
            Controls.Add(lblMS);
            Controls.Add(label2);
            Controls.Add(groupBox1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TreeView treeView1;
        private GroupBox groupBox1;
        private Button btnDeletePB;
        private Button btnAddPB;
        private TextBox txtPB;
        private Label label1;
        private Label label2;
        private Label lblMS;
        private Label lblName;
        private TextBox txtMS;
        private TextBox txtName;
        private Label label3;
        private Label label4;
        private TextBox txtDiachi;
        private ComboBox cbPB;
        private Button btnAdd;
        private Button btnExit;
    }
}
