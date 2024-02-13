package test02;

import java.util.Scanner;

public class MediaPlayerController {
	public static void main(String[] args) {
		
		MediaPlayer player = new FLACPPlayer();
		
		Scanner s = new Scanner(System.in);
		
		while(FLACPPlayer.state != -1) {
			System.out.println("1 : 실행 , 0 : 일시정지 , -1 : 정지");
		switch(s.nextInt()) {
		case 1:
			player.play();
			break;
		case 0:
			player.pause();
			break;
		case -1:
			player.stop();
			break;
			}
		}
		System.out.println("play stop ...");
	}
}
