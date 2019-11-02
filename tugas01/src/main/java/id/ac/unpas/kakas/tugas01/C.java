package id.ac.unpas.kakas.tugas01;

public class C {
	private double n1;
	private double n2;
	
	public C() {
		System.out.println("Ctor di kelas " + this.getClass().getName());
	}
	
	public int add() {
		return 1;
	}
	
	public int sub() {
		return 1;
	}
	
	public int mul() {
		return 1;
	}
	
	public int div() {
		return 1;
	}
	
	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getName();
	}
	
}
