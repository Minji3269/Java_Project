package test01;

public class MediaPlayerController {
	public static void main(String[] args) {
		
		MediaPlayer player = new WAVPlayer();
		player.play();
		
		player = new MP3Player();
		player.play();
		
		player = new FLACPPlayer();
		player.play();
	}

}
