public class Triangle {
    private String name;
    private String color;
    private double area;
    private double perimeter;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC =sideC;

        area = (sideA + sideB + sideC) / 2;
        perimeter = sideA + sideB + sideC;

        if (area >= 50) {
            this.color = "red";
        }
        else {
            this.color = "blue";
        }
    }

    public String show() {
        return "name = " + name +
                ", color = " + color +
                ", area = " + area +
                ", perimeter = " + perimeter;
    }
}
