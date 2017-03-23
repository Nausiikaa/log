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

    private ArrayList<Post> entradas;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<>();
    }

    public void añadirEntrada(Post entrada)
    {
        entradas.add(entrada);
    }

    public String toString()
    {
        String cadenaDevolver = "";
        for(Post entrada : entradas)
        {
            cadenaDevolver = cadenaDevolver + entrada + "\n";
        }
        return cadenaDevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public void verCantidadDatosPorEntrada()
    {
        for(Post entrada: entradas){
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String entradaAFiltrar,String autorPost)
    {
        for(Post entrada : entradas){
            if(entradaAFiltrar == entrada.getClass().getSimpleName() && autorPost == entrada.getAutor() || autorPost == null && entradaAFiltrar == entrada.getClass().getSimpleName() || entradaAFiltrar == null && autorPost == entrada.getAutor() || entradaAFiltrar == null &&  autorPost == null)
            {
                switch (entrada.getClass().getSimpleName())
                {
                    case "PostTexto":
                    ((PostTexto)entrada).mostrarDatosExclusivos();
                    break;
                    case "PostFoto":
                    ((PostFoto)entrada).mostrarDatosExclusivos();
                    break;
                    case "PostUnionGrupo":
                    ((PostUnionGrupo)entrada).mostrarDatosExclusivos();
                    break;
                }
            }
        }
    }
}
