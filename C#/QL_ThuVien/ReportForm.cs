using CrystalDecisions.CrystalReports.Engine;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace QL_ThuVien
{
    public partial class ReportForm : Form
    {
        public ReportForm()
        {
            InitializeComponent();
        }
        public void LoadReport(string reportPath, string maDocGia)
        {
            try
            {
                // Tạo instance của ReportDocument
                ReportDocument reportDoc = new ReportDocument();

                // Tải báo cáo từ tệp .rpt
                reportDoc.Load(reportPath);

                // Nếu báo cáo có tham số, thiết lập giá trị cho tham số
                if (reportDoc.DataDefinition.ParameterFields.Count > 0)
                {
                    reportDoc.SetParameterValue("MaDocGia", maDocGia);
                }

                // Gán báo cáo cho CrystalReportViewer
                crystalReportViewer1.ReportSource = reportDoc;
                crystalReportViewer1.Refresh();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Có lỗi xảy ra: " + ex.Message);
            }
        }
    }
}

