/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class userDao {
    public boolean check(user u)
    {
        boolean flag=false;
        try
        {
            String url="jdbc:mysql://localhost:3306/mukul";
            String name="root";
            String pwd = "";
            Connection con =DriverManager.getConnection(url,name,pwd);
            Statement stmt = con.createStatement();
             String qr = "select *from users where name='"+u.getName()+"' and password='"
                     + u.getpass()+"'";
             ResultSet rs = stmt.executeQuery(qr);
             flag = rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
}
