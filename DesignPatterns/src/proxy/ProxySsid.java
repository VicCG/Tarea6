package proxy;

public class ProxySsid implements Ssid{
	private RealSsid realSsid;
	private String ssidNom;
	
	public ProxySsid(String ssidNom) {
		this.ssidNom=ssidNom;
	}

	@Override
	public void display() {
		if(realSsid==null)
			realSsid=new RealSsid(ssidNom);
		realSsid.display();
	}

}
