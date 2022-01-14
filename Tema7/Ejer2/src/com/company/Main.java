//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import Modelo.Estudio;
import Modelo.Pelicula;
import java.awt.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {
    private static Estudio[] listaEstudios;
    private static ArrayList<Pelicula> listaPeliculas;

    public Main() {
    }

    public static void main(String[] args) {
        try {
            crearEstudios();
            crearPeliculas();
            relacionarPeliculaConEstudio();
            buscarPeliculaMasLarga();
            buscarEstudioConMasPeliculas();
        } catch (Exception var2) {
            JOptionPane.showMessageDialog((Component)null, var2.getClass());
        }

    }

    public static void crearEstudios() throws Exception {
        listaEstudios = new Estudio[5];

        ArrayList<String> telefonos = new ArrayList();
        telefonos.add("111111111");
        telefonos.add("111111112");
        listaEstudios[0] = new Estudio("Universal", "Los Angeles", " C/ a", "www.universal.es", LocalDate.of(1950, 9, 23), "EEUU", telefonos);

        telefonos = new ArrayList();
        telefonos.add("222222222");
        telefonos.add("222222223");
        listaEstudios[1] = new Estudio("Walt Disney", "Los Angeles", " C/ b", "www.disney.es", LocalDate.of(1960, 9, 23), "EEUU", telefonos);

        telefonos = new ArrayList();
        telefonos.add("333333333");
        telefonos.add("333333334");
        listaEstudios[2] = new Estudio();
        listaEstudios[2].setNombre("Warner Bros");
        listaEstudios[2].setPais("EEUU");
        listaEstudios[2].setCiudad("California");
        listaEstudios[2].setDireccion(" C/ c");
        listaEstudios[2].setDirWeb("www.warner.es");
        listaEstudios[2].setTelefonos(telefonos);
        listaEstudios[2].setFechaFundacion(LocalDate.of(1956, 1, 10));
        listaEstudios[3] = new Estudio("Paramount", "Los Angeles", " C/ d", "www.paramount.es", LocalDate.of(1955, 9, 23), "EEUU");
        listaEstudios[3].setTelefono("444444444");
        listaEstudios[3].setTelefono("444444445");

        telefonos = new ArrayList();
        telefonos.add("555555555");
        telefonos.add("555555556");
        listaEstudios[4] = new Estudio("20Th Century Fox", "Los Angeles", " C/ e", "www.fox.es", LocalDate.of(1953, 9, 23), "EEUU", telefonos);
    }

    public static void crearPeliculas() throws Exception {
        listaPeliculas = new ArrayList();

        ArrayList<Estudio> lista = new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[2]);
        Pelicula p = new Pelicula("ET", 1980, 90.7F, "Infantil", lista);
        listaPeliculas.add(p);
        int año = 1997;

        lista = new ArrayList();
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        listaPeliculas.add(new Pelicula("Titanic", año, 180.0F, "Romántica", lista));

        año = 2003;
        lista = new ArrayList();
        lista.add(listaEstudios[4]);
        listaPeliculas.add(new Pelicula("El señor de los anillos", año, 133.0F, "Ciencia ficción", lista));

        año = 2003;
        lista = new ArrayList();
        lista.add(listaEstudios[3]);
        lista.add(listaEstudios[4]);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        listaPeliculas.add(new Pelicula("Piratas del Caribe", año, 220.0F, "Aventuras", lista));

        año = 1994;
        lista = new ArrayList();
        lista.add(listaEstudios[1]);
        listaPeliculas.add(new Pelicula("El rey león", año, 97.0F, "Infantil", lista));
    }

    public static void buscarPeliculaMasLarga() throws Exception {
        float maximo = 0.0F;
        Pelicula objeto = null;

        for(int x = 0; x < listaPeliculas.size(); ++x) {
            if (((Pelicula)listaPeliculas.get(x)).getDuracion() > maximo) {
                maximo = ((Pelicula)listaPeliculas.get(x)).getDuracion();
                objeto = (Pelicula)listaPeliculas.get(x);
            }
        }

        String mensaje = "";

        for(int x = 0; x < objeto.getListaEstudios().size(); ++x) {
            mensaje = mensaje + " " + ((Estudio)objeto.getListaEstudios().get(x)).getNombre();
        }

        JOptionPane.showMessageDialog((Component)null, " La pelicula más larga es " + objeto.getTitulo() + " y se ha producido en " + mensaje);
    }

    public static void buscarEstudioConMasPeliculas() throws Exception {
        int[] numeroPeliculas = new int[5];
        Arrays.fill(numeroPeliculas, 0);

        int z;
        int x;
        for(z = 0; z < listaEstudios.length; ++z) {
            for(x = 0; x < listaPeliculas.size(); ++x) {
                boolean salir = false;

                for(int y = 0; y < ((Pelicula)listaPeliculas.get(x)).getListaEstudios().size() && !salir; ++y) {
                    if (((Estudio)((Pelicula)listaPeliculas.get(x)).getListaEstudios().get(y)).equals(listaEstudios[z])) {
                        int var10002 = numeroPeliculas[z]++;
                        salir = true;
                    }
                }
            }
        }

        z = 0;
        x = 0;

        for( x = 0; x < numeroPeliculas.length; ++x) {
            if (numeroPeliculas[x] > z) {
                z = numeroPeliculas[x];
                x = x;
            }
        }

        JOptionPane.showMessageDialog((Component)null, "El estudio que más películas ha producido es: " + listaEstudios[x].getNombre() + " y ha producido " + z);
    }

    public static void relacionarPeliculaConEstudio(){

        ArrayList<Pelicula> lista = new ArrayList<>();

        


    }
}

