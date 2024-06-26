namespace Buoi6_ketnoi
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
            this.DsLop = new System.Windows.Forms.ToolStripMenuItem();
            this.sinhToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.mônHọcToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.giảngViênToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.thoátToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
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
            this.DsLop,
            this.sinhToolStripMenuItem,
            this.mônHọcToolStripMenuItem,
            this.giảngViênToolStripMenuItem,
            this.thoátToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // DsLop
            // 
            this.DsLop.Name = "DsLop";
            this.DsLop.Size = new System.Drawing.Size(82, 20);
            this.DsLop.Text = "Phân hệ lớp";
            this.DsLop.Click += new System.EventHandler(this.DsLop_Click);
            // 
            // sinhToolStripMenuItem
            // 
            this.sinhToolStripMenuItem.Name = "sinhToolStripMenuItem";
            this.sinhToolStripMenuItem.Size = new System.Drawing.Size(70, 20);
            this.sinhToolStripMenuItem.Text = " Sinh viên";
            // 
            // mônHọcToolStripMenuItem
            // 
            this.mônHọcToolStripMenuItem.Name = "mônHọcToolStripMenuItem";
            this.mônHọcToolStripMenuItem.Size = new System.Drawing.Size(67, 20);
            this.mônHọcToolStripMenuItem.Text = "Môn học";
            // 
            // giảngViênToolStripMenuItem
            // 
            this.giảngViênToolStripMenuItem.Name = "giảngViênToolStripMenuItem";
            this.giảngViênToolStripMenuItem.Size = new System.Drawing.Size(75, 20);
            this.giảngViênToolStripMenuItem.Text = "Giảng viên";
            // 
            // thoátToolStripMenuItem
            // 
            this.thoátToolStripMenuItem.Name = "thoátToolStripMenuItem";
            this.thoátToolStripMenuItem.Size = new System.Drawing.Size(49, 20);
            this.thoátToolStripMenuItem.Text = "Thoát";
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
        private System.Windows.Forms.ToolStripMenuItem DsLop;
        private System.Windows.Forms.ToolStripMenuItem sinhToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem mônHọcToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem giảngViênToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem thoátToolStripMenuItem;
    }
}