package server.game;

public class Ball {
	public static final int RADIUS_DEFAULT = 10;
	
	private double posX;
	private double posY;
	
	private double velX;
	private double velY;
	
	private int radius;
	
	
	
	/**
	 * Ball at (0, 0). Default radius.
	 */
	public Ball() {
		this(0, 0);
	}
	
	/**
	 * Ball at (posX, posY). Default radius.
	 * 
	 * @param <b>posX</b>: x-position.
	 * @param <b>posY</b>: y-position.
	 */
	public Ball(double posX, double posY) {
		this(posX, posY, RADIUS_DEFAULT);
	}

	/**
	 * Ball at (posX, posY) with the given radius.
	 * 
	 * @param <b>posX</b>: x-position.
	 * @param <b>posY</b>: y-position.
	 * @param <b>radius</b>: ball radius.
	 */
	public Ball(double posX, double posY, int radius) {
		setPosX(posX);
		setPosX(posY);
		
		setVelX(0);
		setVelY(0);
		
		setRadius(radius);
	}
	
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius must be > 0, given radius is " + radius + ".");
		}
		this.radius = radius;
	}

	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getVelX() {
		return velX;
	}
	public void setVelX(double velX) {
		this.velX = velX;
	}

	public double getVelY() {
		return velY;
	}
	public void setVelY(double velY) {
		this.velY = velY;
	}
}
