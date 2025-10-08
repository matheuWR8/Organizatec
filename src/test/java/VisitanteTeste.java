
import br.edu.cefsa.organizatec.model.Visitante;
import java.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

public class VisitanteTeste {
    @Test
    public void testarEstaNaEmpresa(){
        Visitante visitante = new Visitante("aaa","aaa", LocalDateTime.now(), null, "aaa");
        boolean resultado = visitante.estaNaEmpresa();
        Assert.assertTrue(true);
    }
}
