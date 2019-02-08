/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_9;

/**
 *
 * @author Antonio
 */
public class Ejercicio_excepciones_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RangoException 
    {
        // TODO code application logic here
        Alumno a1 = new Alumno("Pedro");

        try {
            a1.pedirNotas();
        } catch (Exception e) {
            System.out.println("");
        }

        try {
            a1.modificarNota(0, 0);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        a1.imprimirCalificaciones();
    }

}
