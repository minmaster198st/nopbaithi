package bai1;

public class MainThread {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        double dienTich = circle.getArea();
        double chuVi = circle.getPerimeter();
        System.out.println("Dien tich = "+ dienTich);
        System.out.println("Chu vi = "+ chuVi);
    }
}


