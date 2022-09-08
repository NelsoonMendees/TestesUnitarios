
public class Cliente {
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;

    public Cliente(String cpf, String nome, String dataNascimento, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if (Validacoes.isCPF(cpf) == true) {
            this.cpf = cpf;
        } else {
            this.cpf = "Invalido!";
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (Validacoes.isDateValid(dataNascimento) == true) {
            this.dataNascimento = dataNascimento;
        } else {
            this.dataNascimento = "Invalida!";
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validacoes.isValidEmail(email) == true) {
            this.email = email;
        } else {
            this.email = "Invalido!";
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (Validacoes.isFoneValid(telefone) == true) {
            this.telefone = telefone;
        } else {
            this.telefone = "Invalido!";
        }

    }

}
