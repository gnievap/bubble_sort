import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort{

    public static int[] bubbleSort( int[] datos ){
        int auxiliar;
        boolean intercambios;
        
        do {
            intercambios = false;
            for ( int i = 0; i < datos.length - 1; i++ ){
                if ( datos[i] > datos[i+1] ){
                    // intercambiar los valores
                    auxiliar = datos[i];
                    datos[i] = datos[i+1];
                    datos[i+1] = auxiliar;
                    intercambios = true;
                }
            }
            imprimirArreglo(datos);
        } while ( intercambios == true );
        return datos;
    }

    public static void imprimirArreglo(int[] datos){
        System.out.println("-------------------------------------");
        System.out.println("Valores del arreglo: ");
        for (int i = 0; i < datos.length; i++ )
            System.out.println("i: " + i + "  datos[i] " + datos[i]);
        System.out.println("-------------------------------------");
    }

    public static int[] leerArreglo(int[] datos) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Lectura de datos del arreglo");
        for ( int i=0; i < datos.length; i++ ){
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            datos[i] = Integer.parseInt(entrada);
        }
        return datos;
    }

    public static void main(String[] args) throws IOException {
        int n;
        int[] datos;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Método bubble sort");
        System.out.println("Escribe el tamaño del arreglo: ");
        entrada = bufer.readLine();
        n = Integer.parseInt(entrada);

        datos = new int[n];
        datos = leerArreglo(datos);
        datos = bubbleSort(datos); 
    }
}
