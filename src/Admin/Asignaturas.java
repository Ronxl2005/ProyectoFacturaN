/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;
import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Asignaturas {
    private String[] cursos = {"matematicas", "biologia", "ingles", "portugues", "frances"};
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
                cursos[i], descripciones[i], precios[i], docentes.getProfesor(i));
        }
    }

    public String pedirCursoValido(Scanner sc) {
        String curso;
        boolean valido;
        do {
            System.out.print("Ingrese el nombre del curso: ");
            curso = sc.nextLine().toLowerCase();
            valido = false;
            for (String c : cursos) {
                if (c.equals(curso)) {
                    valido = true;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Curso inadmisible , intenta de nuevo.");
            }
        } while (!valido);
        return curso;
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
