using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace QL_ThuVien
{
    public class Ketnoi
    {
        SqlConnection conn;
        SqlCommand cmd;
        SqlDataAdapter adapter;
        DataSet data;
        public Ketnoi()
        {
            String str = @"Data Source=HUNG;Initial Catalog=QLThuVien;Integrated Security=True;Encrypt=False";
            conn = new SqlConnection(str);
        }
        public SqlConnection getConnection()
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
                    MessageBox.Show("Lỗi kết nối, vui lòng kiểm tra Connection str ", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
            }
        }
        public void closeConnection()
        {
            if (ConnectionState.Open == conn.State)
            {
                try
                {
                    conn.Close();
                }
                catch
                {
                    MessageBox.Show("ERROR", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }
        public DataTable Execute(String query) {
            DataTable dt  = new DataTable();
            openConnection();
            try
            {
                adapter = new SqlDataAdapter(query, conn);
                adapter.Fill(dt);
            }
            catch (Exception ex)
            {

            }
            finally
            {
                closeConnection();
            }
            return dt;
        }
        public void ExecuteNonQuery(String query)
        {
            openConnection();
            try
            {
                cmd = conn.CreateCommand();
                cmd.CommandText = query;
                cmd.ExecuteNonQuery();
            }
            catch
            {
                MessageBox.Show("ERROR", "Thông báo", MessageBoxButtons.OK, MessageBoxIcon.Error);
            } 
            finally
            {
                closeConnection();
            }
        }
    }
}
