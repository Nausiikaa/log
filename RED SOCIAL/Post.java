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
    private ArrayList<String> listaComentarios;
    /**
     * Constructor for objects of class Post
     */
    public Post(String autor)
    {
        nombreUsuario = autor;
        timeStamp = LocalDateTime.now();
        meGustas = 0;
        listaComentarios = new ArrayList<>();
    }

    public LocalDateTime getTimeStamp()
    {
        return timeStamp;
    }

    public void meGusta()
    {
        meGustas++;
    }

    public void comentar(String texto)
    {
        listaComentarios.add(texto);
    }

    public String getAutor()
    {
        return nombreUsuario;
    }

    public int getMeGustas()
    {
        return meGustas;
    }

    public LocalDateTime getHoraPublicacion()
    {
        return timeStamp;
    }

    public String getComentarios()
    {
        String comentarios = null;
        if(!listaComentarios.isEmpty()){
            for(String comentario:listaComentarios){
                comentarios = comentarios + comentario + "\n";
            }
        }
        else{
            comentarios = "No hay comentarios disponibles.";
        }
        return comentarios;
    }
}
