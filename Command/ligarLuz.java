public class ligarLuz implements Command{
  Luz luz;

  public ligarLuz(Luz luz){
    this.luz = luz;
  }

  @Override
  public void execute(){
    luz.ligar();
  }

  @Override
  public void desfazer(){
    luz.desligar();
  }
}

