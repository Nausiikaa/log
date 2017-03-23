import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    private String nombreUsuario;
    private LocalDateTime timeStamp;
    private int meGustas;
    private int noMeGusta;
    /**
     * Constructor for objects of class Post
     */
    public Post(String autor)
    {
        nombreUsuario = autor;
        timeStamp = LocalDateTime.now();
        meGustas = 0;
        noMeGusta = 0;
    }

    public LocalDateTime getTimeStamp()
    {
        return timeStamp;
    }

    public void meGusta()
    {
        meGustas++;
    }

    public void noMeGusta()
    {
        noMeGusta++;
    }

    public String getAutor()
    {
        return nombreUsuario;
    }

    public int getMeGustas()
    {
        return meGustas;
    }

    public int getNoMeGustas()
    {
        return noMeGusta;
    }

    public LocalDateTime getHoraPublicacion()
    {
        return timeStamp;
    }

    public String toString()
    {
        String textoDevolver = "";
        textoDevolver = textoDevolver + "Usuario " + getAutor() + "\n";
        textoDevolver = textoDevolver + getMeGustas() + " me gusta ";
        textoDevolver = textoDevolver + getNoMeGustas() + " No me gusta";

        long segundosPasados = getHoraPublicacion().until(LocalDateTime.now(),ChronoUnit.SECONDS);
        long minutosPasados = segundosPasados / 60;
        long segundosRestantes = segundosPasados % 60;
        if(minutosPasados == 0){
            textoDevolver = textoDevolver + " Hace " + segundosPasados + " segundos.";
        }
        else{
            textoDevolver = textoDevolver + " Hace " + minutosPasados + " minutos y " + segundosRestantes + " segundos.";
        }
        return textoDevolver;
    }

    public void mostrar()
    {

    }
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 0;
    }
}
