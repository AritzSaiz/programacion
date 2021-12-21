package com.company;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String direccion;
    private int codigoPostal;
    private String ciudad;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;


    public Persona(String nombre, String direccion, int codigoPostal, String ciudad, int diaNacimiento, int mesNacimiento, int añoNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
    }

    public Persona(String nombre, String direccion, int codigoPostal, String ciudad) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }


    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDiaNacimiento() {return diaNacimiento;}

    public void setDiaNacimiento(int diaNacimiento) {this.diaNacimiento = diaNacimiento;}

    public int getMesNacimiento() {return mesNacimiento;}

    public void setMesNacimiento(int mesNacimiento) {this.mesNacimiento = mesNacimiento;}

    public int getAñoNacimiento() {return añoNacimiento;}

    public void setAñoNacimiento(int añoNacimiento) {this.añoNacimiento = añoNacimiento;}

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                ", diaNacimiento=" + diaNacimiento +
                ", mesNacimiento=" + mesNacimiento +
                ", añoNacimiento=" + añoNacimiento +
                '}';
    }
}
