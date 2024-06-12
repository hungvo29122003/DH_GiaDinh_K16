namespace Buoi2_Combobox
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
            this.comboBox_Color = new System.Windows.Forms.ComboBox();
            this.comboBox_FontSize = new System.Windows.Forms.ComboBox();
            this.lbl1 = new System.Windows.Forms.Label();
            this.btn_TH = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // comboBox_Color
            // 
            this.comboBox_Color.FormattingEnabled = true;
            this.comboBox_Color.Items.AddRange(new object[] {
            "Xanh",
            "Đỏ",
            "Tím",
            "Vàng"});
            this.comboBox_Color.Location = new System.Drawing.Point(126, 76);
            this.comboBox_Color.Name = "comboBox_Color";
            this.comboBox_Color.Size = new System.Drawing.Size(132, 21);
            this.comboBox_Color.TabIndex = 0;
            this.comboBox_Color.SelectedIndexChanged += new System.EventHandler(this.comboBox_Color_SelectedIndexChanged);
            // 
            // comboBox_FontSize
            // 
            this.comboBox_FontSize.FormattingEnabled = true;
            this.comboBox_FontSize.Items.AddRange(new object[] {
            "10",
            "14",
            "16",
            "18"});
            this.comboBox_FontSize.Location = new System.Drawing.Point(508, 76);
            this.comboBox_FontSize.Name = "comboBox_FontSize";
            this.comboBox_FontSize.Size = new System.Drawing.Size(121, 21);
            this.comboBox_FontSize.TabIndex = 1;
            this.comboBox_FontSize.SelectedIndexChanged += new System.EventHandler(this.comboBox_FontSize_SelectedIndexChanged);
            // 
            // lbl1
            // 
            this.lbl1.AutoSize = true;
            this.lbl1.Font = new System.Drawing.Font("Segoe UI", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl1.Location = new System.Drawing.Point(161, 258);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(565, 32);
            this.lbl1.TabIndex = 2;
            this.lbl1.Text = "Hello World, Xin Chào Mừng Bạn Đã Đến Với C#";
            // 
            // btn_TH
            // 
            this.btn_TH.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_TH.Location = new System.Drawing.Point(335, 174);
            this.btn_TH.Name = "btn_TH";
            this.btn_TH.Size = new System.Drawing.Size(75, 23);
            this.btn_TH.TabIndex = 4;
            this.btn_TH.Text = "Thực hiện";
            this.btn_TH.UseVisualStyleBackColor = true;
            this.btn_TH.Click += new System.EventHandler(this.btn_TH_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btn_TH);
            this.Controls.Add(this.lbl1);
            this.Controls.Add(this.comboBox_FontSize);
            this.Controls.Add(this.comboBox_Color);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox comboBox_Color;
        private System.Windows.Forms.ComboBox comboBox_FontSize;
        private System.Windows.Forms.Label lbl1;
        private System.Windows.Forms.Button btn_TH;
    }
}

