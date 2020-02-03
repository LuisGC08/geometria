import static org.junit.Assert.*;

import org.junit.Test;

import geometria.Circulo_LGC;

public class testCirculo {

	@Test
	public void testCirculo() {
		Circulo_LGC c1=new Circulo_LGC(7, "Circulo");
		double res=c1.area();
		assertEquals(153.9384,res,0.0001);
		Circulo_LGC c2=new Circulo_LGC(0, "Circulo");
		double res2=c2.area();
		assertEquals(0,res2,0.0001);
		Circulo_LGC c3=new Circulo_LGC(-3, "Circulo");
		double res3=c3.area();
		assertEquals(28.2744,res3,0.0001);
	}
	public void testPerimetro() {
		Circulo_LGC c1=new Circulo_LGC(7, "Circulo");
		double res=c1.perimetro();
		assertEquals(43.9824,res,0.0001);
		Circulo_LGC c2=new Circulo_LGC(0, "Circulo");
		double res2=c2.perimetro();
		assertEquals(0,res2,0.0001);
		Circulo_LGC c3=new Circulo_LGC(-3, "Circulo");
		double res3=c3.perimetro();
		assertEquals(18.8496,res3,0.0001);
	}

}
