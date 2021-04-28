public class Taller02UnitTesting {
    public static void main(String[] args) {

    }
    public static boolean esPalindromo(String palabra){
        String invertida = new StringBuilder(palabra).reverse().toString();
        boolean palindromo = palabra.equals(invertida);
        return palindromo;
    }
}
