public class Luz{
  String local;

  public Luz(String local){
    this.local = local;
  }

  public void ligar(){
    System.out.println("Luz do(a) " + local + " ligada");
  }

  public void desligar(){
    System.out.println("Luz do(a) " + local + " desligada");
  }
}