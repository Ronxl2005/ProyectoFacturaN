/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;
import java.util.Scanner;

/**
 *
 * @author jeremy
 */
// ANDERSON
public class Asignaturas {

    private String[] cursos = {"1. MATEMATICAS", "2. BIOLOGIA", "3. INGLES", "4. PORTUGUES", "5. FRANCES"};
    private double[] precios = {100, 100, 120, 120, 120};
    private String[] descripciones = {
        "Curso de matematicas basicas",
        "Curso de biologia general",
        "Curso de ingles para principiantes",
        "Curso de portugues basico",
        "Curso de frances inicial"
    };

    public void mostrarCursos(Docente docentes) {
        System.out.println("\nCursos disponibles:");
        for (int i = 0; i < cursos.length; i++) {
            System.out.printf("%s: %s | Precio: $%.2f | Profesor: %s%n",
                    cursos[i], descripciones[i], precios[i], docentes.profesores[i]);
        }
    }

    public String pedirCursoValido(Scanner sc) {
int opcion = -1;
        boolean valido = false;

        do {
            System.out.print("Seleccione el número del curso (1 al 5): ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); 
                if (opcion >= 1 && opcion <= cursos.length) {
                    valido = true;
                } else {
                    System.out.println("Número fuera de rango, intenta de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                sc.nextLine(); 
            }
        } while (!valido);

        return cursos[opcion - 1];
    }

    public double obtenerPrecio(String curso) {
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i].equals(curso)) {
                return precios[i];
            }
        }
        return 0;
    }
}
