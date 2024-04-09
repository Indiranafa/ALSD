package Jobsheet4.BruteForceDivideConquer;
import java.util.ArrayList;
import java.util.List;

public class MainShowroom {
    public static void main(String[] args) {
        // Membuat daftar mobil
        List<Mobil> mobilList = new ArrayList<>();
        mobilList.add(new Mobil("BMW", "M2 Coupe", 2016, 6816, 728));
        mobilList.add(new Mobil("Ford", "Fiesta ST", 2014, 3921, 575));
        mobilList.add(new Mobil("Nissan", "370Z", 2009, 4360, 657));
        mobilList.add(new Mobil("Subaru", "BRZ", 2014, 4058, 609));
        mobilList.add(new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703));
        mobilList.add(new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553));
        mobilList.add(new Mobil("Toyota", "86/GT86", 2014, 4180, 609));
        mobilList.add(new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631));

        // Menemukan top_acceleration tertinggi
        int maxAcceleration = Showroom.findMaxAcceleration(mobilList, 0, mobilList.size() - 1);
        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);

        // Menemukan top_acceleration terendah
        int minAcceleration = Showroom.findMinAcceleration(mobilList, 0, mobilList.size() - 1);
        System.out.println("Top Acceleration Terendah: " + minAcceleration);

        // Menghitung rata-rata top_power
        double averagePower = Showroom.calculateAveragePower(mobilList);
        System.out.println("Rata-rata Top Power: " + averagePower);
    }
}
