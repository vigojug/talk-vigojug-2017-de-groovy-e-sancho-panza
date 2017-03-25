import java.util.ArrayList;
import java.util.List;

class PowersOfTwoJava7 {

    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
           list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println((int) Math.pow(2, i));
        }
    }

}
