public class Vehicle implements Prototype{
  String nome;
  String marca;
  int velocidade;

  public void setNome(String nome){
    this.nome = nome;
  }
  public void setMarca(String marca){
    this.marca = marca;
  }
  public void setVelocidade(int velocidade){
    this.velocidade = velocidade;
  }

  Vehicle(Vehicle vehicle){
    this.nome = vehicle.nome;
    this.marca = vehicle.marca;
    this.velocidade = vehicle.velocidade;
  }

  public Vehicle(String nome, String marca, int velocidade){
    this.nome = nome;
    this.marca = marca;
    this.velocidade = velocidade;
  }

  @Override
  public Vehicle clone(){
    return new Vehicle(this);
  }
}