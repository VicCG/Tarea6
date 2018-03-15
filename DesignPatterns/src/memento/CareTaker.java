package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList=new ArrayList<Memento>();

	public Memento get(int index) {
		return mementoList.get(index);
	}

	public void add(Memento edoLlantas) {
		mementoList.add(edoLlantas);
	}
	
	
}
