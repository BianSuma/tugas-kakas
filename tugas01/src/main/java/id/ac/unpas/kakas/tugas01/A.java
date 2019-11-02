package id.ac.unpas.kakas.tugas01;

public class A implements AddAndSubInterface {
	public A() {
		System.out.println("Ctor di kelas " + this.getClass().getName());
	}
	
	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getName();
	}

	public int add(int nil1, int nil2) {
		return nil1 * nil2;
	}

	public int sub(int nil1, int nil2) {
		return nil1 - nil2;
	}
}
