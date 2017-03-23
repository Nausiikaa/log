import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class PostConComentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostConComentarios extends Post
{
    // instance variables - replace the example below with your own
    private ArrayList<String> listaComentarios;

    /**
     * Constructor for objects of class PostConComentarios
     */
    public PostConComentarios(String autor)
    {
        super(autor);
        listaComentarios = new ArrayList<>();
    }

    public void comentar(String texto)
    {
        listaComentarios.add(texto);
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
            comentarios = "\n"+"No hay comentarios disponibles.";
        }
        return comentarios;
    }
    public String toString()
    {
        String textoDevolver = super.toString();
        textoDevolver = textoDevolver + getComentarios() + "\n";
        return textoDevolver;
    }
}
