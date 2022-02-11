package com.company;

import Ventanas.Vista;
import javax.swing.*;
import Modelo.*;
import java.util.ArrayList;



public class Main {

    private static ArrayList<Proveedor> proveedor = new ArrayList<>();



    public static void main(String[] args) {

        JFrame frame = new JFrame("Vista");
        frame.setContentPane(new Vista().getAlmacen());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

    public static void listaProducto(){

        ArrayList<Producto> producto  = new ArrayList<>();

        producto.add(new Producto("Leche", 1,3.20f));





    }




}
