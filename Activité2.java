public class Fibonacci {
    public static void main(String[] args) {
        // Étape 2.1 : Réécrire le programme avec affichage du terme courant
        int n = 10;
        int u = 1;
        int v = 1;

        // Affichage des deux premiers termes
        System.out.println("U0: " + u);
        System.out.println("U1: " + v);

        // Calcul et affichage des termes suivants
        for (int i = 2; i <= n; i++) {
            int w = u + v;
            u = v;
            v = w;
            System.out.println("U" + i + ": " + w);
        }

        // Étape 2.2 : Exécution du programme pour les dix premiers termes
        System.out.println("\nExécution pour les dix premiers termes :");
        for (int i = 0; i <= n; i++) {
            System.out.println("U" + i + ": " + fibonacci(i));
        }

        // Étape 2.3 : Insérer les termes dans un tableau de taille 50
        int[] fibonacciArray = new int[50];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        // Remplissage du tableau
        for (int i = 2; i < 50; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        // Affichage des 50 termes pour vérification
        System.out.println("\nLes 50 premiers termes de la suite de Fibonacci :");
        for (int i = 0; i < 50; i++) {
            System.out.println("U" + i + ": " + fibonacciArray[i]);
        }

        // Étape 2.4 : Calcul du nombre d'or
        double phi = (double) fibonacciArray[49] / fibonacciArray[48];
        System.out.println("\nApproximation du nombre d'or : " + phi);
    }

    // Fonction pour calculer le terme de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int u = 1;
        int v = 1;
        for (int i = 2; i <= n; i++) {
            int w = u + v;
            u = v;
            v = w;
        }
        return v;
    }
}