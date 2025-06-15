/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;
import Admin.*;
import pagos.Pago;
import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Ejecutor {
    private Scanner sc;
    private Estudiantes estudiante;
    private Asignaturas materias;
    private Docente docentes;
    private Pago pagos;

    public Ejecutor(Scanner sc) {
        this.sc = sc;
        materias = new Asignaturas();
        docentes = new Docente();
        pagos = new Pago();
    }

    public void iniciar() {
        System.out.println("=== Crear cuenta ===");
        estudiante = new Estudiantes(sc);
        estudiante.registrarUsuario();

        System.out.println("\n=== Iniciar sesión ===");
        while (!estudiante.login()) {
            System.out.println("Usuario o contraseña incorrectos. Intente de nuevo.");
        }

        materias.mostrarCursos(docentes);

        int cantidad = pedirCantidadCursos();
        String[] cursosSeleccionados = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            cursosSeleccionados[i] = materias.pedirCursoValido(sc);
        }

        pagos.hacerPago(sc, cursosSeleccionados, materias);
    }

    private int pedirCantidadCursos() {
        int cantidad;
        do {
            System.out.print("\nIngrese cantidad de cursos (1-5): ");
            while (!sc.hasNextInt()) {
                System.out.print("Número inválido. Intente 1-5: ");
                sc.next();
            }
            cantidad = sc.nextInt();
            sc.nextLine();
        } while (cantidad < 1 || cantidad > 5);
        return cantidad;
    }
}
