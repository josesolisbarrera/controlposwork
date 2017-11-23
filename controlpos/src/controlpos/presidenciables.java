package controlpos;

import java.util.Scanner;

public class presidenciables{
    private Scanner teclado;
    private String nombre;
    private int edad;
    private String partidopolitico;

    public  presidenciables() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
        System.out.print("ingrese partido politico");
        partidopolitico=teclado.next();
    }
    
    public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
        System.out.println("Partido politico;"+partidopolitico);
    }
    
    public void esMayor() {
        if (edad>=35) {
            System.out.print(nombre+"es mayor a 35.");
        } else {
            System.out.print(nombre+" no es mayor a 35.");
        }
    }
    
    public static void main(String[] ar) {
    	presidenciables sdfsasdfasdfasdd =new presidenciables();
    	
    	sdfsasdfasdfasdd.imprimir();
        
    }

	
	

	
}

	
		
		
	

