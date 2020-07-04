public class HashMap {
	public ListaL[] harray; 
	private int capacity;
	private double maxLoadFactor;
	private int entries;
	
	public HashMap() {
		this.capacity = 16;
		this.entries = 0;
		this.maxLoadFactor = 0.75;
		this.harray = new ListaL[this.capacity];
		for(int i=0; i<harray.length; i++) 
			harray[i] = new ListaL(); 
	} 
	
	public void insert(ListaS s) {
		if(harray[stringHash(s.nombre)].head == null)
			entries++;
		check();
		harray[stringHash(s.nombre)].insert(s); 
	} 
	
	public void check() {
		if (this.entries > this.maxLoadFactor*this.capacity) {
			this.printHashMap();
			entries = 0;
			int prevCap = this.capacity;
			this.capacity = this.capacity*2;
		    ListaL[] newHarray = new ListaL[this.capacity];
		    for(int i=0; i<newHarray.length; i++) {
		    	if(i<prevCap && this.harray[i].head != null) {
		    		NodeL currentL = this.harray[i].head;
		    		while(currentL != null) {
		    			if(newHarray[stringHash(currentL.getData().nombre)] == null) {
		    				newHarray[stringHash(currentL.getData().nombre)] = new ListaL();
		    				entries++;
		    			}
		    			newHarray[stringHash(currentL.getData().nombre)].insert(currentL.getData());
		    			currentL = currentL.getNext();
		    		}
		    	}
		    	if (newHarray[i] == null)
		    		newHarray[i] = new ListaL(); 
		    }
		    this.harray = newHarray;
		    // System.out.println("SE AMPLIÓ LA CAPACIDAD");
		}
		
	}
	
	public boolean remove(String s) { 
		return harray[stringHash(s)].delete(s);
	}
	
	public NodeL find(String s) {
		return harray[stringHash(s)].find(s);
	}
	
	public void printHashMap() {
		System.out.println(harray.length);
		for(int i=0; i<harray.length; i++) { 
			System.out.print("harray[" + i + "] "); 
			if(harray[i] != null)
				harray[i].print(); 
			System.out.println(); 
		} 
	} 
	
	private int stringHash(String key) { 
		int keyValue = 0;
		for(int i = 0; i<key.length(); i++) 
			keyValue = keyValue + key.charAt(i); 
	    return keyValue % this.capacity;
	}
	
}