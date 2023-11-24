import java.util.Arrays;

public class NumbersCat {

    public static String say(long n) {
        return PrimeraLetraMayus(Del31al99(n));

    }

    public static long words(String s) {
        return 0;
    }

    public static String oper(String s) {
        return "";
    }


    public static String PrimeraLetraMayus(String p){
        String resultado = "";
        resultado = String.valueOf(p.charAt(0)).toUpperCase();
        for (int i = 1; i < p.length(); i++) {
            resultado += p.charAt(i);
        }
        return resultado;

    }

    public static String NumeroUnicoString(long n) {
        String resultado = "";

        if (n < 0){
            resultado += "menys ";
            n = n * -1;
        }

        if (n == 0) {
            resultado += "zero";
        } else if (n == 1) {
            resultado += "un";
        } else if (n == 2) {
            resultado += "dos";
        } else if (n == 3) {
            resultado += "tres";
        } else if (n == 4) {
            resultado += "quatre";
        } else if (n == 5) {
            resultado += "cinc";
        } else if (n == 6) {
            resultado += "sis";
        } else if (n == 7) {
            resultado += "set";
        } else if (n == 8) {
            resultado += "vuit";
        } else if (n == 9) {
            resultado += "nou";
        } else if (n == 10) {
            resultado += "deu";
        } else if (n == 11) {
            resultado += "once";
        } else if (n == 12) {
            resultado += "dotze";
        } else if (n == 13) {
            resultado += "tretze";
        } else if (n == 14) {
            resultado += "catorze";
        } else if (n == 15) {
            resultado += "quinze";
        } else if (n == 16) {
            resultado += "setze";
        } else if (n == 17) {
            resultado += "disset";
        } else if (n == 18) {
            return "divuit";
        } else if (n == 19) {
            resultado += "dinou";
        }
        return resultado;

    }

    public static String MultiploDeDiez(long n){
        String resultado = "";

        if (n < 0){
            resultado += "menys ";
            n = n * -1;
        }

        if (n == 30) {
            resultado += "trenta";
        } else if (n == 40) {
            resultado += "quaranta";
        } else if (n == 50) {
            resultado += "cinquanta";
        } else if (n == 60) {
            resultado += "seixanta";
        } else if (n == 70) {
            resultado += "setanta";
        } else if (n == 80) {
            resultado += "vuitanta";
        } else if (n == 90) {
            resultado += "noranta";
        }
        return resultado;
    }

    public static String Del20al29(long n){
        String resultado = "";

        if (n < 0){
            resultado += "menys ";
            n = n * -1;
        }

        if (n == 20) {
            resultado += "vint";
        } else if (n == 21) {
            resultado += "vint-i-un";
        } else if (n == 22) {
            resultado += "vint-i-dos";
        } else if (n == 23) {
            resultado += "vint-i-tres";
        } else if (n == 24) {
            resultado += "vint-i-quatre";
        } else if (n == 25) {
            resultado += "vint-i-cinc";
        } else if (n == 26) {
            resultado += "vint-i-sis";
        } else if (n == 27) {
            resultado += "vint-i-set";
        } else if (n == 28) {
            resultado += "vint-i-vuit";
        } else if (n == 29) {
            resultado += "vint-i-nou";
        }
        return resultado;
    }

    public static String Del31al99(long n){
        String resultado = "";

        if (n < 0){
            resultado += "menys ";
            n = n * -1;
        }

        String numero = String.valueOf(n);

        long [] array = new long[numero.length()];

        for (int i = 0; i < numero.length(); i++) {
            array[i] = Character.getNumericValue(numero.charAt(i));
        }
        System.out.println(Arrays.toString(array));

        resultado += MultiploDeDiez(array[0] * 10);
        resultado += "-";
        resultado += NumeroUnicoString(array[1]);

        return resultado;
    }
}
