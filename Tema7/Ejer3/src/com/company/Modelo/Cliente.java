package com.company.Modelo;

import javax.swing.*;

public class Cliente extends Persona {

    private int telefono;

    public Cliente(String nombre, int edad, int telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"Su telefono es " + this.telefono
        + ", tiene " + this.getEdad()+ " años y se llama" + this.getNombre());
    }

}
