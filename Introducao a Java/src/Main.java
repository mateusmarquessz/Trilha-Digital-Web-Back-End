import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a-b;
        int multiplicacao = a*b;
        double divisao = a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
 -------------------------------------------------

 True ou false
        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //Tabela verdade
        //Operador && (AND)
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //Operador || (OR)
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false


        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "E fim de semana" : "Nao e fim de semana";
        System.out.println(mensagem);

--------------------------------------------------
Se e senao
        int nota = 70;

        if(nota >= 70){
            System.out.println("Aprovado");
        } else {
            System.out.println("Nao aprovado");
        }
--------------------------------------------------

Strings e horarios
        String nome = "Mateus";
        System.out.println(nome.toUpperCase()); // Deixa maisculo
        System.out.println(nome.toLowerCase()); //Deixa minusculo
        System.out.println(nome.length()); //Tamanho do Texto

        String nomeOutro = "Mateus";
        System.out.println(nome.equals(nomeOutro)); //Retorna true ou false,

        //ISO 8601 como apresentar uma data
        LocalDate hoje = LocalDate.now(); // pegar a data de hoje
        Locale brasil = new Locale("pt","BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil)); // Demonstra o dia da semana
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now(); //Pega o Horario do Computador
        if(agora.getHour() >= 0 && agora.getHour() < 12){ //comparacao para responder o bom dia/ tarde/ noite
            saudacao = "Bom dia";
        } else if(agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else{
            saudacao = "Ola";
        }

        System.out.printf("Ola, %s. Hoje e %s, %s.%n", nome, diaSemana, saudacao.toLowerCase());
---------------------------------
        Repeticao
        int i;
        for (i = 0; i< 10; i++){
            for (int j  = 0; j< 10; j++){
                System.out.println(j + "x" + i + "=" + j*i);
            }
        }
-------------------------------
        //Vetores
        int[] vet =  {9, 10, 12,25,2};
        int maior = vet[0];
        int menor = vet[0];
        int media = 0;
        for (int i = 0; i< vet.length; i++){ //length indica o tamanho do array
            if (vet[i] > maior){
                maior = vet[i];
            }
            if (vet[i] < menor){
                menor = vet[i];
            }
            media += vet[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media / vet.length);
        */

    }
}