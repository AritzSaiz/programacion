package Ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista {
    private JTextField textProducto;
    private JTextField textUnidades;
    private JRadioButton compraRadioButton;
    private JRadioButton ventaRadioButton;
    private JTextField textPrecioCompra;
    private JComboBox comboBox1;
    private JCheckBox porVolumenCheckBox;
    private JCheckBox porProntoPagoCheckBox;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JPanel Almacen;
    private JLabel labelAlmacen;
    private JTextField textImporteVenta;
    private JLabel labelProducto;
    private JLabel labelUnidades;
    private JLabel labelPrecioCompra;
    private JLabel labelProveedor;
    private JLabel labelPrecioVenta;
    private JLabel labelCliente;
    private JPanel panelCompras;
    private JPanel panelVenta;
    private JPanel panelOperaciones;
    private JTextField textField1;
    private JTextField textField2;

    public Vista(JTextField textProducto, JTextField textUnidades, JRadioButton compraRadioButton, JRadioButton ventaRadioButton, JTextField textPrecioCompra, JCheckBox porVolumenCheckBox, JCheckBox porProntoPagoCheckBox, JButton aceptarButton, JButton cancelarButton, JTextField textImporteVenta, JTextField textField1, JTextField textField2) {
        this.textProducto = textProducto;
        this.textUnidades = textUnidades;
        this.compraRadioButton = compraRadioButton;
        this.ventaRadioButton = ventaRadioButton;
        this.textPrecioCompra = textPrecioCompra;
        this.porVolumenCheckBox = porVolumenCheckBox;
        this.porProntoPagoCheckBox = porProntoPagoCheckBox;
        this.aceptarButton = aceptarButton;
        this.cancelarButton = cancelarButton;
        this.textImporteVenta = textImporteVenta;
        this.textField1 = textField1;
        this.textField2 = textField2;
    }

    public Vista() {
        compraRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelVenta.setVisible(false);
                panelCompras.setVisible(true);
            }
        });
        ventaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelCompras.setVisible(false);
                panelVenta.setVisible(true);

            }
        });

        aceptarButton.setEnabled(false);
    }



    public JPanel getAlmacen() {
        return Almacen;
    }

    public void setAlmacen(JPanel almacen) {
        Almacen = almacen;
    }



}
