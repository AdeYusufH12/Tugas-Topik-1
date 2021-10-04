package No1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Barang barang1 = new Barang("BRG-001", " Tas Gucci ");
        barang1.setHarga(1200.0);
        System.out.println("Barang 1 : " +barang1.getIdProduk() +barang1.getNama() +barang1.getHarga());

        Barang barang2 = new Barang("BRG-002", " Printer Espon L355 ");
        barang2.setHarga(200.0);
        System.out.println("Barang 2 : " +barang2.getIdProduk() +barang2.getNama() +barang2.getHarga());

        System.out.println();
        Barang barang3 = new Barang("BRG-003", " Koper ", 150.0);
        System.out.println("Barang 3 : " +barang3.getIdProduk() +barang3.getNama() +barang3.getHarga());

        Barang barang4 = new Barang("BRG-003", " Helm ", 20.0);
        System.out.println("Barang 4 : " +barang4.getIdProduk() +barang4.getNama() +barang4.getHarga());

        System.out.println();
        double totalHarga = barang1.getHarga() + barang3.getHarga() + barang4.getHarga();
        System.out.println("Total harga dari BRG-001, BRG-003, dan BRG-004 : "+totalHarga);
    }
}
