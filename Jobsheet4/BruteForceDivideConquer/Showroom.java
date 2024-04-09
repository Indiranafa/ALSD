package Jobsheet4.BruteForceDivideConquer;
import java.util.ArrayList;
import java.util.List;

public class Showroom {
    // Metode untuk menemukan top_acceleration tertinggi menggunakan Divide and Conquer
    public static int findMaxAcceleration(List<Mobil> mobilList, int low, int high) {
        if (low == high) {
            return mobilList.get(low).top_acceleration;
        }

        int mid = (low + high) / 2;

        int leftMax = findMaxAcceleration(mobilList, low, mid);
        int rightMax = findMaxAcceleration(mobilList, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    // Metode untuk menemukan top_acceleration terendah menggunakan Divide and Conquer
    public static int findMinAcceleration(List<Mobil> mobilList, int low, int high) {
        if (low == high) {
            return mobilList.get(low).top_acceleration;
        }

        int mid = (low + high) / 2;

        int leftMin = findMinAcceleration(mobilList, low, mid);
        int rightMin = findMinAcceleration(mobilList, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    // Metode untuk menghitung rata-rata top_power dari seluruh mobil menggunakan Brute Force
    public static double calculateAveragePower(List<Mobil> mobilList) {
        int totalPower = 0;
        for (Mobil mobil : mobilList) {
            totalPower += mobil.top_power;
        }
        return (double) totalPower / mobilList.size();
    }
}
