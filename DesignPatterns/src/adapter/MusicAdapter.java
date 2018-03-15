package adapter;

public class MusicAdapter implements Itunes{

	ItunesAvanzado advancedMusicPlayer;
	
	public MusicAdapter(String audioType){
	   
			if(audioType.equalsIgnoreCase("local") ){
				advancedMusicPlayer = new Local();			
			     
			}else if (audioType.equalsIgnoreCase("Apple Music")){
				advancedMusicPlayer = new AppleMusic();
			}	
	}
		
	@Override
	public void play(String audioType, String fileName) {
	   
		if(audioType.equalsIgnoreCase("local")){
			advancedMusicPlayer.playLocal(fileName);
		}
		else if(audioType.equalsIgnoreCase("Apple Music")){
			advancedMusicPlayer.playAppleMusic(fileName);
		}
	}

}
