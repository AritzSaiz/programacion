package com.company.Vista;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Portada {
    private JPanel panel1;
    private JButton bGuardar;

    public Portada() {
        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.ventana2();

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
