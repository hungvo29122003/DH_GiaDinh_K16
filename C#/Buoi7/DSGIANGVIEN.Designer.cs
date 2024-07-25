namespace Buoi7
{
    partial class DSGIANGVIEN
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
            this.components = new System.ComponentModel.Container();
            this.lbl_Co_So = new System.Windows.Forms.Label();
            this.lbl_Don_vi = new System.Windows.Forms.Label();
            this.cb_Co_So = new System.Windows.Forms.ComboBox();
            this.cb_Don_Vi = new System.Windows.Forms.ComboBox();
            this.btn_InDS = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.MenuTTGV = new System.Windows.Forms.ToolStripMenuItem();
            this.MenuXoa = new System.Windows.Forms.ToolStripMenuItem();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.contextMenuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // lbl_Co_So
            // 
            this.lbl_Co_So.AutoSize = true;
            this.lbl_Co_So.Location = new System.Drawing.Point(63, 48);
            this.lbl_Co_So.Name = "lbl_Co_So";
            this.lbl_Co_So.Size = new System.Drawing.Size(34, 13);
            this.lbl_Co_So.TabIndex = 0;
            this.lbl_Co_So.Text = "Cơ sở";
            // 
            // lbl_Don_vi
            // 
            this.lbl_Don_vi.AutoSize = true;
            this.lbl_Don_vi.Location = new System.Drawing.Point(63, 121);
            this.lbl_Don_vi.Name = "lbl_Don_vi";
            this.lbl_Don_vi.Size = new System.Drawing.Size(38, 13);
            this.lbl_Don_vi.TabIndex = 1;
            this.lbl_Don_vi.Text = "Đơn vị";
            // 
            // cb_Co_So
            // 
            this.cb_Co_So.FormattingEnabled = true;
            this.cb_Co_So.Location = new System.Drawing.Point(135, 45);
            this.cb_Co_So.Name = "cb_Co_So";
            this.cb_Co_So.Size = new System.Drawing.Size(280, 21);
            this.cb_Co_So.TabIndex = 2;
            this.cb_Co_So.SelectedIndexChanged += new System.EventHandler(this.cb_Co_So_SelectedIndexChanged);
            // 
            // cb_Don_Vi
            // 
            this.cb_Don_Vi.FormattingEnabled = true;
            this.cb_Don_Vi.Location = new System.Drawing.Point(135, 113);
            this.cb_Don_Vi.Name = "cb_Don_Vi";
            this.cb_Don_Vi.Size = new System.Drawing.Size(280, 21);
            this.cb_Don_Vi.TabIndex = 3;
            this.cb_Don_Vi.SelectedIndexChanged += new System.EventHandler(this.cb_Don_Vi_SelectedIndexChanged);
            // 
            // btn_InDS
            // 
            this.btn_InDS.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_InDS.Location = new System.Drawing.Point(550, 45);
            this.btn_InDS.Name = "btn_InDS";
            this.btn_InDS.Size = new System.Drawing.Size(164, 89);
            this.btn_InDS.TabIndex = 4;
            this.btn_InDS.Text = "In danh sách";
            this.btn_InDS.UseVisualStyleBackColor = true;
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.ContextMenuStrip = this.contextMenuStrip1;
            this.dataGridView1.Location = new System.Drawing.Point(5, 202);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(732, 314);
            this.dataGridView1.TabIndex = 5;
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.MenuTTGV,
            this.MenuXoa});
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(265, 48);
            // 
            // MenuTTGV
            // 
            this.MenuTTGV.Name = "MenuTTGV";
            this.MenuTTGV.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.A)));
            this.MenuTTGV.Size = new System.Drawing.Size(264, 22);
            this.MenuTTGV.Text = "Thông tin chi tiết giảng viên";
            // 
            // MenuXoa
            // 
            this.MenuXoa.Name = "MenuXoa";
            this.MenuXoa.Size = new System.Drawing.Size(264, 22);
            this.MenuXoa.Text = "Xóa giảng viên";
            // 
            // DSGIANGVIEN
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 528);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.btn_InDS);
            this.Controls.Add(this.cb_Don_Vi);
            this.Controls.Add(this.cb_Co_So);
            this.Controls.Add(this.lbl_Don_vi);
            this.Controls.Add(this.lbl_Co_So);
            this.Name = "DSGIANGVIEN";
            this.Text = "DSGIANGVIEN";
            this.Load += new System.EventHandler(this.DSGIANGVIEN_Load_1);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.contextMenuStrip1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_Co_So;
        private System.Windows.Forms.Label lbl_Don_vi;
        private System.Windows.Forms.ComboBox cb_Co_So;
        private System.Windows.Forms.ComboBox cb_Don_Vi;
        private System.Windows.Forms.Button btn_InDS;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.ToolStripMenuItem MenuTTGV;
        private System.Windows.Forms.ToolStripMenuItem MenuXoa;
    }
}

