package Modelo;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {

    private String nombreEmpresa;

    private ArrayList <Cliente> listaClientes;
    private ArrayList <Empleados> listaEmpleados;

    public Empresa(String nombreEmpresa, ArrayList<Cliente> listaClientes, ArrayList<Empleados> listaEmpleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaClientes = listaClientes;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void mostrarNombreEmpresa (){
        JOptionPane.showMessageDialog(null,"El nombre de la empresa es es: " + this.getNombreEmpresa());
    }
}
