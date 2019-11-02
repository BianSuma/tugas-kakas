package id.ac.unpas.kakas.tugas01;

import java.util.List;

public class E {
	
	private List<E> dataList;
	
	public E() {
		System.out.println("Ctor di kelas " + this.getClass().getName());
	}
	
	public List<E> getDataList() {
		return this.dataList;
	}
	
	public void setDataList(List<E> dataList) {
		this.dataList = dataList;
	}
	
	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getName();
	}
}
