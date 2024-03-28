public class Main {
    public static void main(String[] args) {
        // Membuat objek sepeda
        Kendaraan sepeda = new Kendaraan.sepeda();
        sepeda.berjalan();
        sepeda.berhenti();

        // Membuat objek sepeda motor
        Kendaraan sepedamotor = new Kendaraan.sepedamotor();
        sepedamotor.berjalan();
        sepedamotor.berhenti();

    }
}