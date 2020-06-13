package estr;

public class BinaryTree {
private Node2 root;
	
	public BinaryTree() {  
        this.root = null;  
    }
	
	public Node2 find(double k, double lon, Node2 R) {
		// si el valor el igual al key de R o R es nulo
	    if (R.getKey() == k || R == null ) return R; 
	    // si el valor el valor es menor al key de R, busca en el nodo
	    // izquierdo, de lo contrario busca en el nodo derecho
	    if (R.getKey() > k) return find(k, lon, R.getLeft()); 
	    return find(k, lon, R.getRight()); 
	}
	
	public void insertElem(double k, double lon) {
		// inserta el valor (k,lon) en el arbol llamando la funci�n insert
		this.root = insert(k, lon, this.root);
	}
	
	public Node2 insert (double key, double lon, Node2 R) { 
		// inserta un valor en el arbol por recursi�n
		// si el nodo es nulo, devuelve un nodo con el key
		if (R == null) R = new Node2(key, lon);  
		// si el valor k es menor al key del nodo R, inserta 
		// el valor al lado izquierdo del nodo R, si es mayor 
		// lo inserta a la derecha y si es igual no lo agrega
		if (key < R.getKey() ) 
            R.setLeft(insert(key, lon, R.getLeft())); 
        else if (key > R.getKey())
            R.setRight(insert(key, lon, R.getRight()));
		return R;
	}
	
	public void deleteElem(double k, double lon) { 
		// elimina el valor (k,lon) en el arbol llamando la funci�n delete
        this.root = delete(k, lon, this.root); 
    } 
  
    public Node2 delete(double k, double l, Node2 R) { 
    	// inserta un valor en el arbol por recursi�n
        // si el arbol est� vac�o, devuelve un nodo con el key
        if (R == null)  return R; 
        // busca el nodo con los valores k,l
        if (k < R.getKey()) R.setLeft(delete(k, l, R.getLeft())); 
        else if (k > R.getKey()) R.setRight(delete(k, l, R.getRight())); 
        // ya encontrado el nodo con los valores
        else {
        	// si tiene solo un hijo, asigna ese hijo al padre del nodo 
        	// a borrar o si no tiene hijos, asigna el valor nulo 
            if (R.getLeft() == null) 
                return R.getRight(); 
            else if (R.getRight() == null) 
                return R.getLeft();
            // si tiene dos hijos reemplaza el nodo a borrar con el nodo 
            // de menor valor en el subarbol derecho del nodo a borrar
            double values[] = minValue(R.getRight());
            R.setVal(values[0], values[1]);
            R.setRight(delete(R.getKey(), R.getLon(), R.getRight())); 
        }
        return R; 
    }
    
    public double[] minValue(Node2 R) { 
    	// devuelve el valor m�nimo en un arbol
        double min = R.getKey(); 
        double lon = R.getLon();
        double values[] = new double[2];
        while (R.getLeft() != null) { 
            min = R.getLeft().getKey(); 
            lon = R.getLeft().getLon(); 
            R = R.getLeft(); 
        }
        // valores del nodo
        values[0] = min;
        values[1] = lon;
        return values;
    } 
	
	public Node2 getRoot() {
		return root;
	}

	public void setRoot(Node2 root) {
		this.root = root;
	}
}
