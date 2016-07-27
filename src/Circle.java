public class Circle implements Figure {
    private String name;
    private String color;
    private double area;
    private double perimeter;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;

        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;

        if (area >= 50) {
            this.color = "red";
        } else {
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
