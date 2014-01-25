/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.newplease;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.sql.DataSource;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;


/**
 *
 * @author salih
 */
@Named
@SessionScoped
public class RegisterBean implements Serializable{
    
    
    

    
    private Connection con;
    
    private String emailAddress="3234234";
    private String userName;
    private String password;
    private Date registerDate;
    
    

    

    public RegisterBean(){System.out.print("fdsfsdf");}
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void doRegister() throws SQLException{
        PasswordService dps = new DefaultPasswordService();
        System.out.println("Test succesful");
         //con = ds.getConnection();
         //PreparedStatement ps = con.prepareStatement("insert into user(username, password, email, fullname) values (?, ?, ?, ?)");
        String pass = "333"; 
        String temp = dps.encryptPassword(pass);
         //ps.setString(1, userName);
         //ps.setString(2, temp);
         //ps.setString(3, emailAddress);
         //ps.setString(4, "Salih ERİKCİ");
         //ps.executeUpdate();
        //DatabaseOperations.initializeDB(this);
         System.out.println("AAAA  "+dps.passwordsMatch(pass, temp));
         
         
         
         
        
    }
        
    
}
