import java.io.*;
import java.util.ArrayList;

public class Taller02UnitTesting {
    public static void main(String[] args) {




    }
    public static ArrayList leerArchivo(String ruta){
        ArrayList<String> cadenas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            while (br.ready()) {
                cadenas.add(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cadenas;
    }
    public static void imprimirArchivo(ArrayList arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    public static boolean esPalindromo(String palabra){
        String cadena = formatearPalabra(palabra);
        String invertirPalabra = new StringBuilder(palabra).reverse().toString();
        boolean palindromo = cadena.equals(invertirPalabra);
        return palindromo;
    }
    public static String formatearPalabra(String palabra){
        palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        return palabra;
    }
    public static void contarLineas(ArrayList arr){
        int numLineas = arr.size();
        System.out.println(numLineas);
    }



}
