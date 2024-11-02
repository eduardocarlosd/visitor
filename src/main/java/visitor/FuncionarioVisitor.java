package visitor;

public class FuncionarioVisitor implements Visitor{

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirRelatorioCyberSecurity(CyberSecurityAnalyst cyberSecurityAnalyst) {
        String certificacoes = String.join(", ", cyberSecurityAnalyst.getCertificacoes());
        return "CyberSecurityAnalyst{" +
                "Nome=" + cyberSecurityAnalyst.getNome() +
                ", certificacoes=\"" + certificacoes + "\"" +
                ", time=" + cyberSecurityAnalyst.getTime() +
                '}';
    }

    @Override
    public String exibirRelatorioDesenvolvimento(DesenvolvedorSoftware desenvolvedorSoftware){
        return "Dev{" +
                "Nome=" + desenvolvedorSoftware.getNome() +
                ", FrontEnd='" + desenvolvedorSoftware.getTecnologiasFrontEnd() + '\'' +
                ", BackEnd=" + desenvolvedorSoftware.getTecnologiasBackEnd() +
                '}';
    }

    public String exibirRelatorioQA(TraineeQualityAssurance traineeQualityAssurance){
        return "QA{" +
                "Nome=" + traineeQualityAssurance.getNome() +
                ", Ferramentas='" + traineeQualityAssurance.getFerramentas() + '\'' +
                ", Tipos de teste=" + traineeQualityAssurance.getTiposTeste() +
                '}';
    }
}
