import java.util.Random;
import java.util.Scanner;

public class JeuDeNombre {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int nombreATrouver = random.nextInt(30) + 1;
        int essaisRestants = 5;
        boolean nombreTrouve = false;
        
        System.out.println("J'ai choisi un nombre entre 1 et 30.");
        System.out.println("À vous de le deviner en 5 tentatives au maximum !");
        
        while (essaisRestants > 0 && !nombreTrouve) {
            System.out.println("Essai n°" + (6 - essaisRestants));
            System.out.print("Votre proposition : ");
            int proposition = scanner.nextInt();
            
            if (proposition < nombreATrouver) {
                System.out.println("Trop petit !");
            } else if (proposition > nombreATrouver) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé " + proposition + " en " + (6 - essaisRestants) + " essais.");
                nombreTrouve = true;
            }
            
            essaisRestants--;
        }
        
        if (!nombreTrouve) {
            System.out.println("Désolé, vous n'avez pas trouvé le nombre. C'était " + nombreATrouver + ".");
        }
        
        scanner.close();
    }
}