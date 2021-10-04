package No2;

public class Main {
    public static void main(String[] args){
        // write your code here
        Buku buku1 = new Buku("Harry Potter", "J.K.Rowling", 300000.0);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000.0);

        System.out.println(buku1.getJudul()+" "+ buku1.getPengarang()+" "+ buku1.getHarga());
        System.out.println(buku2.getJudul()+" "+ buku2.getPengarang()+" "+ buku2.getHarga());

    }
}
