package com.company.Modelo.BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {

    private String login = "root";
    private String password = "usbw";
    private String url = "jdbc:mysql://localhost: 3307/Ejercicio2";


    private Connection connection;

    public BaseDatos() throws Exception{

        Class.forName("com.mysql.cj.jbdc.Driver");

        connection = DriverManager.getConnection(url,login,password);


        if(connection== null){

            throw new Exception("Problmas con la conexion");

        }

    }

    public void desconectar() throws Exception{
        connection.close();
    }


}
