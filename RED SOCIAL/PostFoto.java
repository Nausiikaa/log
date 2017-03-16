import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
public class PostFoto extends Post
{
    // instance variables - replace the example below with your own
    private String urlImagen;
    private String tituloImagen;
    /**
     * Constructor for objects of class PostTexto
     */
    public PostFoto(String autor,String url,String titulo)
    {
        super(autor);
        urlImagen = url;
        tituloImagen = titulo;
    }
    public String getUrlImagen()
    {
        return urlImagen;
    }
    public String getTituloImagen()
    {
        return tituloImagen;
    }
    public String toString()
    {
        String textoDevolver = "";
        textoDevolver = textoDevolver + "Usuario " + getAutor() + "\n";
        textoDevolver = textoDevolver + tituloImagen + "\n";
        textoDevolver = textoDevolver + urlImagen + "\n";
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