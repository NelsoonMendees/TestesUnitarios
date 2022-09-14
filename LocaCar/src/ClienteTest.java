import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    Cliente cli = new Cliente();

    @Test
    void testGetCpfValido() {
        cli.setCpf("93589434082");
        assertEquals("93589434082", cli.getCpf());
    }

    @Test
    void testGetCpfInvalido() {
        cli.setCpf("999999999990");
        assertEquals("00000000000", cli.getCpf());
    }

    @Test
    void testGetDataNascimentoValida() {
        cli.setDataNascimento("05/10/1991");
        assertEquals("05/10/1991", cli.getDataNascimento());
    }

    @Test
    void testGetDataNascimentoInvalida() {
        cli.setDataNascimento("32/10/1991");
        assertEquals("00/00/0000", cli.getDataNascimento());
    }

    @Test
    void testGetEmailValido() {
        cli.setEmail("nelson_mendes@live.com");
        assertEquals("nelson_mendes@live.com", cli.getEmail());
    }

    @Test
    void testGetEmailInvalido() {
        cli.setEmail("nelson_mendes.live.com");
        assertEquals("user@email.com", cli.getEmail());
    }

    @Test
    void testGetNome() {
        cli.setNome("Nelson Mendes");
        assertEquals("Nelson Mendes", cli.getNome());
    }

    @Test
    void testGetTelefone() {
        cli.setTelefone("62981317252");
        assertEquals("62981317252", cli.getTelefone());
    }

    @Test
    void testGetTelefoneInvalido() {
        cli.setTelefone("629999999299");
        assertEquals("00000000000", cli.getTelefone());
    }
}
