package example;

public interface Shape {
    String DESCRIPTION = "Geometrical shape in 2D";
    double getArea();

    default String getDescription() {
        return getLocalDescription();
    }

    static String getTitle() {
        return getLocalStaticDescription();
    }

    private String getLocalDescription(){
        return DESCRIPTION;
    }

    private static String getLocalStaticDescription(){
        return "Geometrical shape";
    }
}
