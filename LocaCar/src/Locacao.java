import java.time.LocalDate;

public class Locacao extends Veiculo {

    private Veiculo Veiculo = new Veiculo();;
    private LocalDate datInicio;
    private LocalDate dataFim;

    public Locacao(Veiculo veic, LocalDate datInicio, LocalDate dataFim) {
        Veiculo = veic;
        this.datInicio = datInicio;
        this.dataFim = dataFim;
    }

    public Locacao() {
        new Veiculo();

    }

    public LocalDate getDatInicio() {
        return datInicio;
    }

    public void setDatInicio(LocalDate datInicio) {
        this.datInicio = datInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(Veiculo veic) {
        Veiculo = veic;
    }

}
