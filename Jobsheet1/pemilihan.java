import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        //input nilai
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = sc.nextDouble();
        System.out.println("==============================");
        
        //validasi nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 || 
        nilaiTugas < 0 || nilaiTugas > 100 ||
        nilaiKuis < 0 || nilaiKuis > 100 ||
        nilaiUTS < 0 || nilaiUTS > 100 ||
        nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        //menghitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

        //menentukan nilai predikat
        String nilaiPredikat;
        if (nilaiAkhir >= 80) {
            nilaiPredikat = "A";
        } else if (nilaiAkhir >= 73){
            nilaiPredikat = "B+";
        } else if (nilaiAkhir >= 65){
            nilaiPredikat = "B";
        } else if (nilaiAkhir >= 60){
            nilaiPredikat = "C+";
        } else if (nilaiAkhir >= 50){
            nilaiPredikat = "C";
        } else if (nilaiAkhir >= 39){
            nilaiPredikat = "D";
        } else {
            nilaiPredikat = "E";
        }

        //menentukan keterangan lulus/tidaklulus
        String keterangan;
        if (nilaiAkhir <= 50) {
            keterangan = "TIDAK LULUS";
        } else {
            keterangan = "LULUS";
        }
        System.out.println("==============================");

        //output hasil
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Predikat: " + nilaiPredikat);
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA " + keterangan);
    }
}
