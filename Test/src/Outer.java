public class Outer {
    private static int outerStaticNumber = 7;
    public int outerNumber = 10;

    int getNestedStaticNumber() {
        return Nested.nestedStaticNumber;
    }

    static class Nested {
        private static int nestedStaticNumber = 3;
        public int nestedNumber = 1;


        int getStaticOuterNumber() {
            return outerStaticNumber;
        }
    }

    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        System.out.println(nested.getStaticOuterNumber());
        Outer outer = new Outer();
        System.out.println(outer.getNestedStaticNumber());
    }
}
