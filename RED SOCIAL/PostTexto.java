import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class PostTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostTexto extends PostConComentarios
{
    // instance variables - replace the example below with your own
    private String textoMensaje;
    private int cantidadDatosAsociados;
    /**
     * Constructor for objects of class PostTexto
     */
    public PostTexto(String autor,String texto)
    {
        super(autor);
        textoMensaje = texto;
        cantidadDatosAsociados = 6;
    }

    public String getTextoMensaje()
    {
        return textoMensaje;
    }

    public String toString()
    {
        String textoDevolver = super.toString();
        textoDevolver = textoDevolver + getTextoMensaje() + "\n";
        return textoDevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return cantidadDatosAsociados;
    }

    public void mostrarDatosExclusivos()
    {
        System.out.println(getTextoMensaje());
    }
}
