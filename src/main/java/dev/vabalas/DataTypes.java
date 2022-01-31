package dev.vabalas;

public class DataTypes {

    public void primitives() {
        char pChar = Character.MAX_VALUE;
        byte pByte = Byte.MAX_VALUE;
        short pShort = Short.MAX_VALUE;
        int pInt = Integer.MAX_VALUE;
        long pLong = Long.MAX_VALUE;
        float pFloat = Float.MAX_VALUE;
        double pDouble = Double.MAX_VALUE;
    }

    public void wrapperClasses() {
        Character wChar = Character.MIN_VALUE;
        Byte wByte = Byte.MIN_VALUE;
        Short wShort = Short.MIN_VALUE;
        Integer wInt = Integer.MIN_VALUE;
        Long wLong = Long.MIN_VALUE;
        Float wFloat = Float.MIN_VALUE;
        Double wDouble = Double.MIN_VALUE;
    }

    public void basicOperations() {
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 / 2);
        System.out.println(10 % 2);
        System.out.println(10 * 2);
    }

    /**
     * when type's value range exceeds, Java promotes it to a type with bigger range
     *        char->int
     * byte->short->int->long->float->double
     */
    public void typePromotions() {}

    public void stringOperations() {
        System.out.println("repeat ".repeat(10));
        System.out.println("".isBlank());
        System.out.println("hello\nworld".lines());
        System.out.println("  strip   ".strip());
    }

    public void stringBuilderOperations() {
        var stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("yay").toString());
    }
}
