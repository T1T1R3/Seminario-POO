public class Car extends Vehicle{
  boolean automatico;

  public void setAutomatico(boolean automatico){
    this.automatico = automatico;
  }
  
  public Car(Car car){
    super(car);
    this.nome = car.nome;
    this.marca = car.marca;
    this.velocidade = car.velocidade;
  }

  public Car(String nome, String marca, int velocidade, boolean automatico){
    super(nome, marca, velocidade);
    this.automatico = automatico;
  }

  @Override
  public Car clone(){
    return new Car(this);
  }

  @Override
  public String toString(){
    return "Carro{" + "nome='" + nome + '\'' + ", marca='" + marca + '\'' + ", velocidade=" + velocidade + ", automatico=" + automatico + '}';
  }
}