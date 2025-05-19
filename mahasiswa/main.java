class mahasiswa {
    
    String nama;

    mahasiswa (String nama) {
        this.nama = nama;
    }

    void perkenalandiri(){
        System.out.println("halo nama saya :" + this.nama);
    }
}

public class main {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("reza");
        mhs.perkenalandiri();
    }
}
