package proxy;

public class RealSsid implements Ssid{
	
	private String ssidNom;
	
	public RealSsid(String ssidNom) {
		this.ssidNom=ssidNom;
		loadFromServer(this.ssidNom);
	}

	private void loadFromServer(String ssidNom) {
		System.out.println("Obteniendo el SSID de un servidor\n");
	}

	@Override
	public void display() {
		System.out.println("Mostrando "+ssidNom);
	}

}
