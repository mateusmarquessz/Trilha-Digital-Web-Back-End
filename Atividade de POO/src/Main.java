
//Classe = A classe define como serao as coisas, como a casa vai ser! Definicao
//Objeto = E a casa e as caracteriscas do cachorro

import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        //Variavel de referencia, funciona como referencia do objeto da class Cachorro


        //Criando Objeto na memoria
        //Define a Class e cria o nome da variavel de referencia e cria o novo Objeto
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5 , 5, "Nada");
        //Puxando varivel da class Cachorro, usando a variavel de referencia
        //Definindo na memoria um OBJETO


        cachorro1.setNome("Puppy");
        cachorro1.setCor("Preto");
        cachorro1.setAltura(25.4);
        cachorro1.setPeso(10.5);
        cachorro1.setTamanhoDoRabo(5);


        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
    }
}