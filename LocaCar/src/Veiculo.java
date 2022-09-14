public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private Integer ano;
    private float km;
    private double valorKm;

    public Veiculo() {
        this.placa = "AAA-0000";
        this.marca = "Default";
        this.modelo = "Default";
        this.ano = 0000;
        this.km = 0;
        this.valorKm = 10.5;
    }

    public Veiculo(String placa, String marca, String modelo, Integer ano, float km, double valorKm) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.valorKm = valorKm;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (Validacoes.isPlacaValid(placa))
            this.placa = placa;
        return;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == "")
            return;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == "")
            return;
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if (ano > 2023 || ano < 2010)
            return;
        this.ano = ano;

    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        if (km < 0 || km > 90000)
            return;
        this.km = km;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        if (valorKm <= 0.0)
            return;
        this.valorKm = valorKm;
    }

}
