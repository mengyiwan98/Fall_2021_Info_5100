package Question1;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
