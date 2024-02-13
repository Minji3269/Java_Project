package test02;

public class FLACPPlayer implements MediaPlayer {
	
	private String fileName;
	private double runTime;
	private double fileSize;
	
	public static int state; // -1=정지 , 0=일시정지 , 1=재생

	@Override
	public void play() {
		state = 1;
		System.out.println("FLACP 파일 재생중...");
	}

	@Override
	public void pause() {
		state = 0;
		System.out.println("FLACP 파일 일시정지중...");
	}
	

	@Override
	public void stop() {
		state = -1;
		}

	@Override
	public void loadFile(String file) {
		System.out.println(file + "이 저장됨...");
		System.out.println("loding...");
	}

}
