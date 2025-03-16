package University.Entity;

public enum FieldOfStudy {
    INFORMATICS,
    PROGRAMMING,
    MECHANICS,
    STATISTICS,
    PHYSICS,
    MATHEMATICS,
    ECONOMICS,
    ENGINEERING;

    public static void printChoseField() {
        System.out.println(
                "1 - Informatics" + "\n" +
                "2 - Programming" + "\n" +
                "3 - Mechanics" + "\n" +
                "4 - Statistics" + "\n"
        );
    }

}
