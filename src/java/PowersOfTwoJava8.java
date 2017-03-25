import java.util.stream.IntStream;

class PowersOfTwoJava8 {

    public static void main(String[] args) {

        IntStream.range(0, 9)
                .map(i -> (int) Math.pow(2, i))
                .forEach(System.out::println);

    }

}
