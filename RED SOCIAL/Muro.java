import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    
    private ArrayList<PostTexto> mensajes;
    private ArrayList<PostFoto> fotos;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
       mensajes = new ArrayList<>();
       fotos = new ArrayList<>();
    }
    public void añadirEntradaTexto(PostTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }
    public void añadirEntradaFoto(PostFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    public String toString()
    {
        String cadenaDevolver = "";
        for(PostTexto entrada : mensajes)
        {
            cadenaDevolver = cadenaDevolver + entrada+ "\n";
        }
        for(PostFoto entradaFoto : fotos)
        {
            cadenaDevolver = cadenaDevolver + entradaFoto+ "\n";
        }
        return cadenaDevolver;
    }
    public void mostrar()
    {
        System.out.println(this);
    }
}
