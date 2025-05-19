public class Jam {
    
    String brand;
    String seri_jam;

    public void setJam(String Jam, String seri_jam) {
        this.brand = brand;
        this.seri_jam = seri_jam;
    }

    public String getJenisJam(){
        return brand;
    }

    public String getSeriJam(){
        return seri_jam;
    }

    public static void main(String[] args) {
        Jam jam = new Jam();
        jam.setJam("casio","G-shock");
        System.out.println(jam.getJenisJam());
        System.out.println(jam.getSeriJam());
    }

}
