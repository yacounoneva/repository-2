import java.util.Scanner;

public class main {

    // 1. Méthode pour vérifier si un nombre est premier
    public static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2. Affichage des nombres premiers jusqu'à 20
    public static void afficherNombresPremiersJusquA20() {
        boolean[] primes = new boolean[21];
        for (int i = 2; i <= 20; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(20); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= 20; j += i) {
                    primes[j] = false;
                }
            }
        }
        System.out.println("Les nombres premiers jusqu'à 20 :");
        for (int i = 2; i <= 20; i++) {
            if (primes[i]) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    // 3. Vérification d'un nombre donné par l'utilisateur
    public static void verifierNombrePremier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int a = scanner.nextInt();
        scanner.close();

        if (estPremier(a)) {
            System.out.println(a + " est un nombre premier.");
        } else {
            System.out.println(a + " n'est pas un nombre premier.");
        }
    }

    // 4. Remplir un tableau et afficher les nombres premiers qu'il contient
    public static void afficherNombresPremiersDansTableau() {
        int longueurTableau = 100;
        int[] T = new int[longueurTableau];
        for (int i = 0; i < longueurTableau; i++) {
            T[i] = i + 1;
        }

        System.out.println("Nombres premiers dans le tableau :");
        for (int i = 0; i < longueurTableau; i++) {
            if (estPremier(T[i])) {
                System.out.print(T[i] + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Vérification d'un nombre donné par l'utilisateur
        verifierNombrePremier();

        // 2. Affichage des nombres premiers jusqu'à 20
        afficherNombresPremiersJusquA20();

        // 3. Affichage des nombres premiers dans un tableau de taille 100
        afficherNombresPremiersDansTableau();
    }
}