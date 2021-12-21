package com.company;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

   public static String ticket = "";
    public static String nombre;

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();


        String direccion;
        int codigoPostal;
        String ciudad;
        int continuar = 0;






        do{
            try {
                nombre = JOptionPane.showInputDialog(null,"Dime tu nombre");

                ticket += "DATOS DE" + nombre + ": \n" + "---------------------------"  ;



                ciudad = JOptionPane.showInputDialog(null,"En que ciudad vives "+ nombre +"?" );
                direccion = JOptionPane.showInputDialog(null,"Teclea tu dirrecion de vivienda");
                codigoPostal = Integer.parseInt(JOptionPane.showInputDialog(null,"Dime tu codigo postal"));

                ticket += "VIVE EN " + ciudad +"/n" + "DIRECCION DE VIVIENDA: " + direccion + "/n" + "CODIGO POSTAL: " + codigoPostal ;

                Persona persona = new Persona(nombre, direccion, codigoPostal, ciudad);
                personas.add(persona);

                continuar = JOptionPane.showConfirmDialog(null,"Quieres continuar metiendo datos?");

            } catch (Exception e){}


        }while (continuar ==0 );

        JOptionPane.showMessageDialog(null,ticket);

    }

    public static void ciudad(ArrayList<Persona> personas){
        //Saber cuantas personas viven en elche
        int numero = 0;
        for (Persona persona: personas) {
            if (persona.getCiudad().equalsIgnoreCase("elche")) {
                numero++;
            }
        }

        JOptionPane.showMessageDialog(null, "El número de personas que viven en Elche es: " + numero);

    }

    public static void edadMayor(ArrayList<Persona> personas){
        //La persona con mas edad de todas

        int edadMin = 0;
        String personaMasMayor;
        int diaNacimiento;
        int mesNacimiento;
        int añoNacimiento;


        diaNacimiento= Integer.parseInt(JOptionPane.showInputDialog(null,"Dime el dia en el que naciste"));
        mesNacimiento= Integer.parseInt(JOptionPane.showInputDialog(null,"Dime el mes en el que naciste"));
        añoNacimiento= Integer.parseInt(JOptionPane.showInputDialog(null,"Dime el año en el que naciste"));


        LocalDate nacimiento= LocalDate.of(añoNacimiento,mesNacimiento,diaNacimiento);
        LocalDate hoy= LocalDate.now();
        Period periodo = Period.between(nacimiento,hoy);
        periodo.getYears();
        System.out.println(periodo.getYears());
        ticket+= "EDAD: " + periodo.getYears() + "/n";


        for (Persona persona:personas) {
            if (periodo.getYears()>edadMin){

                edadMin = periodo.getYears();
                personaMasMayor = persona.getNombre();
                nombre=persona.getNombre();

            }

        }

        JOptionPane.showMessageDialog(null,"La persona mas mayor" + nombre + "su edad es de " + edadMin);





    }




    public static void personasMayoresEdad(ArrayList<Persona> personas
    ){
        //Tengo que ver todas las personas mayores de edad

        int contador;

        for (Persona persona: personas) {

           //No me a dado tiempo a hacerlo


        }


    }


}
