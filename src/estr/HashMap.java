public class HashMap {
	public ListaL[] harray; 
	private int capacity;
	
	public HashMap(int size) {
		this.capacity = size;
		this.harray = new ListaL[this.capacity];
		for(int i=0; i<harray.length; i++) 
			harray[i] = new ListaL(); 
	} 
	
	public void insert(ListaS s) {
		harray[stringHash(s.nombre)].insert(s); 
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
	
	public int getCapacity() {
		return capacity;
	}
	
}
