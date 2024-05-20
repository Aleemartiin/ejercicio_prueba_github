package relacion5;

public class Prueba {

	public static void main(String[] args) {

		Fraccion f1=new Fraccion(10,5);
		Fraccion f2=new Fraccion(2,2);
		Fraccion f3=new Fraccion();
		Fraccion f4=new Fraccion(4,1);

		System.out.println("primera fraccion:"+f1);
		System.out.println("segunda fraccion:"+f2);
		System.out.println("tercera fraccion:"+f3);
		System.out.println("cuarta fraccion:"+f4);
		
		
		Fraccion suma=f1.sumar(f2);
		Fraccion resta=f1.restar(f3);
		Fraccion producto= f1.multiplicar(f4);
		Fraccion cociente= f1.dividir(f2);
		
		System.out.println(f1+" + "+f2+" = "+suma);
		System.out.println(f1+" - "+f2+" = "+resta);
		System.out.println(f1+" * "+f2+" = "+producto);
		System.out.println(f1+" / "+f2+" = "+cociente);

	}

}
