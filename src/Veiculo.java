public class Veiculo {
    private String nome;
    private String placa;
    private String cor;
    private int ano;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString(){
        return "VEICULO: "+getNome()+" COR: "+getCor()+" PLACA: "+getPlaca()+" ANO: "+getAno()+"\n";
    }
}
