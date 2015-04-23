package colas;


//COLA HECHA CON PILAS
public class Cola {
	
	public Cola(){
		Pila pila=new Pila();
	    Pila pila2=new Pila();
	       
			System.out.println("COLA CON PILAS");

			pila.push("a");
			pila.push("b");
			pila.push("c");
			pila.push("d");
			pila.push("e");

			
			System.out.println("Ultimo dato ingresado"); 
			System.out.println(pila.peek());
			

			System.out.println(); 
			
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			
			System.out.println("Orden de salida"); 
			System.out.println();
			
			while(pila2.empty()==false){ 
				System.out.println(pila2.pop()); 
			}
		
	}
	
	public static void main(String[] args) {			
			Cola Cola = new Cola();
		}

}
