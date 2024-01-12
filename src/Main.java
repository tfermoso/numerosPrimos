import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros=NumerosPrimos.generarNumeros();
        int[] numerosPrimos=NumerosPrimos.devolerNumerosPrimos(numeros);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosPrimos));
    }




}