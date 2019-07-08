public class SquareFactory extends ShapeFactory {
    @Override
    public IShape createShape() {
        return new Square();
    }
}
