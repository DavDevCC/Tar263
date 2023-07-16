package activity_2;

public class EquilateralTriangle extends Triangle implements IShape{
    @Override
    public float calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public float calculatePerimeter() {
        return base * 3;
    }
}
