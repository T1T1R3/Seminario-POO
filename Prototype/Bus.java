public class Bus extends Vehicle{
  boolean cobrador;

  public void setCobrador(boolean cobrador){
    this.cobrador = cobrador;
  }
  
  public Bus(String marca, String nome, int velocidade, boolean cobrador) {
    super(nome, marca, velocidade);
    this.cobrador = cobrador;
  }
  public Bus(Bus bus){
    super(bus);
    this.cobrador = bus.cobrador;
  }

  @Override
    public Bus clone(){
      return new Bus(this);
    }

  @Override
    public String toString(){
      return "Onibus{" + "marca='" + marca + '\'' + ", modelo='" + nome + '\'' + ", velocidade=" + velocidade + ", cobrador=" + cobrador + '}';
    }
}