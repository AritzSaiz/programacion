package com.company.Modelo;

import javax.swing.*;

public class Empleado extends Persona {

    private float sueldoBruto;
    private Empresa empresa;

    public Empleado(String nombre, int edad, float sueldoBruto, Empresa empresa) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Este es el salario: "+ this.getSueldoBruto() +
        ", su nombre es " + this.getNombre() + ", su edad es " + this.getEdad());

    }
}
