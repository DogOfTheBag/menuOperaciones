package data;

/**
 *
 * @author Alberto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    /*creo las diferentes opciones en un array*/
    public static void main(String[] args) {
        Opcion[] Ops = {
                new Opcion (1,"Sumar 2 numeros"),
                new Opcion (2,"Restar 2 numeros"),
                new Opcion (3,"Multiplicar 2 numeros"),
                new Opcion (4, "Dividir 2 numeros"),
                new Opcion (5,"Salir"),
            
        };
        /*Creo el objeto del menu, en el que incluyo el array de opciones y el titulo */
        menu m1 = new menu(Ops, "Calculadora");
        int opcion;
        do
        {
            m1.visMenu();
            opcion = m1.GestionarMenu();
        }while (opcion != 5);
        //Este  menu se repetira hasta que el usuario pulse 5
    }

}
