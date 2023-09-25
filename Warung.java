import java.util.Scanner;

class Warung {
  public static void main(String[] argumen) {

    boolean programBerjalan = true;

    int totalBarang1 = 0;
    int totalBarang2 = 0;
    int totalBarang3 = 0;
    int totalBarang4 = 0;
    int totalKeuntungan = 0;

    Scanner inputPengguna = new Scanner(System.in);
    int nomorBarangDibeli;
    int kuantitasBarangDibeli;
    String kataPembuka;


    while(programBerjalan) {
      kataPembuka = "========================================================";
      kataPembuka += "\nSelamat datang di Warung dowi, beli apa ?";
      kataPembuka += "\n1. Bakso bakar ($ 2) - " + totalBarang1 + " barang terjual";
      kataPembuka += "\n2. Sosis bakar ($ 2) - " + totalBarang2 + " barang terjual";
      kataPembuka += "\n3. Otak-otak bakar ($ 2) - " + totalBarang3 + " barang terjual";
      kataPembuka += "\n4. Nugget bakar ($ 2) - " + totalBarang4 + " barang terjual";
      kataPembuka += "\n9. Program ini tidak bermanfaat, saya memilih untuk keluar";
      kataPembuka += "\n\nTotal keuntungan Warung saat ini $ " + totalKeuntungan + " alhamdulillah";
      kataPembuka += "\n========================================================";
      kataPembuka += "\n\nPilih nomor barang (1 / 2 / 3 / 4):";

      System.out.println(kataPembuka);
      nomorBarangDibeli = inputPengguna.nextInt();

      if (nomorBarangDibeli == 1 || nomorBarangDibeli == 2 || nomorBarangDibeli == 3 || nomorBarangDibeli == 4) {

        System.out.println("Barang nomor " + nomorBarangDibeli + " dipilih\nMau berapa ?");
        kuantitasBarangDibeli = inputPengguna.nextInt();

        System.out.println("Barang nomor " + nomorBarangDibeli + " dibeli sejumlah " + kuantitasBarangDibeli + " buah");

        switch(nomorBarangDibeli) {
          case 1:
            totalBarang1 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 30);
            break;
          case 2:
            totalBarang2 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 20);
            break;
          case 3:
            totalBarang3 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 35);
            break;
          case 4:
            totalBarang4 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 12);
            break;
        }

      } else if (nomorBarangDibeli == 9) {
        programBerjalan = false; 
        System.out.println("Waduuuuhhhh, kamu melewatkan barang berharga");
      } else {
        System.out.println("Apa yang kamu tunjuk tidak layak untuk dibeli");
      }
    }
  }
}
        