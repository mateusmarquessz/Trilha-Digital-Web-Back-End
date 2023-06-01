package Animais;
//atributos  =  caracteristiscas sobre a class
//Atributos tbm sao as definições desse atratibutos
public class Cachorro {


    //Atributos que a class Cachorro
    public String nome;
    public String cor;
    public double altura;
    public double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;

    //Metodos e equivalente a uma Funcao

    public void comer(){}

    public void latir(){
        System.out.println("Au Au");
    }

   public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        if (acao.equals("carinho")){ //equals compara Strings
            this.estadoDeEspirito = "feliz"; //This = Esse
        } else {
            this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
    }
}
