package Modelo;

import java.util.ArrayList;

public class Producto {

        private String nombreProducto;
        private int numeroUnidades;
        private float precioUnidad;


        private ArrayList<Proveedor> proveedor;


        public Producto(String nombreProducto, int numeroUnidades, float precioUnidad) {
                this.nombreProducto = nombreProducto;
                this.numeroUnidades = numeroUnidades;
                this.precioUnidad = precioUnidad;


        }

        public ArrayList<Proveedor> getProveedor() {
                return proveedor;
        }

        public void setProveedor(ArrayList<Proveedor> proveedor) {
                this.proveedor = proveedor;
        }
}
