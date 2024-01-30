package turma11o.m17b_projetocolab_fichatrab3;
public class Retangulo {
    // atributos
    private String nome;
    private double largura;
    private double altura;
    
    // construtor
    public Retangulo(String nome, double largura, double altura) {
        this.nome    = nome;
        this.largura = (largura>0 && largura<100)? largura : 1;
        this.altura  = (altura>0 && altura<100)? altura : 1;
    }    

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // método toString()
    @Override
    public String toString() {
        return "Retângulo:\n\tnome: " + nome + "\n\tlargura: " + largura + "\n\taltura: " + altura + "\n\t"+
                "área: "+largura*altura + "\n\tperímetro: "+2*(largura+altura)+"\n";
    }
}
