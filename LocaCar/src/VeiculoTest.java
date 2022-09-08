import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VeiculoTest {
    Veiculo veiculo = new Veiculo();

    @Test
    void testGetAno() {
        veiculo.setAno(2022);
        assertEquals(2022, veiculo.getAno());
    }

    @Test
    void testGetAnoInvalido() {
        veiculo.setAno(2009);
        assertEquals(2012, veiculo.getAno());
    }

    @Test
    void testGetKmValido() {
        veiculo.setKm(12000);
        assertEquals(12000, veiculo.getKm());
    }

    @Test
    void testGetKmInvalido() {
        veiculo.setKm(-122);
        assertEquals(0, veiculo.getKm());
    }

    @Test
    void testGetMarca() {
        veiculo.setMarca("VW");
        assertEquals("VW", veiculo.getMarca());
    }

    @Test
    void testGetModelo() {
        veiculo.setModelo("Golf");
        assertEquals("Golf", veiculo.getModelo());
    }

    @Test
    void testGetPlaca() {
        veiculo.setPlaca("OMQ-3863");
        assertEquals("OMQ-3863", veiculo.getPlaca());
    }

    @Test
    void testGetValorKmValido() {
        veiculo.setValorKm(12.00);
        assertEquals(12.00, veiculo.getValorKm());
    }

    @Test
    void testGetValorKmInvalido() {
        veiculo.setValorKm(-1.00);
        assertEquals(10.00, veiculo.getValorKm());
    }
}
