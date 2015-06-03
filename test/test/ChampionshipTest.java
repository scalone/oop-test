package test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.test.*;

public class ChampionshipTest {
	@Before public void setUp() {
	}

	@Test public void testMain() {
		Carioca carioca   = new Carioca();
		Paulista paulista = new Paulista();
		Gaucho gaucho     = new Gaucho();

		ArrayList<Championship> array = new ArrayList<Championship>();

		array.add(carioca);
		array.add(paulista);
		array.add(gaucho);

    for(Championship championship: array) {
			// Neste ponto ocorre o polimorfismo, aonde chamamos o método
			// show() para qualquer objeto(Carioca, Paulista, Gaucho).
			championship.show();
    }
	}
}

