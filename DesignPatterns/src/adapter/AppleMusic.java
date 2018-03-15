package adapter;

public class AppleMusic implements ItunesAvanzado{

	@Override
	public void playLocal(String cancion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playAppleMusic(String cancion) {
		// TODO Auto-generated method stub
		System.out.print("Reproducción APPLE MUSIC de "+cancion);
	}

}
