public interface Kendaraan {
    void berjalan();

    void berhenti();

    class sepeda implements Kendaraan{

        @Override
        public void berjalan() {
            System.out.println("sepeda berjalan dgn dikayuh ");
        }

        @Override
        public void berhenti() {
            System.out.println("sepeda berhenti ");

        }
    }
    class sepedamotor implements Kendaraan{

        @Override
        public void berjalan() {
            System.out.println("motor berjalan ada mesin ");
        }

        @Override
        public void berhenti() {
            System.out.println("motor berhenti tidak ada bensin");

        }
    }
}
