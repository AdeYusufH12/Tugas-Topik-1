package No2;

public class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    public Buku(String judul, String pengarang, Double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setHarga(Double harga){
        this.harga = harga;
    }

    public String getJudul(){
        return judul;
    }

    public String getPengarang(){
        return pengarang;
    }

    public Double getHarga(){
        return harga;
    }
}
