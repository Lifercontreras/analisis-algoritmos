import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] ordenar={29,23,17,2,6};

        for (int i = 0; i < ordenar.length; i++){
            for (int j = i+1; j < ordenar.length; j++){
                if (ordenar[i] < ordenar[j]){
                    int temp = ordenar[i];
                    ordenar[i] = ordenar[j];
                    ordenar[j] = temp;
                }
            }
        }

        System.out.println("El arreglo ordenado es: " + Arrays.toString(ordenar));
    }
}


