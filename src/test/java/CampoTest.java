/*
import org.example.exceptions.ExplosaoException;
import org.example.model.Campo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CampoTest {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoRealDistancia1Esquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoRealDistancia1Direita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoRealDistancia1EmCima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoRealDistancia1EmBaixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoRealDistancia2() {
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho() {
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado() {
        Assertions.assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao() {
        campo.alternarMarcacao();
        Assertions.assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas() {
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        Assertions.assertTrue(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado() {
        Assertions.assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado() {
        campo.alternarMarcacao();
        Assertions.assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado() {
        campo.alternarMarcacao();
        campo.minar();
        Assertions.assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoNaoMarcado() {
        campo.minar();
        Assertions.assertThrows(ExplosaoException.class, () -> {
            Assertions.assertFalse(campo.abrir());
        });
    }

    @Test
    void testeAbrirComVizinhos1() {
        Campo vizinhoDoVizinho1 = new Campo(1, 1);
        Campo vizinho1 = new Campo(2, 2);

        campo.adicionarVizinho(vizinhoDoVizinho1);
        campo.adicionarVizinho(vizinho1);

        campo.abrir();

        Assertions.assertFalse(campo.abrir());


    }

    @Test
    void testeAbrirComVizinhos2() {
        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 1);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        Assertions.assertTrue(campo22.isAberto() && !campo11.isAberto());

    }

}
*/
