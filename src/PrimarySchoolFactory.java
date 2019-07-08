public class PrimarySchoolFactory extends MathFactory {
    @Override
    IShape createShape() {
        return new Square();
    }

    @Override
    INumbers createNumber() {
        return new RealNumbers();
    }
}
