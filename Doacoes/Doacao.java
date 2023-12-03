package Doacoes;

public class Doacao {
    private boolean habilitado_triagem;
    public boolean isHabilitado_triagem() {
        return habilitado_triagem;
    }
    public void setHabilitado_triagem(boolean habilitado_triagem) {
        this.habilitado_triagem = habilitado_triagem;
    }
    private String cpf_doador;
    public String getCpf_doador() {
        return cpf_doador;
    }
    public void setCpf_doador(String cpf_doador) {
        this.cpf_doador = cpf_doador;
    }
    private String tipo_sanguineo;
    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }
    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }
    private String sangue_doado;
    public String getSangue_doado() {
        return sangue_doado;
    }
    public void setSangue_doado(String sangue_doado) {
        this.sangue_doado = sangue_doado;
    }
    private int quantidade_sangue;
    public int getQuantidade_sangue() {
        return quantidade_sangue;
    }
    public void setQuantidade_sangue(int quantidade_sangue) {
        this.quantidade_sangue = quantidade_sangue;
    }
    private String data_doacao;
    public String getData_doacao() {
        return data_doacao;
    }
    public void setData_doacao(String data_doacao) {
        this.data_doacao = data_doacao;
    }
    private String rua_hospital;
    public String getRua_hospital() {
        return rua_hospital;
    }
    public void setRua_hospital(String rua_hospital) {
        this.rua_hospital = rua_hospital;
    }
    private int numero_hospital;
    public int getNumero_hospital() {
        return numero_hospital;
    }
    public void setNumero_hospital(int numero_hospital) {
        this.numero_hospital = numero_hospital;
    }
    private String bairro_hospital;
    public String getBairro_hospital() {
        return bairro_hospital;
    }
    public void setBairro_hospital(String bairro_hospital) {
        this.bairro_hospital = bairro_hospital;
    }
    private String cidade_hospital;
    public String getCidade_hospital() {
        return cidade_hospital;
    }
    public void setCidade_hospital(String cidade_hospital) {
        this.cidade_hospital = cidade_hospital;
    }
    private String estado_hospital;
    public String getEstado_hospital() {
        return estado_hospital;
    }
    public void setEstado_hospital(String estado_hospital) {
        this.estado_hospital = estado_hospital;
    }
    private String nome_paciente;
    public String getNome_paciente() {
        return nome_paciente;
    }
    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }
    private String cpf_paciente;
    public String getCpf_paciente() {
        return cpf_paciente;
    }
    public void setCpf_paciente(String cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }
    private boolean transfusao_feita;
    public boolean isTransfusao_feita() {
        return transfusao_feita;
    }
    public void setTransfusao_feita(boolean transfusao_feita) {
        this.transfusao_feita = transfusao_feita;
    }
    private String observacao_paciente;
    public String getObservacao_paciente() {
        return observacao_paciente;
    }
    public void setObservacao_paciente(String observacao_paciente) {
        this.observacao_paciente = observacao_paciente;
    }
    public void setHabilitadoTriagem(boolean selected) {
    }
    public void setTipoSanguineo(String text) {
    }

    
}