package id.ac.unpas.kakas.tugas01;

public class D implements PowInterface {
	public D() {
		System.out.println("Ctor di kelas " + this.getClass().getName());
	}
	
	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getName();
	}

	public double mul(double nil1, double nil2) {
		return nil1*nil2;
	}

	public double div(double nil1, double nil2) {
		return nil1/nil2;
	}

	public double pow(double n1, double n2) {
		return Math.pow(n1, n2);
	}
}
