package Question1;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int side){
        this.height = side;
        this.width = side;
    }

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(String name, String color, int width, int height){
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return (width + height) * 2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public  int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }
}
