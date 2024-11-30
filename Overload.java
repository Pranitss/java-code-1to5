class Overload {

    String s1, s2;
    int i, i1;

    void show() {
        for (int j = 0; j < 2; j++) {
            System.out.println("Delhi is an important city");
        }
        
    }

    void show(String s) {
        s1 = s;
        for (i = 0; i <= 2; i++)
        {
            System.out.println(s1);
        }
    }

    void show(String s, int i) {
        s2 = s;
        i1 = 0;
        while (i1 < i) {
            System.out.println(s2);
            i1++;
        }
    }
}

class GFG {

    public static void main(String[] args) {
        Overload obj1 = new Overload();
        obj1.show();
        System.out.println("\n");
        obj1.show("Bombay is a beautiful city");

        System.out.println("\n");
        obj1.show("Chennai is a peaceful city", 4);
    }
}
