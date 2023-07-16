package activity_2;

public class Circle implements IShape{
    public Circle(float radio) {
        this.radio = radio;
    }

    float radio;
    @Override
    public float calculateArea() {
        return (float) (3.1416 * radio * radio);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * 3.1416*radio);
    }
}
