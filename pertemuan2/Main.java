class Main {
    public static void main(String args[]){
        Buah apel = new Buah();    
        Buah mangga = new Buah();
        mangga.harga=10000;
        mangga.berat=10;
        apel.harga=8000;
        apel.berat=10;
        System.out.println("mangga => "+mangga.harga_total()+" - "+mangga.diskon()+" = " +mangga.akhir());
        System.out.println("apel => "+apel.harga_total()+" - "+mangga.diskon()+" = "+mangga.akhir());
    }    
}
