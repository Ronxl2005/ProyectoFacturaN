/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author ronal
 */
public class Docente {
    private String[] profesores = {"Lic. Axel Hitler", "Lic. Alisson Orellana", "Lic. Anderson Naula", "Lic. Anahi Encarnacion", "Lic. Ronal Cueva"};

    public String getProfesor(int index) {
        return (index >= 0 && index < profesores.length) ? profesores[index] : "Docente no existente";
    }
}
