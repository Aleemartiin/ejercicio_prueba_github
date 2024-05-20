package relacion5;

public class Fraccion {
	private int num;
	private int den;
	
	public Fraccion() {
		num=0;
		den=1;
	}
	

	public Fraccion (int num,int den) {

		this.num=num;
		if(den==0)
		{
			den=1;
		}
		this.den=den;

		simplificar();
	}
	

	public Fraccion(final Fraccion f) {
		num=f.num;
		den=f.den;
	}
	

	
	public void setNum(int num) {
		this.num=num;
		
	}
	
	public int getNum() {
		return num;
		
	}
	
	public void setDen(int den) {
		this.den=den;
	}
	public int getDen() {
		return den;
	}
	
                                     
    private int mcd() {
        int u = Math.abs(num);
        int v = Math.abs(den);
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
    

    public void simplificar() {
    	int n=mcd();
    	num=num/n;
    	den=den/n;
    }
    

    
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    			sb.append(num+"/"+den);
    			sb.append("hola");
    	return sb.toString();
    } 

    
    public Fraccion sumar(Fraccion f) {
    	Fraccion aux= new Fraccion();
    	aux.num=num*f.den+den*f.num;
    	aux.den=den*f.den;
    	aux.simplificar();
    	return aux;
    	
    }
    

    
    public Fraccion restar(Fraccion f) {
    	Fraccion aux=new Fraccion();
    	aux.num=num*f.den-den*f.num;
    	aux.den=den*f.den;
    	aux.simplificar();
    	return aux;
    	
    	
    }
    

    
    public Fraccion multiplicar(Fraccion f) {
    	Fraccion aux=new Fraccion();
    	aux.num=num*f.num;
    	aux.den=den*f.den;
    	aux.simplificar();
    	return aux;
    	
    }
    

    
    public Fraccion dividir(Fraccion f) {
    	Fraccion aux=new Fraccion();
    	aux.num=num*f.den;
    	aux.den=den*f.num;
    	aux.simplificar();
    	return aux;
    	
    }
    

}
