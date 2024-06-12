namespace buoi3.BT
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
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            txtTen_KH = new TextBox();
            txtSo_Kh = new TextBox();
            cb_Sv = new CheckBox();
            grb_Menu_water = new GroupBox();
            rbCF_Da = new RadioButton();
            rbCF_Sua = new RadioButton();
            rbCF_SuaDa = new RadioButton();
            rbCF_Kem = new RadioButton();
            rbCF_Den = new RadioButton();
            grb_Menu_Food = new GroupBox();
            cbMyCay = new CheckBox();
            cbMX_Bò = new CheckBox();
            cbMT_Trung = new CheckBox();
            cbBM_Ca = new CheckBox();
            cbBM_Trung = new CheckBox();
            btnTinhtien = new Button();
            btnNhapLai = new Button();
            btnThanhToan = new Button();
            btnThoat = new Button();
            label4 = new Label();
            label5 = new Label();
            txtT_KH = new TextBox();
            txtT_Money = new TextBox();
            grb_Menu_water.SuspendLayout();
            grb_Menu_Food.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI Black", 16F, FontStyle.Bold);
            label1.ForeColor = Color.FromArgb(192, 192, 0);
            label1.Location = new Point(255, 33);
            label1.Margin = new Padding(6, 0, 6, 0);
            label1.Name = "label1";
            label1.Size = new Size(196, 30);
            label1.TabIndex = 0;
            label1.Text = "CAFE SINH VIÊN ";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 12F, FontStyle.Bold);
            label2.Location = new Point(29, 97);
            label2.Name = "label2";
            label2.Size = new Size(130, 21);
            label2.TabIndex = 1;
            label2.Text = "Tên khách hàng";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Segoe UI", 12F, FontStyle.Bold);
            label3.Location = new Point(29, 177);
            label3.Name = "label3";
            label3.Size = new Size(122, 21);
            label3.TabIndex = 2;
            label3.Text = "Số khách hàng";
            // 
            // txtTen_KH
            // 
            txtTen_KH.Font = new Font("Segoe UI", 12F);
            txtTen_KH.Location = new Point(214, 89);
            txtTen_KH.Name = "txtTen_KH";
            txtTen_KH.Size = new Size(341, 29);
            txtTen_KH.TabIndex = 3;
            txtTen_KH.TextChanged += textBox1_TextChanged;
            // 
            // txtSo_Kh
            // 
            txtSo_Kh.Font = new Font("Segoe UI", 12F);
            txtSo_Kh.Location = new Point(214, 169);
            txtSo_Kh.Name = "txtSo_Kh";
            txtSo_Kh.Size = new Size(341, 29);
            txtSo_Kh.TabIndex = 4;
            txtSo_Kh.TextChanged += txtSo_Kh_TextChanged;
            txtSo_Kh.KeyPress += txtSo_Kh_KeyPress;
            // 
            // cb_Sv
            // 
            cb_Sv.AutoSize = true;
            cb_Sv.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            cb_Sv.Location = new Point(214, 225);
            cb_Sv.Name = "cb_Sv";
            cb_Sv.Size = new Size(104, 25);
            cb_Sv.TabIndex = 5;
            cb_Sv.Text = "Sinh viên ?";
            cb_Sv.UseVisualStyleBackColor = true;
            // 
            // grb_Menu_water
            // 
            grb_Menu_water.Controls.Add(rbCF_Da);
            grb_Menu_water.Controls.Add(rbCF_Sua);
            grb_Menu_water.Controls.Add(rbCF_SuaDa);
            grb_Menu_water.Controls.Add(rbCF_Kem);
            grb_Menu_water.Controls.Add(rbCF_Den);
            grb_Menu_water.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            grb_Menu_water.Location = new Point(29, 265);
            grb_Menu_water.Name = "grb_Menu_water";
            grb_Menu_water.Size = new Size(263, 244);
            grb_Menu_water.TabIndex = 6;
            grb_Menu_water.TabStop = false;
            grb_Menu_water.Text = "Nước uống";
            // 
            // rbCF_Da
            // 
            rbCF_Da.AutoSize = true;
            rbCF_Da.Location = new Point(138, 46);
            rbCF_Da.Name = "rbCF_Da";
            rbCF_Da.Size = new Size(80, 25);
            rbCF_Da.TabIndex = 4;
            rbCF_Da.TabStop = true;
            rbCF_Da.Text = "Cafe đá";
            rbCF_Da.UseVisualStyleBackColor = true;
            // 
            // rbCF_Sua
            // 
            rbCF_Sua.AutoSize = true;
            rbCF_Sua.Location = new Point(16, 91);
            rbCF_Sua.Name = "rbCF_Sua";
            rbCF_Sua.Size = new Size(87, 25);
            rbCF_Sua.TabIndex = 3;
            rbCF_Sua.TabStop = true;
            rbCF_Sua.Text = "Cafe sữa";
            rbCF_Sua.UseVisualStyleBackColor = true;
            // 
            // rbCF_SuaDa
            // 
            rbCF_SuaDa.AutoSize = true;
            rbCF_SuaDa.Location = new Point(16, 146);
            rbCF_SuaDa.Name = "rbCF_SuaDa";
            rbCF_SuaDa.Size = new Size(110, 25);
            rbCF_SuaDa.TabIndex = 2;
            rbCF_SuaDa.TabStop = true;
            rbCF_SuaDa.Text = "Cafe Sữa đá";
            rbCF_SuaDa.UseVisualStyleBackColor = true;
            // 
            // rbCF_Kem
            // 
            rbCF_Kem.AutoSize = true;
            rbCF_Kem.Location = new Point(144, 91);
            rbCF_Kem.Name = "rbCF_Kem";
            rbCF_Kem.Size = new Size(93, 25);
            rbCF_Kem.TabIndex = 1;
            rbCF_Kem.TabStop = true;
            rbCF_Kem.Text = "Cafe kem";
            rbCF_Kem.UseVisualStyleBackColor = true;
            // 
            // rbCF_Den
            // 
            rbCF_Den.AutoSize = true;
            rbCF_Den.Location = new Point(16, 46);
            rbCF_Den.Name = "rbCF_Den";
            rbCF_Den.Size = new Size(89, 25);
            rbCF_Den.TabIndex = 0;
            rbCF_Den.TabStop = true;
            rbCF_Den.Text = "Cafe đen";
            rbCF_Den.UseVisualStyleBackColor = true;
            // 
            // grb_Menu_Food
            // 
            grb_Menu_Food.Controls.Add(cbMyCay);
            grb_Menu_Food.Controls.Add(cbMX_Bò);
            grb_Menu_Food.Controls.Add(cbMT_Trung);
            grb_Menu_Food.Controls.Add(cbBM_Ca);
            grb_Menu_Food.Controls.Add(cbBM_Trung);
            grb_Menu_Food.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            grb_Menu_Food.Location = new Point(358, 265);
            grb_Menu_Food.Name = "grb_Menu_Food";
            grb_Menu_Food.Size = new Size(263, 244);
            grb_Menu_Food.TabIndex = 7;
            grb_Menu_Food.TabStop = false;
            grb_Menu_Food.Text = "Thức ăn";
            // 
            // cbMyCay
            // 
            cbMyCay.AutoSize = true;
            cbMyCay.Location = new Point(141, 92);
            cbMyCay.Name = "cbMyCay";
            cbMyCay.Size = new Size(78, 25);
            cbMyCay.TabIndex = 16;
            cbMyCay.Text = "Mỳ cay";
            cbMyCay.UseVisualStyleBackColor = true;
            // 
            // cbMX_Bò
            // 
            cbMX_Bò.AutoSize = true;
            cbMX_Bò.Location = new Point(141, 38);
            cbMX_Bò.Name = "cbMX_Bò";
            cbMX_Bò.Size = new Size(101, 25);
            cbMX_Bò.TabIndex = 15;
            cbMX_Bò.Text = "Mỳ xào bò";
            cbMX_Bò.UseVisualStyleBackColor = true;
            // 
            // cbMT_Trung
            // 
            cbMT_Trung.AutoSize = true;
            cbMT_Trung.Location = new Point(6, 146);
            cbMT_Trung.Name = "cbMT_Trung";
            cbMT_Trung.Size = new Size(125, 25);
            cbMT_Trung.TabIndex = 14;
            cbMT_Trung.Text = "Mỳ tôm trứng";
            cbMT_Trung.UseVisualStyleBackColor = true;
            // 
            // cbBM_Ca
            // 
            cbBM_Ca.AutoSize = true;
            cbBM_Ca.Location = new Point(6, 92);
            cbBM_Ca.Name = "cbBM_Ca";
            cbBM_Ca.Size = new Size(105, 25);
            cbBM_Ca.TabIndex = 13;
            cbBM_Ca.Text = "Bánh mì cá";
            cbBM_Ca.UseVisualStyleBackColor = true;
            // 
            // cbBM_Trung
            // 
            cbBM_Trung.AutoSize = true;
            cbBM_Trung.Location = new Point(6, 38);
            cbBM_Trung.Name = "cbBM_Trung";
            cbBM_Trung.Size = new Size(128, 25);
            cbBM_Trung.TabIndex = 12;
            cbBM_Trung.Text = "Bánh mì trứng";
            cbBM_Trung.UseVisualStyleBackColor = true;
            // 
            // btnTinhtien
            // 
            btnTinhtien.Font = new Font("Segoe UI", 12F);
            btnTinhtien.Location = new Point(123, 526);
            btnTinhtien.Name = "btnTinhtien";
            btnTinhtien.Size = new Size(98, 40);
            btnTinhtien.TabIndex = 8;
            btnTinhtien.Text = "Tính tiền";
            btnTinhtien.UseVisualStyleBackColor = true;
            btnTinhtien.Click += btnTinhtien_Click;
            // 
            // btnNhapLai
            // 
            btnNhapLai.Font = new Font("Segoe UI", 12F);
            btnNhapLai.Location = new Point(239, 526);
            btnNhapLai.Name = "btnNhapLai";
            btnNhapLai.Size = new Size(94, 40);
            btnNhapLai.TabIndex = 9;
            btnNhapLai.Text = "Nhập lại";
            btnNhapLai.UseVisualStyleBackColor = true;
            btnNhapLai.Click += btnNhapLai_Click;
            // 
            // btnThanhToan
            // 
            btnThanhToan.Font = new Font("Segoe UI", 12F);
            btnThanhToan.Location = new Point(382, 526);
            btnThanhToan.Name = "btnThanhToan";
            btnThanhToan.Size = new Size(98, 40);
            btnThanhToan.TabIndex = 10;
            btnThanhToan.Text = "Thanh toán";
            btnThanhToan.UseVisualStyleBackColor = true;
            btnThanhToan.Click += btnThanhToan_Click;
            // 
            // btnThoat
            // 
            btnThoat.Font = new Font("Segoe UI", 12F);
            btnThoat.Location = new Point(537, 526);
            btnThoat.Name = "btnThoat";
            btnThoat.Size = new Size(75, 40);
            btnThoat.TabIndex = 11;
            btnThoat.Text = "Thoát";
            btnThoat.UseVisualStyleBackColor = true;
            btnThoat.Click += btnThoat_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Font = new Font("Segoe UI", 18F, FontStyle.Bold);
            label4.Location = new Point(37, 593);
            label4.Name = "label4";
            label4.Size = new Size(210, 32);
            label4.TabIndex = 12;
            label4.Text = "Tổng khách hàng";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Font = new Font("Segoe UI", 18F, FontStyle.Bold);
            label5.Location = new Point(37, 645);
            label5.Name = "label5";
            label5.Size = new Size(262, 32);
            label5.TabIndex = 13;
            label5.Text = "Tổng tiền thanh toán ";
            // 
            // txtT_KH
            // 
            txtT_KH.Location = new Point(305, 586);
            txtT_KH.Name = "txtT_KH";
            txtT_KH.Size = new Size(403, 39);
            txtT_KH.TabIndex = 14;
            // 
            // txtT_Money
            // 
            txtT_Money.Location = new Point(305, 642);
            txtT_Money.Name = "txtT_Money";
            txtT_Money.Size = new Size(403, 39);
            txtT_Money.TabIndex = 15;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(13F, 32F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(849, 749);
            Controls.Add(txtT_Money);
            Controls.Add(txtT_KH);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(btnThoat);
            Controls.Add(btnThanhToan);
            Controls.Add(btnNhapLai);
            Controls.Add(btnTinhtien);
            Controls.Add(grb_Menu_Food);
            Controls.Add(grb_Menu_water);
            Controls.Add(cb_Sv);
            Controls.Add(txtSo_Kh);
            Controls.Add(txtTen_KH);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Font = new Font("Segoe UI", 18F);
            Margin = new Padding(6);
            Name = "Form1";
            Text = "Thanh toán tiền ";
            Load += Form1_Load;
            grb_Menu_water.ResumeLayout(false);
            grb_Menu_water.PerformLayout();
            grb_Menu_Food.ResumeLayout(false);
            grb_Menu_Food.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private TextBox txtTen_KH;
        private TextBox txtSo_Kh;
        private CheckBox cb_Sv;
        private GroupBox grb_Menu_water;
        private RadioButton rbCF_Da;
        private RadioButton rbCF_Sua;
        private RadioButton rbCF_SuaDa;
        private RadioButton rbCF_Kem;
        private RadioButton rbCF_Den;
        private GroupBox grb_Menu_Food;
        private Button btnTinhtien;
        private Button btnNhapLai;
        private Button btnThanhToan;
        private Button btnThoat;
        private CheckBox cbMyCay;
        private CheckBox cbMX_Bò;
        private CheckBox cbMT_Trung;
        private CheckBox cbBM_Ca;
        private CheckBox cbBM_Trung;
        private Label label4;
        private Label label5;
        private TextBox txtT_KH;
        private TextBox txtT_Money;
    }
}
