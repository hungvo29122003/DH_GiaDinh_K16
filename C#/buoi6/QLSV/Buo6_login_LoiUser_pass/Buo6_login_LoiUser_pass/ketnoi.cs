using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Buo6_login_LoiUser_pass
{
    public class ketnoi
    {
        SqlConnection conn;
        public ketnoi()
        {
            String  str= @"Data Source=Hung;Initial Catalog=QLCongty;Integrated Security=True;Encrypt=True";
            conn = new SqlConnection(str);
        }
        public DataTable Execute(String query)
        {
            return;
        }
       
    }
}
