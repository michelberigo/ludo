package Util;

public class Timer {
	
	private long LastTime, timer;
	private final double TickRate;
	private double Delta = 0;
	private int Updates = 0, Fps = 0, realUpdates = 0, realFps = 0;
	
	public Timer (double ticks) {
		this.TickRate = ticks;
		this.LastTime = System.nanoTime();
		this.timer = System.currentTimeMillis();
	}
	
	public boolean run() {
		long Now = System.nanoTime();
		this.Delta += (Now - LastTime) * this.TickRate / 1000000000;
		this.LastTime = Now;
		
		this.Updates++;
		boolean ok = false;
		
		if (this.Delta >= 1) {
			this.Fps++;
			this.Delta--;
			ok = true;
		}
		
		if (System.currentTimeMillis() - this.timer > 1000){
			this.timer += 1000;
			
			this.realFps = this.Fps;
			this.realUpdates = this.Updates;
			
			this.Updates = 0;
			this.Fps = 0;
		}
		
		return ok;
	}
	
	public int getFps(){
		return this.realFps;
	}
	
	public int getUpdates() {
		return this.realUpdates;
	}

}
