
abstract class Shape {
    int l, b, h, ba;
    abstract int area();
}
class rectangle extends Shape {
    rectangle(int x, int y) {
        l = x;
        b = y;
    }
    int area() {
        return l * b;
    }
}
class triangle extends Shape {
    triangle(int a, int b) {
        ba = a;
        h = b;
    }
    int area() {
        return (ba * h) / 2;
    }
}
public class GFG {
    public static void main(String[] args) {
        Shape s1;
        rectangle r = new rectangle(10, 20);
        triangle t = new triangle(20, 40);
        int z;
        s1 = r;
        z = s1.area();
        System.out.println("Area of rectangle:" + z);
        s1 = t;
        z = s1.area();
        System.out.println("Area of triangle:" + z);
    }
}
