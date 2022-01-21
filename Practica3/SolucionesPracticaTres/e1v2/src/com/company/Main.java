package com.company;

import Modelo.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Excepciones.*;

public class Main {

    // "Base de datos"
    private static ArrayList<Veterinario> listaVeterinarios;
    private static ArrayList<Mascota> ListaMascotas;


    public static void main(String[] args) {
	    try
        {
            guardarDatos();
            guardarMascotas();

        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"El programa termina");
        }
        catch(Exception e)
        {
            System.out.println("Problemas: " + e.getClass());
        }

    }

    public static void guardarMascotas(){

       ListaMascotas.add( new Mascota(solicitarNombreMascota(),solicitarRaza(),solicitarFechaNacimiento(),solicitarPeso(),solicitarSexoMascota(),solicitarLongitud(),solicitarColor()));

    }

    public static String solicitarNombreMascota(){

        String nombreMascota = "";

        try {
          nombreMascota = JOptionPane.showInputDialog(null,"Cual es el nombre de tu mascota?");
        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null,"No se puede poner numeros");
        }

        return nombreMascota;


    }


    public static String solicitarRaza(){

        String raza = "";

        try {
            raza = JOptionPane.showInputDialog(null,"Dime que raza es tu perro");

        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null,"No se puede poner numeros");
        }

        return raza;

    }


    public static LocalDate solicitarFechaNacimiento(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString = JOptionPane.showInputDialog(null,"Dime la fecha de nacimiento de tu mascota (dd/MM/yyyy)");
        LocalDate fechaNacimiento = LocalDate.parse(fechaString,formatter);

        return fechaNacimiento;

    }

    public static float solicitarPeso(){

        float peso;

        peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Dime el peso de tu mascota"));

        return peso;

    }

    public static String solicitarSexoMascota(){

        String sexoMascota;

        sexoMascota = JOptionPane.showInputDialog(null,"Dime si su sexo es MASCULINO o FEMENINO");

        return sexoMascota;

    }


    public static float solicitarLongitud(){

        float longitud;

        longitud = Float.parseFloat(JOptionPane.showInputDialog(null,"Cuanto mide tu mascota"));

        return longitud;

    }


    public static String solicitarColor(){

        String color;

        color = JOptionPane.showInputDialog(null,"Dime el color de tu perro");

        return color;

    }



    public static void guardarDatos() throws Exception
    {
        // Solicitar, validar y guardar los datos de los clientes, de las mascotas y de los veterinarios.
        guardarVeterinarios();

    }

    public static void guardarVeterinarios() throws Exception
    {
        boolean seguir = true;
        listaVeterinarios = new ArrayList<>();
        while(seguir)
        {
            listaVeterinarios.add(new Veterinario(solicitarNombre(),solicitarDireccion(),solicitarTelefono(),solicitarDni(),solicitarNss()));
            int respuesta = JOptionPane.showConfirmDialog(null,"¿Hay más veterinarios?");
            if (respuesta != 0)
                seguir = false;
        }
    }

    public static String solicitarDireccion() throws Exception
    {
        String direccion="";
        boolean error = true;
        while(error)
        {
            try
            {
                direccion = JOptionPane.showInputDialog("Teclea dirección");
                if (direccion.isEmpty())
                    throw new DatoNoValido("La dirección es un campo obligatorio");
                // C/ Portal De Villarreal 19 5A
                Pattern pat = Pattern.compile("^C/ [A-Z][a-z]+([ ][A-Z][a-z]+)* [0-9]{1,3} [0-9][a-zA-Z]$");
                Matcher mat = pat.matcher(direccion);
                if (!mat.matches())
                    throw new DatoNoValido("La dirección no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return direccion;
    }

    public static String solicitarNombre() throws Exception
    {
        String nombre="";
        boolean error = true;
        while(error)
        {
            try
            {
                nombre = JOptionPane.showInputDialog("Teclea el nombre");
                if (nombre.isEmpty())
                    throw new DatoNoValido("El nombre es un campo obligatorio");
                Pattern pat = Pattern.compile("^[A-Z][a-z]+([ ][A-Z][a-z]+)*$");
                Matcher mat = pat.matcher(nombre);
                if (!mat.matches())
                    throw new DatoNoValido("El nombre no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nombre;
    }

    public static String solicitarTelefono() throws Exception
    {
        String telefono="";
        boolean error = true;
        while(error)
        {
            try
            {
                telefono = JOptionPane.showInputDialog("Teclea el telefono");
                if (telefono.isEmpty())
                    throw new DatoNoValido("El telefono es un campo obligatorio");
                Pattern pat = Pattern.compile("^[6789][0-9]{8}$");
                Matcher mat = pat.matcher(telefono);
                if (!mat.matches())
                    throw new DatoNoValido("El teléfono no tiene un formato adecuado");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return telefono;
    }

    public static String solicitarDni() throws Exception
    {
        String dni="";
        boolean error = true;
        while(error)
        {
            try
            {
                dni = JOptionPane.showInputDialog("Teclea el dni");
                if (dni.isEmpty())
                    throw new DatoNoValido("El dni es un campo obligatorio");
                Pattern pat = Pattern.compile("^[0-9]{8}[A-Za-z]$");
                Matcher mat = pat.matcher(dni);
                if (!mat.matches())
                    throw new DatoNoValido("El dni no tiene un formato adecuado");
                // Array para validar la letra.
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return dni;
    }

    public static String solicitarNss() throws Exception
    {
        String nss="";
        boolean error = true;
        while(error)
        {
            try
            {
                nss = JOptionPane.showInputDialog("Teclea el número de la seguridad social");
                if (nss.isEmpty())
                    throw new DatoNoValido("El número de la seguridad social es un campo obligatorio");
                // https://cursos.com/blog/numero-seguridad-social/#:~:text=El%20N%C3%BAmero%20de%20la%20Seguridad%20Social%20est%C3%A1%20compuesto%20por%20nueve,%C3%BAltimos%20d%C3%ADgitos%20son%20de%20control.
                Pattern pat = Pattern.compile("^01 [0-9]{8} [0-9]{2}$");
                Matcher mat = pat.matcher(nss);
                if (!mat.matches())
                    throw new DatoNoValido("El número de la seguridad social no tiene un formato adecuado");
                error = false;
                // faltan las validaciones de los dígitos de control
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return nss;
    }

    public static void menuInicio(){

        String menu;

        do {

             menu = JOptionPane.showInputDialog(null,"Que quieres saber: \n" +
                    "a)Mostrar el numero de clientes que poseen un tipo de animal\n" +
                    "b)Datos personales del cliente a partir del nombre de mascota"+
                    "c)Datos del veterinario a partir de la mascota\n" +
                    "d)Datos de las mascotas de un cliente\n" +
                    "e)Datos de las mascotas de un veterinario\n" +
                    "f)Terminar");

            switch (menu){

                case "a":
                    clientesTipoAnimal();
                    break;
                case "b":
                    datosCliente();
                    break;
                case "c":
                    datosVeterinarioapartirMascota();
                    break;
                case "d":
                    datosMascota();
                    break;
                case "e":
                    datosVeterinario();
                    break;
                case "f":JOptionPane.showMessageDialog(null,"El progrsma a terminado");
                    break;
            }

        }while (menu.equalsIgnoreCase("f"));

    }



    public static void clientesTipoAnimal(){


    }


    public static void datosCliente(){

    }


    public static void datosVeterinarioapartirMascota(){

    }


    public static void datosMascota(){

    }

    public static void datosVeterinario(){

    }

}
