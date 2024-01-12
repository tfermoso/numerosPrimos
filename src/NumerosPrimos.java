import java.util.Random;

public class NumerosPrimos {
    public int[] numeros;
    public int[] numerosPrimos;

    public NumerosPrimos() {
        numeros=new int[20];
        Random aleatorios=new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= aleatorios.nextInt(0,100);
        }
        devolerNumerosPrimos();
    }



    private   void devolerNumerosPrimos() {
        int contador=0;

        for (int i = 0; i < numeros.length; i++) {
            if(esPrimo(numeros[i])){
                contador++;
            }
        }
        numerosPrimos=new int[contador];
        int j=0;
        for (int i = 0; i < numeros.length; i++) {
            if(esPrimo(numeros[i])){
                numerosPrimos[j]=numeros[i];
                j++;
            }
        }

    }

    private static boolean esPrimo(int numero) {
        if(numero>1) {
            for (int i = 2; i < numero - 1; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
