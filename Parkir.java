public class Parkir {

  public static void main(String[] args) {
    String kendaraan = "motor";
    int jam = 2;
    if (kendaraan == "motor") {
      int total = jam * 3000;
      System.out.println(total);
    } else if (kendaraan == "mobil") {
      int total = jam * 5000;
      System.out.print(total);
    }
  }
}