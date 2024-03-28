class Unggas {
    public String warna;

    public void suara(){
        System.out.println("Berkicau");
    }

    public void berjalan(){
        System.out.println("Berjalan");
    }
}

class bisaTerbang extends Unggas {
    public void terbang(){
        System.out.println("Terbang Jauh di Awan");
    }
}

class tidakBisaTerbang extends Unggas {
    public void terbang() {
        System.out.println("Burung ini tidak bisa terbang.");
    }
}