package comportamentales.templateMethog;

public abstract class Juego {
	
	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	public void play() {
		this.initialize();
		this.startPlay();
		this.endPlay();
	}
}
