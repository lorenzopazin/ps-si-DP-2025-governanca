import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.Assert.assertTrue;

public class AvalicaoValoresSaudeArvoresTests {
    @Test
    public void testMaiorMenorValores() {
        String input = "5\n2\n8\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AvalicaoValoresSaudeArvores.main(new String[]{});

        String saida = outContent.toString();
        assertTrue(saida.contains("O menor numero eh: 2"));
        assertTrue(saida.contains("O maior numero eh: 8"));
    }
    @Test
    public void testOrdemCrescente() {
        String input = "1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AvalicaoValoresSaudeArvores.main(new String[]{});

        String saida = outContent.toString();
        assertTrue(saida.contains("O menor numero eh: 1"));
        assertTrue(saida.contains("O maior numero eh: 3"));
    }
}
