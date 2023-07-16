package activity_2;

public class ScaleneTriangle extends Triangle implements IShape{
    @Override
    public float calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }
}
