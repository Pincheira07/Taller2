import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Taller02UnitTesting {
    public static void main(String[] args) {
        iniciarPrograma();

    }
    public static void iniciarPrograma(){
        ArrayList<String> lista = new ArrayList<>();
        lista = leerArchivo("cadenas.txt");
        System.out.println("---------------------------");
        contarLineas(lista);
        contarPalindromos(analizarPalabras(lista));
        System.out.println("---------------------------");

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
    public static boolean esPalindromo(String palabra){
        boolean palindromo = false;
        if (!estaVacio(palabra)){
            String cadena = formatearPalabra(palabra);
            String invertirPalabra = new StringBuilder(palabra).reverse().toString();
            palindromo = cadena.equals(invertirPalabra);
        }
        return palindromo;
    }
    public static String formatearPalabra(String palabra){
        palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "").replace("-","").replace("?","").replace(".","").replace(":","").replace("!","").replace(",","").replace(";","");
        return palabra;
    }
    public static void contarLineas(ArrayList arr){
        int numLineas = arr.size();
        System.out.println("Número de lineas: " + numLineas);
    }
    public static ArrayList<String> analizarPalabras(ArrayList arr){
        ArrayList<String> palindromos = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            String palabra = formatearPalabra(arr.get(i).toString());
            if(esPalindromo(palabra) ==true){
                palindromos.add(palabra);
            };
        }
        return palindromos;
    }
    public static void contarPalindromos(ArrayList arr){
        int numLineas = arr.size();
        System.out.println("Número de palindromos: " + numLineas);
    }
    public static boolean estaVacio(String palabra){
        boolean vacio = false;
        if (palabra==""){
            vacio = true;
        }
        return vacio;
    }



}
