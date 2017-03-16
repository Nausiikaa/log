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
    
    public PostUnionGrupo(String autor,String grupo)
    {
        super(autor);
        nombreGrupo = grupo;
    }
    public String getNombreGrupo()
    {
        return nombreGrupo;
    }
    public String toString()
    {
        String textoDevolver = "";
        textoDevolver = textoDevolver + "Usuario " + getAutor() + "\n";
        textoDevolver = textoDevolver + getMeGustas() + " me gusta";
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
}
