
//Classe = A classe define como serao as coisas, como a casa vai ser! Definicao
//Objeto = E a casa e as caracteriscas e e

import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        //Variavel de referencia, funciona como referencia do objeto da class Cachorro


        //Criando Objeto na memoria
        //Define a Class cria o nome da variavel de referencia e cria o novo Objeto
        Cachorro cachorro1 = new Cachorro();

        //Puxando varivel da class Cachorro, usando a variavel de referencia
        //Definindo na memoria um OBJETO
        cachorro1.nome = "Puppy";
        cachorro1.cor = "Preto";
        cachorro1.altura = 25.4;
        cachorro1.peso = 10.5;
        cachorro1.tamanhoDoRabo = 5;

        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
    }
}