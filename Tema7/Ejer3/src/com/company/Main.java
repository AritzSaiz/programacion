package com.company;

import com.company.Modelo.Cliente;
import com.company.Modelo.Directivo;
import com.company.Modelo.Empleado;
import com.company.Modelo.Empresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Directivo> listaDirectivos = new ArrayList<>();
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();



        listaEmpleados = crearEmpleados();
        listaDirectivos = crearDirectivos(listaEmpleados);
        mostrarDirectivoConMasEmpleados(listaDirectivos);

        //listaClientes = crearClientes();
        //listaEmpresas = crearEmpresas(listaClientes, listaEmpleados);

        System.out.println(listaEmpleados);

    }

    public static void mostrarDirectivoConMasEmpleados(ArrayList<Directivo> directivos) {
        int max = -1;
        Directivo directivoConMasEmpleados = null;

        for (Directivo directivo : directivos) {
            if (directivo.getListaEmpleados().size() > max) {
                directivoConMasEmpleados = directivo;
                max = directivo.getListaEmpleados().size();
            }
        }

        if (directivoConMasEmpleados != null)
            directivoConMasEmpleados.mostrar();
    }

    public static ArrayList<Directivo> crearDirectivos(ArrayList<Empleado> listaEmpleados) {
        ArrayList<Directivo> listaDirectivos = new ArrayList<>();

        ArrayList<Empleado> empleadosD1 = new ArrayList<>();
        empleadosD1.add(listaEmpleados.get(0));
        empleadosD1.add(listaEmpleados.get(1));
        empleadosD1.add(listaEmpleados.get(2));
        Directivo d1 = new Directivo("Aritz", 20, 1800, null, "Comercio", empleadosD1);

        ArrayList<Empleado> empleadosD2 = new ArrayList<>();
        empleadosD2.add(listaEmpleados.get(3));
        empleadosD2.add(listaEmpleados.get(4));
        Directivo d2 = new Directivo("Dani", 30, 1750, null, "Comercio", empleadosD2);

        listaDirectivos.add(d1);
        listaDirectivos.add(d2);
        return listaDirectivos;
    }

    public static ArrayList<Empleado> crearEmpleados(){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Empleado empleado = new Empleado("Antonio", 40, 1100, null);
        Empleado empleado1 = new Empleado("Gorka", 20, 950, null);
        Empleado empleado2 = new Empleado("Carlos", 46, 1500, null);
        Empleado empleado3 = new Empleado("Juan", 19, 1500, null);
        Empleado empleado4 = new Empleado("María", 35, 1500, null);

        listaEmpleados.add(empleado);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado4);

        return listaEmpleados;
    }

    public static ArrayList<Cliente> crearClientes(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente = new Cliente("Alfonso", 55, 1232456876);
        Cliente cliente1 = new Cliente("Iker", 24, 234567865);
        Cliente cliente2 = new Cliente("Sara", 30,34654321);






        return listaClientes;
    }

    public static ArrayList<Empresa> crearEmpresas(ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleados){
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();

        Empresa empresaVacia = new Empresa("Empresa sin empleados ni clientes", new ArrayList<Cliente>(), new ArrayList<Empleado>());

        // Creamos lista de empleados de la empresa
        ArrayList<Empleado> empleadosE1 = new ArrayList<>();
        empleadosE1.add(listaEmpleados.get(0));
        empleadosE1.add(listaEmpleados.get(1));
        empleadosE1.add(listaEmpleados.get(2));

        // Creamos lista de clientes de la empresa
        ArrayList<Cliente> clientesE1 = new ArrayList<>();
        // ....

        // Creamos la empresa
        Empresa empresa1 = new Empresa("Ejemplo", clientesE1, empleadosE1);
        // Cuando la empresa ha sido creada, se la ponemos a los empleados que hemos añadido a dicha empresa
        listaEmpleados.get(0).setEmpresa(empresa1);
        listaEmpleados.get(1).setEmpresa(empresa1);
        listaEmpleados.get(2).setEmpresa(empresa1);
        // Y también a los clientes
        // ....


        return listaEmpresas;
    }

}
