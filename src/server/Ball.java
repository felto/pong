package server;

public class Ball {
	public static final int RADIUS = 10;
	
	private int posX;
	private int posY;
	
	private int velX;
	private int velY;
	
	public Ball(int posX, int posY) {
		this.setPosX(posX);
		this.setPosX(posY);
		
		this.setVelX(0);
		this.setVelY(0);
	}

	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}
	public void setVelY(int velY) {
		this.velY = velY;
	}
	
	
}
