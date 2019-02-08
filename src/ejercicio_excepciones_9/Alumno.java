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
public class Alumno 
{
 private static int num_asignaturas = 5;
 private String nombre;
 private ArrayList<Double> notas = new ArrayList<>(5);

    public Alumno() 
    {
        nombre ="";
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void pedirNotas() throws RangoException 
    {
        Scanner teclado = new Scanner(System.in);
        double n1, n2,n3,n4,n5;
        System.out.println("Introduce la primera nota del alumno");
        n1 = teclado.nextDouble();
        System.out.println("Introduce la segunda nota del alumno");
        n2 = teclado.nextDouble();
        System.out.println("Introduce la tercera nota del alumno");
        n3 = teclado.nextDouble();
        System.out.println("Introduce la cuarta nota del alumno");
        n4 = teclado.nextDouble();
        System.out.println("Introduce la quinta nota del alumno");
        n5 = teclado.nextDouble();
        
        if (n1<10&&n1>0||n2<10&&n2>0||n3<10&&n3>0||n4<10&&n4>0||n5<10&&n5>0) 
        {
            throw new RangoException("Error. Nota no válida");
        }
    }
    public void modificarNota(int posicion, double nnota) throws RangoException,IndexOutOfBoundsException
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la posicion");
        posicion = teclado.nextInt();
        
        notas.get(posicion);
        System.out.println("Introduce la nota");
        nnota = teclado.nextDouble();
        if (nnota<10&&nnota>0) 
        {
            throw new RangoException("Error. Nota no válida");
        }
        
    }
        
 
}
