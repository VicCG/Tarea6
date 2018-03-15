package memento;

public class Originator {
	private String edoLlantas;

	public String getEdoLlantas() {
		return edoLlantas;
	}

	public void setEdoLlantas(String edoLlantas) {
		this.edoLlantas = edoLlantas;
	}
	
	public Memento guardaMementoEdoLlantas() {
		return new Memento(edoLlantas);
	}
	
	public void obtenMementoEdoLlantas(Memento memento) {
		edoLlantas=memento.getEdoLlantas();
	}
}
