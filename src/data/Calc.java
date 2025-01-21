package data;

import javax.swing.JOptionPane;
/**
 *
 * @author Alberto
 */
/*Hago la clase calc, que pedira los dos numeros necesarios para las operaciones*/
public class Calc
{
    private final float num1;
    private final float num2;

    public Calc(float num1, float num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    /*diferentes metodos para las operaciones*/
    public void suma()
    {
        final float resultado = num1 + num2;
        JOptionPane.showMessageDialog(null,"El resultado de la suma entre " + num1 + " y " + num2 + " es: " + resultado);
    }

    public void resta()
    {
        final float resultado = num1 - num2;
        JOptionPane.showMessageDialog(null,"El resultado de la resta entre " + num1 + " y " + num2 + " es: " + resultado);
    }
    public void multiplicar()
    {
        final float resultado = num1 * num2;
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion entre " + num1 + " y " + num2 + " es: " + resultado);
    }
    public void dividir()
    {
        final float resultado = num1 / num2;
        JOptionPane.showMessageDialog(null,"El cociente de la division entre " + num1 + " y " + num2 + " es: " + resultado);
    }
    
    /*este metodo se encarga de coger el input del usuario para saber que operacion quiere
     y la hace*/
public void RealizarOperacion(int op)
    {
        switch(op)
        {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicar();
                break;
             case 4:
                dividir();
                break;
        }
    }
}

  