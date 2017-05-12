
public class Explorer {
	private int x;
	private int y;
	private String direction;
	private String[] posibleDirRight = {"N", "E", "S", "W"};
	private String[] posibleDirLeft = {"N", "W", "S", "E"};
	
	public Explorer () {
		
	}
	
	public Explorer (int x, int y, String direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void movingRight () {
		for (int i = 0; i < posibleDirRight.length; i++) {
			if (this.getDirection() == posibleDirRight[i]) {
				this.setDirection(posibleDirRight[i]+1);
			}
		}
	}
	
	public String toString() {
		return this.direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
