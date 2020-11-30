package standardJava;

class MyTv3{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		int tmp;
		
		tmp = channel;
		channel = prevChannel;
		prevChannel = tmp;
		
	}
}

public class Exercise7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv3 t = new MyTv3();
		
		t.setChannel(70);
		System.out.println("CH: "+t.getChannel());
		t.setVolume(45);
		System.out.println("VOL: "+t.getVolume());
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setChannel(20);
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
	}

}
