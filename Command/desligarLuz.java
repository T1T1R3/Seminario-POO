public class desligarLuz implements Command{
  Luz luz;

  public desligarLuz(Luz luz){
    this.luz = luz;
  }

  @Override
  public void execute(){
    luz.desligar();
  }
  @Override
    public void desfazer() {
        luz.ligar();
    }
}