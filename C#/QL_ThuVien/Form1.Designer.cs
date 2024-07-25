namespace QL_ThuVien
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
            this.cbTenDocGia = new System.Windows.Forms.ComboBox();
            this.cbMaDocGia = new System.Windows.Forms.ComboBox();
            this.lbl1 = new System.Windows.Forms.Label();
            this.btnPrint = new System.Windows.Forms.Button();
            this.dataGridViewPrintDocGia = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewPrintDocGia)).BeginInit();
            this.SuspendLayout();
            // 
            // cbTenDocGia
            // 
            this.cbTenDocGia.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbTenDocGia.FormattingEnabled = true;
            this.cbTenDocGia.Location = new System.Drawing.Point(385, 77);
            this.cbTenDocGia.Name = "cbTenDocGia";
            this.cbTenDocGia.Size = new System.Drawing.Size(192, 21);
            this.cbTenDocGia.TabIndex = 16;
            // 
            // cbMaDocGia
            // 
            this.cbMaDocGia.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cbMaDocGia.FormattingEnabled = true;
            this.cbMaDocGia.Location = new System.Drawing.Point(210, 77);
            this.cbMaDocGia.Name = "cbMaDocGia";
            this.cbMaDocGia.Size = new System.Drawing.Size(85, 21);
            this.cbMaDocGia.TabIndex = 15;
            // 
            // lbl1
            // 
            this.lbl1.AutoSize = true;
            this.lbl1.Location = new System.Drawing.Point(136, 80);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(64, 13);
            this.lbl1.TabIndex = 14;
            this.lbl1.Text = "Mã độc giả:";
            // 
            // btnPrint
            // 
            this.btnPrint.Location = new System.Drawing.Point(597, 75);
            this.btnPrint.Name = "btnPrint";
            this.btnPrint.Size = new System.Drawing.Size(75, 26);
            this.btnPrint.TabIndex = 13;
            this.btnPrint.Text = "In";
            this.btnPrint.UseVisualStyleBackColor = true;
            // 
            // dataGridViewPrintDocGia
            // 
            this.dataGridViewPrintDocGia.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewPrintDocGia.Location = new System.Drawing.Point(42, 129);
            this.dataGridViewPrintDocGia.Name = "dataGridViewPrintDocGia";
            this.dataGridViewPrintDocGia.ReadOnly = true;
            this.dataGridViewPrintDocGia.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridViewPrintDocGia.Size = new System.Drawing.Size(715, 254);
            this.dataGridViewPrintDocGia.TabIndex = 12;
            this.dataGridViewPrintDocGia.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridViewPrintDocGia_CellClick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.cbTenDocGia);
            this.Controls.Add(this.cbMaDocGia);
            this.Controls.Add(this.lbl1);
            this.Controls.Add(this.btnPrint);
            this.Controls.Add(this.dataGridViewPrintDocGia);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewPrintDocGia)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox cbTenDocGia;
        private System.Windows.Forms.ComboBox cbMaDocGia;
        private System.Windows.Forms.Label lbl1;
        private System.Windows.Forms.Button btnPrint;
        private System.Windows.Forms.DataGridView dataGridViewPrintDocGia;
    }
}

