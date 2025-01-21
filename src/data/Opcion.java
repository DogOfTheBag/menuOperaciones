package data;

/**
 *
 * @author Alberto
 */

/*Empiezo con la clase opcion, que tendra un constructor que le solicite
por un lado un codigo numerico y por otro lado el texto de la opcion*/
public class Opcion {
    private final int cod;
    private final String texto;
    
    public Opcion(int cod, String texto)
    {
        this.cod = cod;
        this.texto = texto;
    }
    /*Despues haremos un metodo para visibilizar las opciones, que usaremos en el futuro*/    
    public void visOp()
    {
        System.out.println(cod +(": ") + texto);
    };
   
}
