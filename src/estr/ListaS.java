/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;


public class ListaS {
  private Nodo head;
  public String nombre;
  public int contagio;
  int tam;
  private ListaS next;
  ListaS(String s){
      head = null;
      tam = 0;
      nombre = s;
      
  }
  void agregar (ListaS nd){
        this.next = nd;
    }
  ListaS verNext(){
      return this.next;
  }
  void setNext(ListaS s){
      this.next = s;
  }
  void  add (double lon, double lat,int b){
      if(head == null){
          head = new Nodo(lon, lat,b);
      }
      else{
          Nodo t = head;
          Nodo n= new Nodo(lon, lat ,b);
          n.agregar(t);
          head = n; 
      }
      tam++;
  }
  Nodo ver (int ruta){
      Nodo t = head;
      for(int i =0;i<ruta;i++){
          t = t.verNext();
      }
      return t;
  }
  

  int compare(ListaS lista) {
	  // recibe la lista de elementos que se quiere comparar con los datos ya almacenados
	  //ListaS new_list = new ListaS();
          int cc = 0;
	  Nodo n1;
	  Nodo n2 = lista.head;
	  for (int i=0; i<lista.tam; i++) {
		  n1 = head;
		  for (int j=0; j<tam; j++) {
			  if (n1.getLugar().equals(n2.getLugar())) {
				  //new_list.add(n1.getLugar(), n1.getHora());
                                  cc++;
				  break;
			  }
			  if (n1.verNext() == null) break; n1 = n1.verNext();
		  }
	      if (n2.verNext() == null) break; n2 = n2.verNext();
	  }
	  //System.out.print("número de coincidencias: ");
          //System.out.println(cc);
          return cc;
	  //System.out.println(new_list.tam);
	  //return new_list;
  }
  public void mostrar(){
      Nodo t = head;
      for(int i =0;i<tam;i++){
          System.out.println(t.getLugar());
          t = t.verNext();
      }
  }
}
