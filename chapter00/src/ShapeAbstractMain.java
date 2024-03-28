public class ShapeAbstractMain {
    public static void main(String[] args) {
        // Membuat objek Rectangle
        Rectangle rectangle = new Rectangle(5, 4);
        // Memanggil metode calculateArea dari objek Rectangle
        double rectangleArea = rectangle.calculateArea();
        // Memanggil metode draw dari objek Rectangle
        rectangle.draw();
        // Menampilkan informasi tambahan dari objek Rectangle
        rectangle.displayInfo();
        // Menampilkan luas dari Rectangle
        System.out.println("Luas Rectangle: " + rectangleArea);

        // Membuat objek Circle
        Circle circle = new Circle(3);
        // Memanggil metode calculateArea dari objek Circle
        double circleArea = circle.calculateArea();
        // Memanggil metode draw dari objek Circle
        circle.draw();
        // Menampilkan informasi tambahan dari objek Circle
        circle.displayInfo();
        // Menampilkan luas dari Circle
        System.out.println("Luas Circle: " + circleArea);
    }
}
