import java.util.*;
public class Historia{
  
  public static void modoHistoria(){

Scanner input = new Scanner(System.in);
       
      String nomeJogador = "";
      String nomeEntrada = "";
      int timeNum = 0, vida = 0;

      boolean resultado = false;
      String time = "";
      String frase = "";

      do {
  /**/      //inicializacao
 Funcoes.voltarConsole();
        Funcoes.exibir("BEM VINDO AO MODO HISTORIA\nA IMAGINAÇÃO É O COMEÇO DE TUDO...",true);
        Funcoes.pularLinha();
        Funcoes.exibir("DIGITE SE NOME: ",false);
         nomeEntrada = input.nextLine();
         nomeJogador = Funcoes.funcaoNome(nomeEntrada);
        vida = 3;
        Funcoes.voltarConsole();

        //fase01
        Funcoes.vida(vida);
         frase = nomeJogador+", você se destacou nas categorias de base e agora está sendo convidado a jogar no Ituano, onde irá disputar o campeonato paulista!\nVocê se destacou nos momentos que entrou em campo e terá uma oportunidade na equipe principal!\n\nItuano X Ponte Preta\n 39 min do segundo tempo, Penalti para o Ituano\n"+nomeJogador+" é o encarregado da cobrança";

         Funcoes.fraseCaracterPorVez(frase);

         Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);

          Funcoes.limpaTela2();

         if (resultado == false) {
            vida--;
         }

        //fase02
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = "O Ituano chegou a Semi Final do Campeonato Paulista!\nE terá que enfrentar o Palmeiras para seguir em frente!\n44 min do segundo tempo, o jogo segue empatado em 0 X 0, Cladio Leite sofre falta e é marcado pênalti para o Ituano\n"+nomeJogador+" é o encarregado da cobrança";

          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);
          Funcoes.limpaTela2();

         if (resultado == false) {
            vida--;
         }

        //fase03
          Funcoes.vida(vida);
         Funcoes.pularLinha();
        
         frase = "Ituano se classifica e chega a final contra o Corinthians\nO jogo acaba em 1 X 1 no tempo regulamentar e vai para a disputa de pênaltis\n\n"+nomeJogador+" é encarregado de abrir as cobranças!";

      
          Funcoes.pularLinha();
          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);
          Funcoes.limpaTela2();

         if (resultado == false) {
            vida--;
         }

        //fase04
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = nomeJogador+" se destaca no campeonato paulista e recebe propostas de times grandes que disputarão o campeonato Brasileiro\n";

          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.exibir("Escolha seu proximo time!", true);
          Funcoes.pularLinha();
          Funcoes.exibir("[1] Palmeiras\n[2] Santos\n[3] Fortaleza\n[4] Corinthians\n[5] São Paulo\n[6] Coritiba", true);
         Funcoes. pularLinha();
          Funcoes.exibir("Opcção: ", false);
         timeNum = input.nextInt();
          time =  Funcoes.times(timeNum);

         Funcoes.limpaTela2();
          Funcoes.pularLinha();

        //fase05
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = "Jogo importantíssimo valendo a permanência no G4\n\n" + time + " X Atlético Mineiro\nAos 23 min do segundo tempo "+nomeJogador+" sofre falta no contra ataque e é marcada penalidade máxima\n"+nomeJogador+" é o encarregado da cobrança";

  
         Funcoes.pularLinha();
          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);

          Funcoes.limpaTela2();

         if (resultado == false) {
            vida--;
         }

         if (vida == 0) {
            Funcoes.limpaTela2();
           Funcoes.fim(true);
            break;
         }

        //fase06
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = "Apesar de "+nomeJogador+" fazer boa campanha no Campeonato Brasileiro, onde marcou 22 gols em 34 partidas, o " + time + " não se consagrou campeão\nMesmo sem a conquista do Brasileiro o time se classifica para a Libertadores\n\nEm um jogo importante da fase final de grupos o atacante de " + time + " sofre falta dentro da área e "+nomeJogador+" vai para a batida";

          Funcoes.pularLinha();
          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);
          Funcoes.limpaTela2();

         if (resultado == false) {
            vida--;
         }
         if (vida == 0) {
             Funcoes.fim(true);
            break;

         }
        //fase07
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = "O " + time + " chega as quartas de finais, onde enfrenta o Racing, time tradicional da Argentina, o primeiro jogo disputado em São paulo terminou em 0x0.\n\n"+time+ " x Racing\n 39 min do segundo tempo, 0x0 o lateral do "+time+" avança pela direita, lança para Sebastian que é derrubado na aréa, está marcado penaltiii!\n"+nomeJogador+" na cobrança";

          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);

          Funcoes.limpaTela2();
         if (resultado == false) {
            vida--;
         }

         if (vida == 0) {
           
            Funcoes.fim(true);
            break;

         }

        //fase08
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = "O " + time + " consegue boas e convincentes vitórias durante a Libertadores e chega a final como favorito para o título, "+nomeJogador+" é o craque da equipe com 7 gols na competição!\n\nFinal da Libertadores, jogo em La Bombonera lotada contra o Boca Juniors\n"+nomeJogador+" sofre entrada forte e é marcado pênalti!!!\n"+nomeJogador+" é o encarregado da cobrança!";

          Funcoes.pularLinha();
          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);

          Funcoes.limpaTela2();
         if (resultado == false) {
            vida--;
         }
         if (vida == 0) {
           
            Funcoes.fim(true);
            break;

         } 

        //fase09
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = "Com otimas atuaçoes "+nomeJogador+" acaba chamando atenção da Seleção Brasileira e é convocado pela primeira vez\n\nApós alguns jogos, se torna titula da seleção e ajuda o time a chegar a final da Copa America\n\nBrasil X Uruguai\n28 min do segundo tempo Brasil 2x0 Uruguai, penalti para o Brasil\n"+nomeJogador+" na cobrança";

         Funcoes.fraseCaracterPorVez(frase);
         Funcoes.pularLinha();
         resultado =  Funcoes.penalti(3);

          Funcoes.limpaTela2();
         if (resultado == false) {
            vida--;
         }

         if (vida == 0) {
           
            Funcoes.fim(true);
            break;

         }

        //fase10
          Funcoes.vida(vida);
         Funcoes.pularLinha();

         frase = nomeJogador+" conquista a Copa America com o Brasil faz grandes exibições e é convocado para a Copa do Mundo\nBrasil faz grande campanha e chega  na final da competição contra a Argentina!\n\nBrasil 2x2 Argentina\n\nAos 120 min da prorrogação Neymar deixa dois marcadores para trás, mas ao tentar passa pelo terceiro sofre penalti e se machuca, deixando a responsabilidade nós pés de "+nomeJogador+"\nÉ HORA DA DECISÃO";

          Funcoes.fraseCaracterPorVez(frase);
          Funcoes.pularLinha();
         resultado =  Funcoes.penalti(1);
          Funcoes.limpaTela2();


        if (resultado == false) {
             Funcoes.fim(false);
         break;
         }  
        
       if(vida > 0){
         Funcoes.fim(false);
         break;
       }else{
         Funcoes.fim(true);
         break;
       }
       
      } while (vida > 0);
     
  Funcoes.limpaTela2();
     }
}