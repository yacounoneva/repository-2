public class detest {
    static final int NB_LANCER = 1000;
    static int[] lancers = new int[NB_LANCER];

    public static void main(String[] args) {
        rangeLance(lancers);

        double probFace6 = probabiliteFace(lancers, 6);
        System.out.println("La probabilité d'obtenir la face 6 est: " + probFace6);

        for (int face = 1; face <= 6; face++) {
            double prob = probabiliteFace(lancers, face);
            System.out.println("La probabilité d'obtenir la face " + face + " est: " + prob);
        }
    }

    static void rangeLance(int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 6) + 1;
        }
    }

    static double probabiliteFace(int[] t, int f) {
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == f) {
                count++;
            }
        }
        return (double) count / t.length;
    }
}