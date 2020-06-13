package estr;

public class Node2 {
	private double key; //latitud
	private double lon;
    private Node2 left;
    private Node2 right; 

    public Node2(double lat, double lon) { 
        this.key = lat;
        this.lon = lon;
        this.setLeft(null);
        this.right = null; 
    }

	public double getKey() {
		return key;
	}

	public void setKey(double key) {
		this.key = key;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public Node2 getRight() {
		return right;
	}

	public void setRight(Node2 right) {
		this.right = right;
	}

	public Node2 getLeft() {
		return left;
	}

	public void setLeft(Node2 left) {
		this.left = left;
	}
	
	public void setVal(double lat, double lon) {
		this.key = lat;
		this.lon = lon;
	}
}
