import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Scanner myScanner2 = new Scanner(System.in);
        Scanner myScanner3 = new Scanner(System.in);
        System.out.println("Bienvenido al Evaluador de Clases");
        System.out.println("Ingresa la calificación de materia 1" + '\n');
        Integer calificacionUno = myScanner.nextInt();
        System.out.println("Ingresa la calificación de materia 2" + '\n');
        Integer calificacionDos = myScanner2.nextInt();
        System.out.println("Ingresa la calificación de materia 3" + '\n');
        Integer calificacionTres = myScanner3.nextInt();
        String materia;

        if (calificacionUno == 10) {
            materia = "Excelente";
        } else if (calificacionUno > 5 && calificacionUno <= 8) {
            materia = "Aceptable";
        } else if (calificacionUno > 3 && calificacionUno <= 5) {
            materia = "Insuficiente";
        } else if (calificacionTres <=3 && calificacionTres > 0) {
            materia = "No aprobado";
        } else {
            materia = "La entrada es inválida";
        }
        System.out.println(materia);

        if (calificacionDos == 10) {
            materia = "Excelente";
        } else if (calificacionDos > 5 && calificacionDos <= 8) {
            materia = "Aceptable";
        } else if (calificacionDos > 3 && calificacionDos <= 5) {
            materia = "Insuficiente";
        } else if (calificacionDos <=3 && calificacionDos > 0) {
            materia = "No aprobado";
        } else {
            materia = "La entrada es inválida";
        }
        System.out.println(materia);

        if (calificacionTres == 10) {
            materia = "Excelente";
        } else if (calificacionTres > 5 && calificacionTres <= 8) {
            materia = "Aceptable";
        } else if (calificacionTres > 3 && calificacionTres <= 5) {
            materia = "Insuficiente";
        } else if (calificacionTres <=3 && calificacionTres > 0) {
            materia = "No aprobado";
        } else {
            materia = "La entrada es inválida";
        }
        System.out.println(materia);

    }
}
