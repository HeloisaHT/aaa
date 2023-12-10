public class Paciente {
    String Nome;
    String Cpf;
    String tipoSanguineo;
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public Paciente(String nome, String cpf, String tipoSanguineo) {
        Nome = nome;
        Cpf = cpf;
        this.tipoSanguineo = tipoSanguineo;
    }
}
