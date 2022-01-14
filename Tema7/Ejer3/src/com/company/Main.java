package com.company;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        crearEmpleados();
        mostrarAtributos();
        crearClientes();


    }

    public static void mostrarAtributos(){



    }

    public static void crearEmpleados(){

        Empleados empleado = new Empleados("Antonio", 40, 1100);
        Empleados emplado1 = new Empleados("Gorka", 20, 950);
        Empleados empleado2 = new Empleados("Carlos", 46, 1500);


    }

    public  static void crearClientes(){

        Cliente cliente = new Cliente("Alfonso", 55, 1232456876);
        Cliente cliente1 = new Cliente("Iker", 24, 234567865);
        Cliente cliente2 = new Cliente("Sara", 30,34654321);

    }

    public static void crearEmpresa(){

        Empresa empresa = new Empresa();


    }

}
