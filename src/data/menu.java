package data;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */

/*Para hacer un menu, necesitaremos tanto el titulo como las diferentes opciones
por lo tanto, tendremos un array con todas las opciones posibles que queremos*/
public class menu {
    private final Opcion Ops[];
    private final String titulo;

    public menu(Opcion[] Ops, String titulo) {
        this.Ops = Ops;
        this.titulo = titulo;
    }
   
    /*Haremos una funcion para visualizar el menu, juntando el titulo con
    las diferentes opciones que queramos, usando un for para poner todas con la funcion visOp */
    public void visMenu()
    {
        System.out.println(titulo);
        
        for (int i = 0; i < Ops.length; i++) {
            Ops[i].visOp();
            
        }
    }
    /*scanner para coger los diferentes inputs del user*/
    Scanner sc = new Scanner(System.in);
    
    /*este metodo se encarga de coger la opcion deseada del usuario,
    verificar si es correcta y que quiere hacer, y despues hara la salida si se pulsa 5*/
    public int GestionarMenu()
    {
        int op;
        do{
        System.out.println("Introducza la opcion deseada");
       
        op=sc.nextInt();
        }while(op < 0 || op >5);

        
        if (op<5)
        {
            System.out.println("Introduce el primer numero");
            final float num1 = sc.nextFloat();
            System.out.println("Introduce el segundo numero");
            final float num2 = sc.nextFloat();
            
            Calc c1 = new Calc(num1, num2);
            c1.RealizarOperacion(op);
            
            
        }
        else
        {
            System.out.println("Hasta Luego!");
        }
        
        return op;
        }
  
    
    
        
        
        
    
    
    
}
