package Pila;

//PILA HECHA CON COLAS

public class Pila {
	
	static Cola cola;
    static Cola cola2;
    static Cola salida;
	
	public Pila(){
		int n=5;
		
	       cola=new Cola();
	       cola2= new Cola();
	       salida = new Cola();
			

			cola.offer("uno");
			cola.offer("dos");
			cola.offer("tres");
			cola.offer("cuatro");
			cola.offer("cinco");

			System.out.println("Primer que ingresa"); 
			System.out.println(cola.peek());
			
			aCola(n);
			for(int i=n-1;i>0;i--){
				aCola2(i);
				aCola(i);
			}
			salida.offer(cola.poll());
			
			

			System.out.println(); 

			System.out.println("Orden de salida"); 

			while(salida.peek()!=null){ 
			System.out.println(salida.poll()); 
			}
		
	}
	
	private static void aCola(int n){
		int i=0;
		while(i<n){ 
			if(i<n-1){
				cola2.offer(cola.poll());
				//System.out.println(cola2.poll());
				i++;
			}else{
				salida.offer(cola.poll());
				i++;
			}
		}		
	}
	
	private static void aCola2(int n){
		int i=0;
		while(i<n){ 
			cola.offer(cola2.poll());
			//System.out.println(cola.poll());
			i++;
				

		}		
	}
	
	public static void main(String[] args){
		Pila Pila = new Pila();
	}

}
