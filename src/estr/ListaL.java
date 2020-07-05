public class ListaL{ 
	public NodeL head;
	
	public ListaL() { 
		head = null; 
	} 
	
	public boolean insert(ListaS item) { 
		boolean inserted = false;
        NodeL newNode = new NodeL(item); 
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
            inserted = true;
        } else {
        	NodeL current = head; 
            while (current.getNext() != null) { 
            	if(current.getData().nombre.equals(item.nombre)) 
            		return inserted;
                current = current.getNext(); 
            } 
            if(!current.getData().nombre.equals(item.nombre))
            	current.setNext(newNode);
        } 
        return inserted;
	} 
	
	public boolean delete(String nombre) { 
		boolean deleted=false; 
		NodeL currNode = head;
		NodeL prev = null;

        if (currNode != null && currNode.getData().nombre == nombre) { 
            head = currNode.getNext();
            return deleted;
        } 
        
        while (currNode != null && currNode.getData().nombre != nombre) { 
            prev = currNode; 
            currNode = currNode.getNext(); 
        }
        
        if (currNode != null) {
            prev.setNext(currNode.getNext()); 
            deleted = true;
        } 

        if (currNode == null)
            deleted = false;
        
        return deleted;
		
	} 
	
	public NodeL find(String data) {
		NodeL current = head;
		while(current != null) {
			if(current.getData().nombre.equals(data))
				return current;
			current = current.getNext();
		}
		return current;
	}
	
	public void print() {  
		NodeL cur = head;
		while(cur != null) {
			System.out.print(cur.getData().nombre); 
			System.out.print(",");
			cur = cur.getNext();
		}
	} 
	
	ListaS ver (int ruta){
		ListaS t = head.getData();
	    for(int i =0;i<ruta;i++){
	    	t = t.verNext();
	    }
	    return t;
	}

}
