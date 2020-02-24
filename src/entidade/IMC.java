package entidade;

public class IMC {
	
	public String nome(String n) {
		return n;
	}
	
	public double medicao(double p, double a) {
		double c = p/Math.pow(a, 2);
		return c;
	}

}
