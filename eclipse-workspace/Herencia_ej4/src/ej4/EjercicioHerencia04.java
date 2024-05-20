package ej4;

public class EjercicioHerencia04 {

	public static void main(String[] args) {
	
		//Creo un array de productos
		
		Producto[] productos=new Producto[3];
		
		//Introduzco los 3 elementos
		 productos[0] = new Producto("producto 1", 10);
	     productos[1] = new Perecedero("producto 2", 20,1);
	     productos[2] = new NoPerecedero("producto 3",5,"tipo 1");
	     
	    //Muestro los 3 elementos
	     
	     for (int i=0; i<productos.length;i++) {
	    	 System.out.println(productos[i]);
	     }
	     
	   //Calculo el precio
	    double total=0;
	     for(int i=0;i<productos.length;i++){
	         total += productos[i].calcular(5); //Polimorfismo
	        }
	         
	   //Muestro el total
	       System.out.println("el total es "+total);
	     
	     
		
		
	}

}
