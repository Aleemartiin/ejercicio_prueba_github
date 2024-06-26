/**
 * 5. Crea la clase Pizza con los atributos y m�todos necesarios. Sobre
 *    cada pizza se necesita saber el tama�o - mediana o familiar - el
 *    tipo - margarita, cuatro quesos o funghi - y su estado - pedida o
 *    servida. La clase debe almacenar informaci�n sobre el n�mero total
 *    de pizzas que se han pedido y que se han servido. Siempre que se
 *    crea una pizza nueva, su estado es "pedida".
 * 
 */
public class Pizza {
  
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  
  private String tamano;
  private String tipo;
  private String estado;
  
  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }
  
  public String toString() {
    return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }
  
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  /**
   * Cambia el estado de la pizza de pedida a servida
   * En caso de que la pizza se hubiera servido ya y se intenta servir
   * de nuevo, se muestra el mensaje esa pizza ya se ha servido
   */
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }
}