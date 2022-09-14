
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
        this.cpf = "00000000000";
        this.nome = "User";
        this.dataNascimento = "00/00/0000";
        this.email = "user@email.com";
        this.telefone = "00000000000";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if (Validacoes.isCPF(cpf) == true)
            this.cpf = cpf;
        return;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == "")
            return;
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (Validacoes.isDateValid(dataNascimento) == true)
            this.dataNascimento = dataNascimento;
        return;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validacoes.isValidEmail(email) == true)
            this.email = email;
        return;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (Validacoes.isFoneValid(telefone) == true)
            this.telefone = telefone;
        return;
    }

}
