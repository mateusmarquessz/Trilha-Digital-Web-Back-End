package Animais;
//atributos  =  caracteristiscas sobre a class
//Atributos tbm sao as definições desse atratibutos

public class Cachorro {


    //Atributos que a class Cachorro
    private String nome;
    private String cor;
    private double altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    //Construtores
    //Sao aqueles que executam a construcao do seu Objeto

    //Construtor padrao
    public Cachorro(){}

    //Construtor padrao
    public Cachorro(String nome, String cor, double altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    Cachorro(String nome, String cor, Double altura, double peso, int tamanhoDoRabo){

    }




    //Metodos e equivalente a uma Funcao
    public void comer(){}

    public void latir(){
        System.out.println("Au Au");
    }

   public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        //enum
        switch (acao){
            case "carinho" : this.estadoDeEspirito = "Feliz";
                break;
            case "vai dormir!" : this.estadoDeEspirito = "Bravo";
                break;
            case "Pisar na patinha" : this.estadoDeEspirito = "Triste";
                break;
            default:this.estadoDeEspirito = "Neutro";
        }
        return this.estadoDeEspirito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
}
