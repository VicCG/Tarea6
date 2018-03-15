package adapter;

public class AudioPlayer implements Itunes{

	MusicAdapter ma;
	
	@Override
	public void play(String tipo, String cancion) {
		// TODO Auto-generated method stub
		if(tipo.equalsIgnoreCase("mp4"))
			System.out.println("Reproduciendo Video. Nombre"+cancion);
		else if(tipo.equalsIgnoreCase("local")||tipo.equalsIgnoreCase("Apple Music")) {
			ma=new MusicAdapter(tipo);
			ma.play(tipo, cancion);
		}
		else
			System.out.println("Formato no soportado");
	}
	
}
