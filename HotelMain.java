package LATIHAN;


public class HotelMain {
     public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel m1 = new Hotel("RedDors", "Malang", 25000, (byte)5);
        Hotel m5 = new Hotel("WhiteDors", "Batu", 26000, (byte)3);
        Hotel m2 = new Hotel("BlakDors", "Surabaya", 19000, (byte)4);
        Hotel m3 = new Hotel("BlueDors", "Kediri", 20000, (byte)1);
        Hotel m4 = new Hotel("GreyDors", "Malang", 22000, (byte)2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel = ");
        list.tampilAll();

        System.out.println("Data hotel dengan filter harga termurah = ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel dengan filter bintang tertinggi");
        list.selectionSort();
        list. tampilAll();

    }
}