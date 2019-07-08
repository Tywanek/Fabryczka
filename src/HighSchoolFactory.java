public class HighSchoolFactory extends MathFactory {
    @Override
    IShape createShape() {
        return new Triangle();
    }

    @Override
    INumbers createNumber() {
        return new ComplexNumber();
    }
}
