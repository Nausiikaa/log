import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostUnionGrupo extends Post
{
    private String nombreGrupo;
    private int cantidadDatosAsociados;
    private String tipoEntrada;
    public PostUnionGrupo(String autor,String grupo)
    {
        super(autor);
        nombreGrupo = grupo;
        cantidadDatosAsociados = 5;
    }

    public String toString()
    {
        String textoDevolver = super.toString();
        textoDevolver = textoDevolver + " se ha unido al grupo " + nombreGrupo + "\n";
        return textoDevolver;
    }

    public String getGrupo()
    {
        return nombreGrupo;
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
        System.out.println(getGrupo() + "\n");
    }
}
