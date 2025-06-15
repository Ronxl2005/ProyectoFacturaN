/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagos;
import java.util.Scanner;
import Admin.Asignaturas;


/**
 *
 * @author ronal
 */
// AXEL
public class Pago {
    public void hacerPago(Scanner teclado, String[] cursosElegidos, Asignaturas materias) {
        double totalSinIva = 0;
        for (String curso : cursosElegidos) {
            totalSinIva += materias.obtenerPrecio(curso);
        }

        double iva = totalSinIva * 0.15;
        double totalConIva = totalSinIva + iva;

        confirmarPago(teclado);
        mostrarFactura(cursosElegidos, totalSinIva, iva, totalConIva);
    }

    private void confirmarPago(Scanner teclado) {
        String respuesta;
        do {
            System.out.print("Vas a pagar al contado. Estas de acuerdo? (si/no): ");
            respuesta = teclado.nextLine().toLowerCase();
        } while (!respuesta.equals("si"));
        System.out.println("Pago confirmado.");
    }

    private void mostrarFactura(String[] cursos, double sinIva, double iva, double conIva) {
        System.out.println("\n----- FACTURA -----");
        System.out.println("Cursos comprados:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
        }
        System.out.println("Cantidad total de cursos: " + cursos.length);
        System.out.printf("Total sin IVA: $%.2f%n", sinIva);
        System.out.printf("IVA (15%%): $%.2f%n", iva);
        System.out.printf("Total con IVA: $%.2f%n", conIva);
        System.out.println("Forma de pago: contado");
        System.out.println("--------------------");
    }
}
