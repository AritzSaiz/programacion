package com.company.Modelo;

import javax.swing.*;
import java.util.ArrayList;

public class Directivo extends Empleado {

     private String categoria;
     private ArrayList<Empleado> listaEmpleados = null;

    public Directivo(String nombre, int edad, float sueldoBruto, Empresa empresa, String categoria, ArrayList<Empleado> listaEmpleados) {
        super(nombre, edad, sueldoBruto, empresa);
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }

    public void addEmpleado(Empleado empleado) { this.listaEmpleados.add(empleado); }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void mostrarCategoria (){
        JOptionPane.showMessageDialog(null,"Su categoria es: " + this.getCategoria());
    }


}
