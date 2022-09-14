import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VeiculoTest {
    Veiculo veiculo = new Veiculo("OMQ-3863", "VW", "Golf", 2022, 1800, 10.5);
    Veiculo veic = new Veiculo();

    @Test
    void testGetAnoValido() {
        assertEquals(2022, veiculo.getAno());
    }

    @Test
    void testGetAnoComConstrutorVazio() {
        assertEquals(0000, veic.getAno());
    }

    @Test
    void testGetAnoMaior() {
        veiculo.setAno(2024);
        assertEquals(2022, veiculo.getAno());
    }

    @Test
    void testGetAnoInvalido() {
        veic.setAno(2009);
        assertEquals(0, veic.getAno());
    }

    @Test
    void testGetKmValido() {
        veiculo.setKm(12000);
        assertEquals(12000, veiculo.getKm());
    }

    @Test
    void testGetKmInvalido() {
        veiculo.setKm(-122);
        assertEquals(1800.00, veiculo.getKm());
    }

    @Test
    void testGetMarca() {
        veiculo.setMarca("VW");
        assertEquals("VW", veiculo.getMarca());
    }

    @Test
    void testSetMarcaVazio(){
        veiculo.setMarca("");
        assertEquals("VW", veiculo.getMarca());
    }

    @Test
    void testGetModelo() {
        veiculo.setModelo("Golf");
        assertEquals("Golf", veiculo.getModelo());
    }

    @Test
    void testGetPlaca() {
        assertEquals("OMQ-3863", veiculo.getPlaca());
    }

    @Test
    void testSetPlacaInvalida() {
        veiculo.setPlaca("00a-aa44");
        assertEquals("OMQ-3863", veiculo.getPlaca());
    }

    @Test
    void testGetValorKmValido() {
        veiculo.setValorKm(12.5);
        assertEquals(12.5, veiculo.getValorKm());
    }

    @Test
    void testGetValorKmInvalido() {
        veiculo.setValorKm(-1.0);
        assertEquals(10.5, veiculo.getValorKm());
    }
}
