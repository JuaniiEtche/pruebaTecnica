package ejer5;

public class Main {
    public static void main(String[] args) {
        // Array de palabras
        String[] array = { "FirstWord", "SecondWord", "THIRDWORD" };

        // Llama a la función para transformar el array
        String resultado = transformarArray(array);

        // Imprime el resultado
        System.out.println(resultado);
    }

    // Función para transformar un array de palabras
    public static String transformarArray(String[] array) {
        // Validación de longitud del array
        if (!validarLongitud(array, 10)) {
            return "Error: La longitud del array se superó el límite permitido.";
        }

        // Transforma cada palabra a minúsculas y valida
        for (int i = 0; i < array.length; i++) {
            String palabra = array[i].toLowerCase();

            // Validación de cada palabra en el array
            if (!validarCadena(palabra)) {
                return "Error: Uno o más elementos del array no cumplen con las restricciones.";
            }

            // Actualiza el elemento del array con la versión en minúsculas
            array[i] = palabra;
        }

        // Une todas las palabras con espacios y retorna el resultado
        return String.join(" ", array);
    }

    // Función para validar la longitud del array
    private static boolean validarLongitud(String[] array, int limite) {
        return array.length <= limite;
    }

    // Función para validar que una cadena cumple con las restricciones
    private static boolean validarCadena(String cadena) {
        return cadena.matches("^[a-zA-Z ]+$"); // Verifica que la cadena contiene solo letras y espacios
    }
}
