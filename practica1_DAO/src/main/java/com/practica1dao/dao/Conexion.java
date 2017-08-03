package com.practica1dao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {


    protected Connection conexion;
    
    //nombre Driver jdbc y url base de datos
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://:3306/practica1DAO";
    
    //usuario y contraseña mysql
    private final String USER = "root";
    private final String PASS = "root";
    

    //credenciales para conexion a la BD
    public void conectar() throws Exception{
        
        try {
            
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            
        } catch (Exception e) {
        
            throw e;
        
        }
        
    }
    
    public void cerrar() throws SQLException{
        
        if(conexion != null){
            if(!conexion.isClosed()){
                
                conexion.close();
            }
        }
        
    }
    
}
