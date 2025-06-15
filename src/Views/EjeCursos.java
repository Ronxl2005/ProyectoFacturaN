/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;
import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class EjeCursos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejecutor ej = new Ejecutor(sc);
        ej.iniciar();
        sc.close();
    }
}
