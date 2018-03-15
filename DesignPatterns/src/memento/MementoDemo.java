package memento;

public class MementoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o=new Originator();
		CareTaker cT=new CareTaker();
		
		o.setEdoLlantas("4 llantas normales");
		o.setEdoLlantas("3 llantas bien y 1 con aire bajo");
		cT.add(o.guardaMementoEdoLlantas());
		
		o.setEdoLlantas("4 llantas normales");
		cT.add(o.guardaMementoEdoLlantas());
		
		System.out.println("Estado actual: "+o.getEdoLlantas());
		
		o.obtenMementoEdoLlantas(cT.get(0));
		System.out.println("Primer estado guardado: "+o.getEdoLlantas());
	}

}
