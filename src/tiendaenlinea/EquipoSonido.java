/*
/***************************************************************************************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi *compañero, Profesor o con
el monitor asignado a este curso.
*
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o notas del curso
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*
* <Sebastián Herrera Claro, Stephanie Acosta Sierra – 0221910043, 0221910006>
*
***********************************************************************/

package tiendaenlinea;

/**
 *
 * @author Steph
 */
//EquipoSonido hereda de ProductoElectrónico.
public class EquipoSonido extends ProductoElectrónico 
{
    private double watts; 
    private boolean bluetooth;
    
    public EquipoSonido()
    {
        //Llama al constructor predeterminado de ProductoElectrónico.
        super();
        watts = 0;
        bluetooth = false;
    }

    /*Constructor alternativo de EquipoSonido. 
      Recibe como parámetros price, brand, potency, wireless.
      Inicializa watts con el valor de potency.
      Inicializa bluetooth con el valor de wireless.
    */
    public EquipoSonido(double price, String brand, double potency, boolean wireless )
    {   //Llama al constructor alternativo y le pasa de argumentos todos los parámetros excepto los dos últimos.
        super(price, brand);
        watts = potency;
        bluetooth = wireless;
    }

    
    /*Método Modificador de watts.
      Recibe como parámetro potencia.
      Inicializa watts como potencia.
    */
    public void setWatts( double potencia )
    {
        watts = potencia;
    }
    
    /*Método Analizador de watts.
      No recibe parámetros.
      Retorna watts.
    */
    public double getWatts() 
    {
        return watts;
    }

    /*Método Modificador de bluetooth.
      Recibe como parámetro wireless.
      Inicializa bluetooth como wireless.
    */
    public void setBluetooth( boolean wireless )
    {
        bluetooth = wireless ;
    }
    
    /*Método Analizador de bluetooth.
      No recibe parámetros.
      Retorna bluetooth.
    */
    public boolean getBluetooth()
    {
        return bluetooth;
    }
  
    //Los equipos de sonido tienen descuento de 15% así que se llama al atributo "precioRegular" de Producto y se le saca el descuento.
    @Override
    public double calcularPrecioDescuento() 
    {
        double valordesc = super.precioRegular - (super.precioRegular * 0.15);
        return valordesc;//Retorna el valor con descuento.
    }
    
    //Llama al toString() de ProductoElectrónico y lo concatena con un String determinado dependiendo de si tiene Bluetooth o no.
    @Override
    public String toString()
    {
        if ( bluetooth )
           return super.toString() + "\nPotencia: " + watts + " watts" + "\nTiene Bluetooth";
        else
            return super.toString() + "\nPotencia: " + watts + " watts" + "\nNo tiene Bluetooth";
        
    }

}//Final de la clase EquipoSonido.
