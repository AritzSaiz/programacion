package Modelo;

import javax.swing.*;
import java.util.ArrayList;

public class Directivo extends Empleados {

     private String categoria;
     private ArrayList<Empleados> listaEmpleados = null;

    public Directivo(String nombre, int edad, float sueldoBruto, String categoria, ArrayList<Empleados> listaEmpleados) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void mostrarCategoria (){
        JOptionPane.showMessageDialog(null,"Su categoria es: " + this.getCategoria());
    }


}
