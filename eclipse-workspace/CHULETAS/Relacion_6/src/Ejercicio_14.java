import java.util.Scanner;

/*  14. Implementar el juego del anagrama, que consiste en que un jugador 
  * escribe una palabra o frase, y la aplicación muestra un anagrama 
  * (transposición de los caracteres) del texto introducido generado al azar. 
  * A continuación otro jugador tiene que acertar cuál es el texto original. 
  * La aplicación no debe permitir que el texto introducido por el jugador 1 
  * sea la cadena vacía. Por ejemplo, si el jugador 1 escribe “teclado”, 
  * la aplicación muestra como pista un anagrama al azar: “etcloda”.
  */
public class Ejercicio_14 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la palabra: ");
        String pass = sc.nextLine();
        for (int i= 0; i < 20; i++) {
            System.out.println("");
        }
        String anagrama = anagramaAlAzar(pass);
        System.out.println("El anagrama es " + anagrama);
     
      
        boolean adivina = false;
        
        System.out.println("Pistas...");
        
        System.out.println("Numero de caracteres: " + pass.length());
        System.out.println("Caracter inicial: " + pass.charAt(0));
        System.out.println("Caracter final: " + pass.charAt(pass.length()-1));
        
        while (!adivina){
            System.out.println("Adivina la contraseña: ...");
            String intento = sc.nextLine();
            
            if (pass.equals(intento)){
                adivina=true;
                System.out.println("¡Enhorabuena, has acertado la contraseña!");
            } else {
                int r;
                r=pass.compareTo(intento);
                if(r>0){
                    System.out.println("La contraseña es posterior alfabéticamente");
                }else {
                    System.out.println("La contraseña es anterior alfabéticamente");
                }
            }
            
        }  
        sc.close();
    }
    
    public static String anagramaAlAzar(String cadena) {
        char[] tabla = cadena.toCharArray();
        // Barajamos
        for (int i = 0; i < tabla.length; i++) {
            // Creamos dos índices al azar
            int i1 = (int)(Math.random() * tabla.length);
            int i2 = (int)(Math.random() * tabla.length);
            // intercambiamos los elementos
            char aux = tabla[i1];
            tabla[i1] = tabla[i2];
            tabla[i2] = aux;
        }
        return new String(tabla);
    }
    
}