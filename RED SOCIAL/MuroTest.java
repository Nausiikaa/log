

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private PostTexto postText1;
    private PostTexto postText2;
    private PostFoto postFoto1;
    private PostFoto postFoto2;
    private PostUnionGrupo postUnio1;
    private PostUnionGrupo postUnio2;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        postText1 = new PostTexto("Brian", "Me Duele La Tripa");
        postText2 = new PostTexto("Nacho", "Quiero Comer");
        postFoto1 = new PostFoto("Miguel", "AutoFoto", "yop");
        postFoto2 = new PostFoto("Silvia", "CacaFoto", "En el campo");
        postUnio1 = new PostUnionGrupo("Oscar", "Los caranchoas");
        postUnio2 = new PostUnionGrupo("Valeri", "Djs sin fronteras");
        muro1.añadirEntrada(postText1);
        muro1.añadirEntrada(postText2);
        muro1.añadirEntrada(postFoto1);
        muro1.añadirEntrada(postFoto2);
        muro1.añadirEntrada(postUnio1);
        muro1.añadirEntrada(postUnio2);
        muro1.mostrar();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void gafdgsdfg()
    {
        muro1.mostrarDatosExclusivosEntradasFiltradas("PostUnionGrupo", "Oscar");
        muro1.mostrarDatosExclusivosEntradasFiltradas("PostUnionGrupo", "Valeri");
        muro1.mostrarDatosExclusivosEntradasFiltradas("PostFoto", "Miguel");
        muro1.mostrarDatosExclusivosEntradasFiltradas("PostFoto", "Silvia");
        muro1.mostrarDatosExclusivosEntradasFiltradas("PostTexto", "Nacho");
        muro1.mostrarDatosExclusivosEntradasFiltradas("PostTexto", "Brian");
    }
}

