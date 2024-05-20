package sopadeletras;
import java.util.Random;
import java.util.Scanner;

public class spoiler {

    public static void main(String[] args) {
        char[][] sopa = new char[10][10];
        GenerarSopa(sopa);
        VisualizarSopa(sopa);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la palabra que desea buscar (o 'salir' para terminar): ");
            String palabraBuscada = scanner.nextLine().toLowerCase();

            if (palabraBuscada.equals("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            boolean encontrada = buscarHorizontalNormal(sopa, palabraBuscada) ||
                                 buscarHorizontalInvertida(sopa, palabraBuscada) ||
                                 buscarVerticalNormal(sopa, palabraBuscada) ||
                                 buscarVerticalInvertida(sopa, palabraBuscada);

            if (!encontrada) {
                System.out.println("La palabra no se encuentra en la sopa de letras.");
            }

            VisualizarSopa(sopa);
        }

        scanner.close();
    }

    public static void GenerarSopa(char[][] sopa) {
        // Inicializar matriz con letras aleatorias
        Random random = new Random();
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = (char) (random.nextInt(26) + 'a');
            }
        }

        // Pedir al usuario las 4 palabras y colocarlas en la matriz
        Scanner scanner = new Scanner(System.in);

        for (int k = 0; k < 4; k++) {
            System.out.println("Ingrese una palabra: ");
            String palabra = scanner.nextLine().toLowerCase();

            boolean colocada = false;

            while (!colocada) {
                int fila = random.nextInt(10);
                int columna = random.nextInt(10);

                if (k == 0 && colocarHorizontalNormal(sopa, palabra, fila, columna)) {
                    colocada = true;
                } else if (k == 1 && colocarHorizontalInvertida(sopa, palabra, fila, columna)) {
                    colocada = true;
                } else if (k == 2 && colocarVerticalNormal(sopa, palabra, fila, columna)) {
                    colocada = true;
                } else if (k == 3 && colocarVerticalInvertida(sopa, palabra, fila, columna)) {
                    colocada = true;
                }
            }
        }

        scanner.close();
    }

    public static void VisualizarSopa(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean buscarHorizontalNormal(char[][] sopa, String palabra) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j <= sopa[i].length - palabra.length(); j++) {
                if (String.valueOf(sopa[i], j, palabra.length()).equals(palabra)) {
                    tacharPalabra(sopa, i, j, i, j + palabra.length() - 1);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean buscarHorizontalInvertida(char[][] sopa, String palabra) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = sopa[i].length - 1; j >= palabra.length() - 1; j--) {
                if (String.valueOf(sopa[i], j - palabra.length() + 1, palabra.length()).equals(palabra)) {
                    tacharPalabra(sopa, i, j - palabra.length() + 1, i, j);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean buscarVerticalNormal(char[][] sopa, String palabra) {
        for (int j = 0; j < sopa[0].length; j++) {
            for (int i = 0; i <= sopa.length - palabra.length(); i++) {
                StringBuilder palabraVertical = new StringBuilder();
                for (int k = i; k < i + palabra.length(); k++) {
                    palabraVertical.append(sopa[k][j]);
                }
                if (palabraVertical.toString().equals(palabra)) {
                    tacharPalabra(sopa, i, j, i + palabra.length() - 1, j);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean buscarVerticalInvertida(char[][] sopa, String palabra) {
        for (int j = 0; j < sopa[0].length; j++) {
            for (int i = sopa.length - 1; i >= palabra.length() - 1; i--) {
                StringBuilder palabraVertical = new StringBuilder();
                for (int k = i; k > i - palabra.length(); k--) {
                    palabraVertical.append(sopa[k][j]);
                }
                if (palabraVertical.toString().equals(palabra)) {
                    tacharPalabra(sopa, i, j, i - palabra.length() + 1, j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void tacharPalabra(char[][] sopa, int filaInicio, int columnaInicio, int filaFin, int columnaFin) {
        for (int i = filaInicio; i <= filaFin; i++) {
            for (int j = columnaInicio; j <= columnaFin; j++) {
                sopa[i][j] = '-';
            }
        }
    }

    public static boolean colocarHorizontalNormal(char[][] sopa, String palabra, int fila, int columna) {
        if (columna + palabra.length() > sopa[fila].length) {
            return false;
        }

        for (int j = columna; j < columna + palabra.length(); j++) {
            if (sopa[fila][j] != 0) {
                return false;
            }
        }

        for (int j = columna; j < columna + palabra.length(); j++) {
            sopa[fila][j] = palabra.charAt(j - columna);
        }

        return true;
    }

    public static boolean colocarHorizontalInvertida(char[][] sopa, String palabra, int fila, int columna) {
        if (columna - palabra.length() < 0) {
            return false;
        }

        for (int j = columna; j > columna - palabra.length(); j--) {
            if (sopa[fila][j] != 0) {
                return false;
            }
        }

        for (int j = columna; j > columna - palabra.length(); j--) {
            sopa[fila][j] = palabra.charAt(columna - j);
        }

        return true;
    }

    public static boolean colocarVerticalNormal(char[][] sopa, String palabra, int fila, int columna) {
        if (fila + palabra.length() > sopa.length) {
            return false;
        }

        for (int i = fila; i < fila + palabra.length(); i++) {
            if (sopa[i][columna] != 0) {
                return false;
            }
        }

        for (int i = fila; i < fila + palabra.length(); i++) {
            sopa[i][columna] = palabra.charAt(i - fila);
        }

        return true;
    }

    public static boolean colocarVerticalInvertida(char[][] sopa, String palabra, int fila, int columna) {
        if (fila - palabra.length() < 0) {
            return false;
        }

        for (int i = fila; i > fila - palabra.length(); i--) {
            if (sopa[i][columna] != 0) {
                return false;
            }
        }

        for (int i = fila; i > fila - palabra.length(); i--) {
            sopa[i][columna] = palabra.charAt(fila - i);
        }

        return true;
    }
}