namespace QLSV
{
    partial class Main
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
            this.label1 = new System.Windows.Forms.Label();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.lop = new System.Windows.Forms.ToolStripMenuItem();
            this.DS_lop = new System.Windows.Forms.ToolStripMenuItem();
            this.SinhVien = new System.Windows.Forms.ToolStripMenuItem();
            this.DS_SV = new System.Windows.Forms.ToolStripMenuItem();
            this.Mon_Hoc = new System.Windows.Forms.ToolStripMenuItem();
            this.DS_Monhoc = new System.Windows.Forms.ToolStripMenuItem();
            this.giảngViênToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.exit = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(84, 279);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(640, 31);
            this.label1.TabIndex = 0;
            this.label1.Text = "Chào mừng bạn đến với phần mềm quản lý sinh viên";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.lop,
            this.SinhVien,
            this.Mon_Hoc,
            this.giảngViênToolStripMenuItem,
            this.exit});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // lop
            // 
            this.lop.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.DS_lop});
            this.lop.Name = "lop";
            this.lop.Size = new System.Drawing.Size(82, 20);
            this.lop.Text = "Phân hệ lớp";
            // 
            // DS_lop
            // 
            this.DS_lop.Name = "DS_lop";
            this.DS_lop.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.A)));
            this.DS_lop.Size = new System.Drawing.Size(191, 22);
            this.DS_lop.Text = "Danh sách lớp";
            this.DS_lop.Click += new System.EventHandler(this.DS_lop_Click);
            // 
            // SinhVien
            // 
            this.SinhVien.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.DS_SV});
            this.SinhVien.Name = "SinhVien";
            this.SinhVien.Size = new System.Drawing.Size(70, 20);
            this.SinhVien.Text = " Sinh viên";
            // 
            // DS_SV
            // 
            this.DS_SV.Name = "DS_SV";
            this.DS_SV.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.C)));
            this.DS_SV.Size = new System.Drawing.Size(222, 22);
            this.DS_SV.Text = "Danh Sách sinh viên";
            this.DS_SV.Click += new System.EventHandler(this.DS_SV_Click);
            // 
            // Mon_Hoc
            // 
            this.Mon_Hoc.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.DS_Monhoc});
            this.Mon_Hoc.Name = "Mon_Hoc";
            this.Mon_Hoc.Size = new System.Drawing.Size(67, 20);
            this.Mon_Hoc.Text = "Môn học";
            // 
            // DS_Monhoc
            // 
            this.DS_Monhoc.Name = "DS_Monhoc";
            this.DS_Monhoc.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.D)));
            this.DS_Monhoc.Size = new System.Drawing.Size(222, 22);
            this.DS_Monhoc.Text = "Danh sách môn học";
            this.DS_Monhoc.Click += new System.EventHandler(this.DS_Monhoc_Click);
            // 
            // giảngViênToolStripMenuItem
            // 
            this.giảngViênToolStripMenuItem.Name = "giảngViênToolStripMenuItem";
            this.giảngViênToolStripMenuItem.Size = new System.Drawing.Size(75, 20);
            this.giảngViênToolStripMenuItem.Text = "Giảng viên";
            // 
            // exit
            // 
            this.exit.Name = "exit";
            this.exit.Size = new System.Drawing.Size(49, 20);
            this.exit.Text = "Thoát";
            this.exit.Click += new System.EventHandler(this.exit_Click);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.menuStrip1);
            this.Name = "Main";
            this.Text = "Mani";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem lop;
        private System.Windows.Forms.ToolStripMenuItem SinhVien;
        private System.Windows.Forms.ToolStripMenuItem Mon_Hoc;
        private System.Windows.Forms.ToolStripMenuItem giảngViênToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exit;
        private System.Windows.Forms.ToolStripMenuItem DS_lop;
        private System.Windows.Forms.ToolStripMenuItem DS_SV;
        private System.Windows.Forms.ToolStripMenuItem DS_Monhoc;
    }
}