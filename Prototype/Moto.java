public class Moto extends Vehicle{
  int cilindradas;

  public void setCilindradas(int cilindradas){
    this.cilindradas = cilindradas;
  }

  
  public Moto(String nome, String marca, int velocidade, int cilindradas) {
    super(nome, marca, velocidade);
    this.cilindradas = cilindradas;
  }
  public Moto(Moto moto){
    super(moto);
    this.cilindradas = moto.cilindradas;
  }

  @Override
    public Moto clone(){
      return new Moto(this);
    }

  @Override
    public String toString(){
      return "Moto{" + "nome='" + nome + '\'' + ", marca='" + marca + '\'' + ", velocidade=" + velocidade + ", cilindradas=" + cilindradas + '}';
    }
}