import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama, kelamin, tanggalLahir;
        int umur, bulan;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("### Program Menghitung Umur ###");
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        kelamin = keyboard.nextLine();
        System.out.print("Tanggal lahir (yyyy-mm-dd) : ");
        tanggalLahir = keyboard.nextLine();
        LocalDate then = LocalDate.parse(tanggalLahir);

        LocalDate now = LocalDate.now();
        umur = Period.between(then, now).getYears();
        bulan = Period.between(then, now).getMonths();


        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        if(kelamin.equalsIgnoreCase("P")){
            System.out.println("Perempuan");
        } else if(kelamin.equalsIgnoreCase("L")){
            System.out.println("Laki-laki");
        }
        System.out.println("Umur : " + umur + " tahun " + bulan + " bulan");


    }

}