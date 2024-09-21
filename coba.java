import javax.print.DocFlavor.STRING;

class Mobil{
    String warna;
    String jenis;
    String made_in;
    String bbm;
    
    void tampilWarna(){
        System.out.println("Warna mobil adalah: " + warna);
    }
    void desc(){
        System.out.println("Warna mobil adalah: " + warna);
        System.out.println("Jenis mobil adalah: " + jenis);
        System.out.println("Asal mobil adalah: " + made_in);
        System.out.println("Bahan Bakar mobil adalah: " + bbm);
        
    }
}

class Main{
    public static void main(String[] args) {
        Mobil Mobil1=new Mobil();
        Mobil1.warna="Hijau";
        Mobil1.jenis="F1";
        Mobil1.made_in="Amerika";
        Mobil1.bbm="Avtur";

        System.out.println();
        System.out.println("Output : ");
        Mobil1.desc();
        System.out.println();
    }
}