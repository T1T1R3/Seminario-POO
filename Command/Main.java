public class Main {
  public static void main(String[] args) {
    Luz luzDaSala = new Luz("Sala");
    Luz luzDaCozinha = new Luz("Cozinha");
    Luz luzDoQuarto = new Luz("Quarto");

    Invoker invoker = new Invoker();

    invoker.executarComando(new ligarLuz(luzDaSala));
    invoker.executarComando(new ligarLuz(luzDaCozinha));
    invoker.executarComando(new ligarLuz(luzDoQuarto));
    
    System.out.println();
    
    invoker.desfazerComando();
    invoker.desfazerComando();
    invoker.desfazerComando();
  }
}