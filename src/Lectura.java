import java.util.Scanner;

public class Lectura
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe el nombre de tu pelicula fav");
        String pelicula = teclado.nextLine();
        System.out.println("ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("por ultimo dinos que nota le das a esta pélicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

    }
}
