public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private Integer ano;
    private float km;
    private double valorKm;

    public Veiculo() {
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
        if (Validacoes.isPlacaValid(placa)) {
            this.placa = placa;
        } else {
            this.placa = "Invalida!";
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if (ano > 2023) {
            this.ano = 2022;
        } else if (ano < 2010) {
            this.ano = 2012;
        }
        this.ano = ano;

    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        if(km < 0.0){
            this.km = 0;
        }
        this.km = km;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        if (valorKm < 0.0) {
            this.valorKm = 10.00;
        } else {
            this.valorKm = valorKm;
        }

    }

}
