class Area {
    int length, width;
    Area(int x, int y) {
        length = x;
        width = y;
    }

    void calculate() {
        int ar = length * width;
        System.out.println("Area is: "+ ar);
    }
}

class Volume extends Area {
    int height;
    Volume(int x, int y, int z) {
        super(x,y);
        height = z;
    }

    void calculate() {
        int vol = length * width * height;
        System.out.println("Volume is: "+ vol);

        super.calculate();
    } 
}

public class Exp05_1 {
    public static void main(String[] args) {
        Area a = new Area(10, 20);
        a.calculate();
    
        Volume v = new Volume(2, 3, 4);
        v.calculate();

    }
}
