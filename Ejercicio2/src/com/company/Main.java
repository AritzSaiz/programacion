package com.company;

import com.company.Vista.Portada;
import com.company.Vista.Ventana2;

import javax.swing.*;

public class Main {

    JFrame portada = new JFrame();

    public static void main(String[] args) {

        JFrame portada = new JFrame("Portada");
        portada.setContentPane(new Portada().getPanel1());
        portada.setLocationRelativeTo(null);
        portada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        portada.pack();
        portada.setVisible(true);


    }

    public static void ventana2(){

        JFrame v2 = new JFrame("Ventana2");
        v2.setContentPane(new Ventana2().getVentana2());
        v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v2.setLocationRelativeTo(null);
        v2.pack();
        v2.setVisible(true);


    }

}
