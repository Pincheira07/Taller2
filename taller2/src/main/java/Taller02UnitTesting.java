public class Taller02UnitTesting {
    public static void main(String[] args) {

    }
    public static String[] leerArchivo(String ruta){
        String [] cadenas = new String[20];


        return cadenas;
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

}
