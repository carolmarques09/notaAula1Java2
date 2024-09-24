import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Cachorro cachorro = new Cachorro();
            Gato gato = new Gato();
            Animal animal = new Animal();

            cachorro.late();

            gato.mia();

            animal.caminha();
        }
    }
