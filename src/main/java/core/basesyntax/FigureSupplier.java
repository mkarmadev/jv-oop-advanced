package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_VALUE = 10;
    private static final Color COLOR_WHITE = Color.WHITE;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        int radius = random.nextInt(FIGURE_COUNT);
        int sideOne = random.nextInt(FIGURE_COUNT);
        int sideTwo = random.nextInt(FIGURE_COUNT);
        int length = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Square(color, sideOne);
            case 1:
                return new Rectangle(color, sideOne,sideTwo);
            case 2:
                return new RightTriangle(color, sideOne, sideTwo);
            case 3:
                return new Circle(color, radius);
            case 4:
                return new IsoscelesTrapezoid(color, sideOne, sideTwo, length);
            default:
                return new IsoscelesTrapezoid(color, sideOne, sideTwo, length);
        }
    }

    public Figure getDefaultFigure() {
        String color = COLOR_WHITE.name().toLowerCase();
        return new Circle(color, DEFAULT_VALUE);
    }
}
