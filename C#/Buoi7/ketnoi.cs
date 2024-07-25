using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Configuration;
namespace Buoi7
{
    public class ketnoi
    {
        private SqlConnection conn;
        public ketnoi()
        {
            // String str = @"Data Source=HUNG;Initial Catalog=QLDiemSV;Integrated Security=True;Encrypt=False";
            // conn = new SqlConnection(str);
            //string str = @"Data Source=PHONGDANG-LAPTO\PHONGDANG;Initial Catalog=QLDiemSV;Integrated Security=True;Encrypt=False";
            String std = ConfigurationManager.ConnectionStrings["ketnoi"].ConnectionString;
            conn = new SqlConnection(std);
        }

        public SqlConnection getConn()
        {
            return conn;
        }
        public void openConnection()
        {
            if (ConnectionState.Closed == conn.State)
            {
                try
                {
                    conn.Open();
                }
                catch
                {
                    MessageBox.Show("Kiểm tra kết nối!");
                }
            }
        }
        public void closeConnection()
        {
            if (ConnectionState.Closed == conn.State)
            {
                try
                {
                    conn.Close();
                }
                catch
                {
                    MessageBox.Show("Kiểm tra kết nối!");
                }
            }
        }
        public DataTable Execute(String query)
        {
            DataTable dt = new DataTable();
            openConnection();
            SqlCommand cmd = conn.CreateCommand();
            cmd.CommandText = query;
            SqlDataAdapter adapter = new SqlDataAdapter(cmd);
            adapter.Fill(dt);
            closeConnection();
            return dt;
        }
        // query INSERT, DELETE, UPDATE
        public void ExecuteNonQuery(String query)
        {
            openConnection();
            SqlCommand cmd = conn.CreateCommand();
            cmd.CommandText = query;
            cmd.ExecuteNonQuery();
            closeConnection();
        }
    }
}
