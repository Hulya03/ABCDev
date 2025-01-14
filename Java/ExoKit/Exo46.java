public class Exo46 {

    public static void main(String[] args) {

        int[] tab1 = {4, 8, 7, 12};
        int[] tab2 = {3, 6};

        int result = 0;

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                result = result + tab1[i] * tab2[j];
            }
        }
        System.out.print("le résultat est : " + result);
    }
}
