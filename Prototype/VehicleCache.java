import java.util.Map;
import java.util.HashMap;

public class VehicleCache {
  private Map<String, Vehicle> cache = new HashMap<>();

  public VehicleCache(){
    Car car= new Car("Bugatti", "Veyron", 420, true);

    Bus bus = new Bus("Mercedes", "O500", 150, true);

    Moto moto = new Moto("Honda", "CB300", 170, 300);

    cache.put("Carro", car);
    cache.put("Onibus", bus);
    cache.put("Moto", moto);
  }

  public Vehicle get(String key){
    return cache.get(key).clone();
  }
}