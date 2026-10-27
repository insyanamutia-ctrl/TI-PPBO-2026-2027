public class Latihan_3 {
    public static void main(String[] args){
        Waktu w1 = new Waktu(10, 30, 45);
        System.out.println("Waktu Sekarang:" +w1.getJam() + ":" + w1.getMenit() + ":" + w1.getDetik());  //waktu valid

        //waktu di luar rentang
        w1.setJam(24);
        w1.setMenit(60);
        w1.setDetik(65);

System.out.println("Waktu Sekarang: " + w1.getJam() + ":" + w1.getMenit() + ":" + w1.getDetik());

    }
}
