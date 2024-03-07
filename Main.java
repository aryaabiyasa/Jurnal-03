import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        
        Scanner input1 = new Scanner(System.in);
        String yesOrNo;

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Tambah Buku");
            System.out.println("Hapus Buku");
            System.out.println("Cetak Daftar Buku");
            System.out.println("Keluar");

            int pilihan = input1.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Judul Buku: ");
                String judul = input1.next();
                System.out.print("Masukkan Penulis: ");
                String penulis = input1.next();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahun = input1.nextInt();

                System.out.println("Tambahan data di awal list? (y/n)");
                yesOrNo = input1.next();

                if (yesOrNo.equals("y")) {
                    list1.tambahDepan(new Buku(judul, penulis, tahun));
                } else {
                    list1.tambahBelakang(new Buku(judul, penulis, tahun));
                }
                break;
            case 2:
                System.out.println("Hapus data di awal list? (y/n)");
                yesOrNo = input1.next();

                if (yesOrNo.equals("y")) {
                    list1.hapusDepan();
                    System.out.println("Data buku di awal list berhasil dihapus");
                } else {
                    list1.hapusBelakang();
                    System.out.println("Data buku di akhir list berhasil dihapus");
                }
                break;
            case 3:
                System.out.println("List buku adalah:");
                list1.print();
                break;
            case 4:
                keepRunning = false;
            }
        }
    }
}