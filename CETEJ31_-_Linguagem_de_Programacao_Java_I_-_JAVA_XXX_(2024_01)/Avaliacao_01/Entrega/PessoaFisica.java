// @author Wady Jorge
public final class PessoaFisica extends ClienteBanco {
    
    private int cpf = 0;
    
    // Getters e Setters
    public int getCpf() {
        return cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void verifDoc(){
        if (cpf >= 10 && cpf <= 20) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}
