package Jobsheet5;
import java.util.ArrayList;
import java.util.List;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("______________________________");
        }
    }

    //method bubbleSort
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //dibawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    //method selectionSort Ascending
    void selectionSort(){
        for(int i = 0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    //method insertionSort Descending
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa key = listMhs[i];
            int j = i - 1;
            
            // Memindahkan elemen yang lebih besar dari key ke posisi yang lebih belakang
            while (j >= 0 && listMhs[j].ipk < key.ipk) {
                listMhs[j + 1] = listMhs[j];
                j = j - 1;
            }
            listMhs[j + 1] = key;
        }
    }
    
}
