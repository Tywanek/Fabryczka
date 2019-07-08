import java.awt.*;

public class MathExam {
   private MathFactory mathFactory;

    public MathExam(MathFactory mathFactory) {
        this.mathFactory = mathFactory;
    }

    public void createTest(){
        IShape shape =  this.mathFactory.createShape();
        INumbers number = this.mathFactory.createNumber();

        System.out.println("Zadanie:");
        shape.info();
        number.info();

    }
}
