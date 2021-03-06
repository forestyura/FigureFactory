public class Square implements Figure {
    private String name;
    private String color;
    private double area;
    private double perimeter;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;

        area = side * side;
        perimeter = side * 4;
        if (area >= 50) {
            this.color = "red";
        }
        else {
            this.color = "blue";
        }
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSumPerimeterAndArea() {
        return area + perimeter;
    }

    public String show() {
        return "name = " + name +
                ", color = " + color +
                ", area = " + area +
                ", perimeter = " + perimeter;
    }
}
