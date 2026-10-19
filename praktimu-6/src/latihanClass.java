 public class latihanClass {
        public static void main (String[] args){
            mahasiswa m1= new mahasiswa(); //ini membuat object
            m1.nama = "Budi";
            m1.nim= "123456";
            m1.ipk= 3.76;


            mahasiswa m2= new mahasiswa();
            m2.nama ="Siti";
            m2.nim = "23456";
            m2.ipk = 3.70;

            System.out.println(m1.nama +"-" + m1.ipk);
            System.out.println(m2.nama + "-"+ m2.ipk);
        }
    }

