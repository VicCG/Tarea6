package adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer ap=new AudioPlayer();
		
		ap.play("mp4", "JusticeLeague.mp4");
		ap.play("local", "BadLiar.mp3");
		ap.play("Apple Music", "Heavy.apl");
	}

}
