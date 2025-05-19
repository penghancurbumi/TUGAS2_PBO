class mobil {
    
    String merk;

    mobil(String merk){
        this.merk =merk;

    }

    void tampilakanmerk(){
        System.out.println("merk mobil:"  + this.merk);
    }
}

public class main {
    public static void main(String[] args) {
        mobil m = new mobil("toyota");
        m.tampilakanmerk();
    }
}