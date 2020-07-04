
public class NodeL { 
	private ListaS data; 
	private NodeL next; 
	
	public NodeL(ListaS list) { 
		this.data = list; 
		next = null; 
	} 
	
	public ListaS getData() { 
		return data;
	} 
	
	public void setData(ListaS data) { 
		this.data = data;

	} 
	
	public NodeL getNext() { 
		return next; 
	} 
	
	public void setNext(NodeL next) { 
		this.next = next; 
	} 
}
