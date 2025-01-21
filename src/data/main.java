package data;



/**
 *
 * @author Alberto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Opcion[] Ops = {
                new Opcion (1,"Sumar 2 numeros"),
                new Opcion (2,"Restar 2 numeros"),
                new Opcion (3,"Multiplicar 2 numeros"),
                new Opcion (4, "Dividir 2 numeros"),
                new Opcion (5,"Salir"),
            
        };
        
        menu m1 = new menu(Ops, "Calculadora");
        int opcion;
        do
        {
        m1.visMenu();
        opcion = m1.GestionarMenu();
        }while (opcion != 5);
        
    }
    
}
