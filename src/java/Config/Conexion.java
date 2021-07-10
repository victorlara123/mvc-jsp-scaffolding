/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;


import java.sql.*;

/**
 *
 * @author Windows7
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error"+e);
        }
    }
    public Connection getConecction(){
        return con;
    }
    
    
    public static void main(String[] args){
    Conexion cn=new Conexion();
    cn.getConecction();

    }
    
}


