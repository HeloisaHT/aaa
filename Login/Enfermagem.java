package Login;

public class Enfermagem {
    String Nome;
    String email;
    String Senha;
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public Enfermagem(String nome, String email, String senha) {
        Nome = nome;
        this.email = email;
        Senha = senha;
    }
    
}
