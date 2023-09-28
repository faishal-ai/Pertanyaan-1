import java.util.Scanner;
public class PemilihanPercobaan109 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input13.nextInt();
        if (angka % 2 == 0)
            System.out.println("Angka " + angka + " bilangan genap");
        else
            System.out.println("Angka " + angka + " bilangan ganjil");
        input13.close();
    }
}

import java.util.Scanner;
public class PemilihanPercobaan109{
    public static void main(String[] args) {

        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        
        int angka = input13.nextInt();
        String result = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + result);
        input13.close();
    }
}
