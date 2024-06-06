package Jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class ListMahasiswa14 {
    List<Mahasiswa14> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa14... mahasiswaArray){
        mahasiswas.addAll(Arrays.asList(mahasiswaArray));
    }

    public void hapus(int index){
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa14 mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    public void sortAscending(){
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }
    
    public void sortDescending(){
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }    

    // public int linearSearch(String nim){
    //     for (int i = 0; i < mahasiswas.size(); i++){
    //         if (nim.equals(mahasiswas.get(i).nim)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public int binarySearch(String nim){
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
        Mahasiswa14 key = new Mahasiswa14(nim, null, null);
        int index = Collections.binarySearch(mahasiswas, key, (m1, m2) -> m1.nim.compareTo(m2.nim));
        return index >= 0 ? index : -1;
    }    

    public static void main(String[] args) {
        ListMahasiswa14 lm = new ListMahasiswa14();
        Mahasiswa14 m = new Mahasiswa14("201234", "Noureen", "021xx1");
        Mahasiswa14 m1 = new Mahasiswa14("201235", "Akhleema", "021xx2");
        Mahasiswa14 m2 = new Mahasiswa14("201236", "Noureen", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa14("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        // sort ascending
        lm.sortAscending();
        System.out.println("Sorted Ascending:");
        lm.tampil();
        // sort descending
        lm.sortDescending();
        System.out.println("Sorted Descending:");
        lm.tampil();
    }
}
