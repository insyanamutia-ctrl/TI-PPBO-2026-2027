public class DaftarMahasiswa {
public static void main(String[] args){
    mahasiswa[] daftar = new mahasiswa[3];

    daftar[0] = new mahasiswa("Budi", "111",3.2);
    daftar[1] = new mahasiswa("siti", "121",3.6);
    daftar[2] = new mahasiswa("Andi", "333",3.8);
for (mahasiswa m : daftar){
    //m.tampilkamData();
    System.out.println("__");
}
int jumlahCumlaude = 0;
for (mahasiswa m : daftar){
    //if(m.isCumlaude()){
        jumlahCumlaude ++;
    }
}
//System.out.println("Jumlah mahasiswa cumlaude: " + jumlahCumlaude);
}
//}
