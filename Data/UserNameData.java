/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mamon
 */

      public class UserNameData {
    
    public UserLogin Login(String user , String pass) throws SQLException,ClassNotFoundException
   {
        UserLogin userl = null;
        try (Connection con = Connect.getConnect())
        {
            userl = new UserLogin();
            java.sql.Statement st = con.createStatement();
            String sql = "SELECT * FROM  ThuThu WHERE UserName = '"+user+"' and PassWord = '"+pass+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                userl=new UserLogin();
                userl.setUser(rs.getString("UserName"));
                userl.setPass(rs.getString("PassWord"));
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Lỗi "+e.getMessage());
        }
        return userl;
   }
    
        
    
}
  
    

