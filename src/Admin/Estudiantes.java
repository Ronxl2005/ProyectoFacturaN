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
public class Estudiantes {
    private String usuario;
    private String contrasena;
    private Scanner sc;

    public Estudiantes(Scanner sc) {
        this.sc = sc;
    }

    public void registrarUsuario() {
        System.out.print("Ingrese nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        contrasena = sc.nextLine();
    }

    public boolean login() {
        System.out.print("Usuario: ");
        String usuarioInput = sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasenaInput = sc.nextLine();
        return usuario.equals(usuarioInput) && contrasena.equals(contrasenaInput);
    }
}
