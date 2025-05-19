class jam {
    
    String brand;

    jam(String jam) {
        this.jam = jam;
    }

    void tampilkanbrand(){
        System.out.println("brand jam tangan:" + this.jam);
    }
}

public class main {
    public static void main(String[] args) {
        jam j = new jam("casio");
        j.tampilkanbrand();
    }
}
