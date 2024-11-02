package visitor;

public interface Visitor {
    String exibirRelatorioDesenvolvimento(DesenvolvedorSoftware desenvolvedorSoftware);
    String exibirRelatorioCyberSecurity(CyberSecurityAnalyst cyberSecurityAnalyst);
    String exibirRelatorioQA(TraineeQualityAssurance traineeQualityAssurance);
}
