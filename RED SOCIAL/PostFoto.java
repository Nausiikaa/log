import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
public class PostFoto extends PostConComentarios
{
    // instance variables - replace the example below with your own
    private String urlImagen;
    private String tituloImagen;
    private int cantidadDatosAsociados;
    /**
     * Constructor for objects of class PostTexto
     */
    public PostFoto(String autor,String url,String titulo)
    {
        super(autor);
        urlImagen = url;
        tituloImagen = titulo;
        cantidadDatosAsociados = 7;
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
        String textoDevolver = super.toString();
        textoDevolver = textoDevolver + tituloImagen + "\n";
        textoDevolver = textoDevolver + urlImagen + "\n";
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
        System.out.println(getTituloImagen() + "\n" + getUrlImagen());
    }
}