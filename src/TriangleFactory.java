public class TriangleFactory extends ShapeFactory {
    @Override
    public IShape createShape() {
        return new Triangle();
    }
}
