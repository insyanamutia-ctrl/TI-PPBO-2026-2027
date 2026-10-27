 public class latihanClass {
        public static void main (String[] args){

            mahasiswa m1 = new mahasiswa ( "Budi" , "111" , 3.5 );
            System . out . println ( "Nama: " + m1. getNama ());
            System . out . println ( "IPK: " + m1. getIpk ());


            m1. setIpk ( 3.8 ); // valid
            System . out . println ( "IPK sekarang: " + m1. getIpk ());

            m1. setIpk ( 9.9 ); // tidak valid, akan ditolak
            System . out . println ( "IPK sekarang: " + m1. getIpk ());
        }
    }

