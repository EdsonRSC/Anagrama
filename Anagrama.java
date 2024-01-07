import java.util.Arrays;
public class Anagrama {
    //Metodo para verificar que las plabras sean anagramas
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Eliminar espacios y convertir a minúsculas
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        // Verificar si las longitudes son iguales
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // Convertir cadenas a arreglos de caracteres y ordenarlos
        char[] arrayPalabra1 = palabra1.toCharArray();
        char[] arrayPalabra2 = palabra2.toCharArray();

        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        // Comparar los arreglos ordenados
        return Arrays.equals(arrayPalabra1, arrayPalabra2);
    }
    public static void main(String[] args) {
        String palabra1 = "edson";
        String palabra2 = "nosde";

        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras no son anagramas.");
        }
    }
}
