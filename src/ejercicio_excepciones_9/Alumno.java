/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Alumno {

    private static int num_asignaturas = 5;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>(5);

    /**
     * Constructor por defecto de la clase alumno
     */
    public Alumno() {
        nombre = "";
    }

    /**
     * Constructor con parametros de la clase alumno
     *
     * @param nombre nombre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodi get de nombre de la clase Alumno
     *
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set de nombre de la clase Alumno
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que pide las notas del alumno
     *
     * @throws RangoException Si la nota menor que 0 o mayor que 10 lanza la
     * excepcion RangoException
     */
    public void pedirNotas() throws RangoException {
        Scanner teclado = new Scanner(System.in);
        double n1 = 0;
        for (int i = 0; i < num_asignaturas; i++) {
            System.out.println("Introduce la  nota del alumno");
            n1 = teclado.nextDouble();
            notas.add(n1);
        }

        if (n1 < 0 || n1 > 10) {
            throw new RangoException("Error. Nota no válida");
        }
    }

    /**
     * Metodo que modifica las notas del alumno
     *
     * @param posicion es la posicion del array que se quiere cambiar
     * @param nnota es la nota que sequiere cambiar
     * @throws RangoException Si la nota menor que 0 o mayor que 10 lanza la
     * excepcion RangoException
     * @throws IndexOutOfBoundsException si la posicion es mayor a
     * num_asignaturas se lanza la excepcion IndexOutOfBoundsException
     */
    public void modificarNota(int posicion, double nnota) throws RangoException, IndexOutOfBoundsException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la posicion");
        posicion = teclado.nextInt();

        notas.get(posicion);
        System.out.println("Introduce la nota");
        nnota = teclado.nextDouble();
        if (nnota < 0 && nnota > 10) {
            throw new RangoException("Error. Nota no válida");
        }
        if (posicion > num_asignaturas) {
            throw new IndexOutOfBoundsException("Error.Posición no válida");
        }

    }

    /**
     * Metodo que imprime las notas del alumno
     */
    public void imprimirCalificaciones() {
        System.out.println("Nombre del Alumno:" + nombre + "Notas" + notas.toString());
    }


}
