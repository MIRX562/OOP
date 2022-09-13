class Buah{
    
    double berat,harga,total,diskon;

    double harga_total(){
        total = harga*berat;
        return total;
    }
    double diskon(){
        total = harga*berat;
        if (total>=80000) {
            total=total*0.02;
        }
        return total;
    }
    double akhir(){
        total = harga*berat;
        if (total>=80000) {
            total=total-(total*0.02);
        }
        return total;
    }
    
}