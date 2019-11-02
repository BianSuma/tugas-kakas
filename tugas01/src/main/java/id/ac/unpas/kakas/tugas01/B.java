package id.ac.unpas.kakas.tugas01;

public class B implements MulAndDivIntefrace {
	public B() {
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
}
