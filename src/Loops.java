import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        double mediaEvaluciones = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();
            mediaEvaluciones = mediaEvaluciones + nota;

        }
        System.out.println("La media de evaluaciones para matrix es :" + mediaEvaluciones / 3);
    }
}
