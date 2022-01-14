package Modelo;

import javax.swing.*;

public class Empleados extends Persona {

    private float sueldoBruto;

    public Empleados(String nombre, int edad, float sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Este es el salario: "+ this.getSueldoBruto() +
        " su nombre es " + this.getNombre() + "su edad es " + this.getEdad());

    }
}
