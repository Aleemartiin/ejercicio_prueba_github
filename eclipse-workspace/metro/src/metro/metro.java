package metro;

	import junit.framework.TestCase;
	public class metro extends TestCase {
		
	private Estado estado;
	public void siguienteEstado() {
	estado.siguienteEstado (this);
	
		}
	Metro m;
	public void setUp(){
	m=new Metro();
	}
	
	public void testEstadoParado() {
	int esperado=0;
	assertTrue(m.getEstado()==esperado);
	}
	
	public void testEstadoArrancando() {
	int esperado=1;
	m.siguienteEstado();
	assertTrue(m.getEstado()==esperado);
	}
	
	public void testEstadoEnMarcha() {
	int esperado=2;
	m.siguienteEstado();
	m.siguienteEstado();
	assertTrue(m.getEstado()==esperado);
	}
	
	public void testEstadoParando() {
	int esperado=3;
	m.siguienteEstado();
	m.siguienteEstado();
	m.siguienteEstado();
	assertTrue(m.getEstado()==esperado);
	}
	
	public void testEstadoParadoFinal() {
	int esperado=0;
	m.siguienteEstado();
	m.siguienteEstado();
	m.siguienteEstado();
	m.siguienteEstado();
	assertTrue(m.getEstado()==esperado);
	}
	}
	
}
