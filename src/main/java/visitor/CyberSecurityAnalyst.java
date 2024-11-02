package visitor;

import java.util.List;

public class CyberSecurityAnalyst implements Funcionario {

    private String nome;
    private List<String> certificacoes;
    private String time;

    public CyberSecurityAnalyst(String nome, List<String> certificacoes, String time) {
        this.nome = nome;
        this.certificacoes = certificacoes;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(List<String> certificacoes) {
        this.certificacoes = certificacoes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String aceitar(Visitor visitor){ return visitor.exibirRelatorioCyberSecurity(this);}
}
