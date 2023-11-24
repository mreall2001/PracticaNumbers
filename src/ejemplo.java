import java.util.Arrays;

public class ejemplo {
    public static void main(String[] args) {
        long n1 = 44;
        String numero = String.valueOf(n1);
        System.out.println(numero);
        long [] array = new long[numero.length()];

        for (int i = 0; i < numero.length(); i++) {
            array[i] = Character.getNumericValue(numero.charAt(i));
        }
        System.out.println(Arrays.toString(array));
    }
}
