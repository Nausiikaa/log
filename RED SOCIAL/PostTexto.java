import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class PostTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostTexto extends Post
{
    // instance variables - replace the example below with your own
    private String textoMensaje;
    /**
     * Constructor for objects of class PostTexto
     */
    public PostTexto(String autor,String texto)
    {
        super(autor);
        textoMensaje = texto;
    }
    public String getTextoMensaje()
    {
        return textoMensaje;
    }
    public String toString()
    {
        String textoDevolver = "";
        textoDevolver = textoDevolver + "Usuario " + getAutor() + "\n";
        textoDevolver = textoDevolver + getComentarios() + "\n";
        textoDevolver = textoDevolver + getMeGustas() + " me gusta";
        
        long segundosPasados = getHoraPublicacion().until(LocalDateTime.now(),ChronoUnit.SECONDS);
        long minutosPasados = segundosPasados / 60;
        long segundosRestantes = segundosPasados % 60;
        if(minutosPasados == 0){
            textoDevolver = textoDevolver + " Hace " + segundosPasados + " segundos.";
        }
        else{
            textoDevolver = textoDevolver + " Hace " + minutosPasados + " minutos y " + segundosRestantes + " segundos.";
        }
        textoDevolver = textoDevolver + "\n" + getComentarios();
        return textoDevolver;
    }
}
