abstract class ShapeAbstract {
    //Metode umum untuk menghitung luas (abstrak)
    abstract double calculateArea();

    //Metode umum untuk menggambar bentuk (kongret)
    void draw() {
        System.out.println("Menggambar domba.");
    }
}

//class kongkret utk Rectangle
class Rectangle extends ShapeAbstract {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Implementasi kalkulasiArea untuk Persegi Panjang
    @Override
    public double calculateArea() {
        return length * width;
    }

    //Metode tambahan khusus untuk Rectangle
    public void displayInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

//class kongret untuk Circle
class Circle extends ShapeAbstract {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //Metode tambahan khusus untuk Circle
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius);
    }
}