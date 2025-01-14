import java.util.Arrays;

public class Exo45 {

    public static void main(String[] args) {

        int[] tab1 = { 4, 8, 7, 9, 1, 5, 4, 6 };
        int[] tab2 = { 7, 6, 5, 2, 1, 3, 7, 4 };

        for (int i = 0; i < tab2.length; i++) {
            int[] tab3 = { tab1[i] + tab2[i] };
            System.out.print(Arrays.toString(tab3));
        }
    }

}
