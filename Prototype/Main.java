public class Main {
  public static void main(String[] args) {
    VehicleCache a = new VehicleCache();

    Bus b = (Bus) a.get("Onibus");
    b.setCobrador(true);

    Bus copy = b.clone();
    copy.setCobrador(false);

    System.out.println(b);
    System.out.println(copy);
    
  }
}