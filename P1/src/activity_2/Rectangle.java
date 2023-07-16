package activity_2;

public class Rectangle implements IShape {
    float base, height;

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return base * height;
    }

    @Override
    public float calculatePerimeter() {
        return (2* base)+ (2* height);
    }
}
