public class Motor {

    private int qtdPist;
    private int potencia;

    // Contrutor padrão (sem parâmetros)
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }

    // Construtor com parâmetros
    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    // Getters e Setters
    public int getQtdPist() {
        return this.qtdPist;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}