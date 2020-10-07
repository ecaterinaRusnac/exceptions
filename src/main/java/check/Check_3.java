package check;

import java.io.IOException;

public class Check_3 {

    public static void main(String[] args) {
        try {
            foo();
        } catch (NoSuchMethodException e) {
//            System.exit(0);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("lllllllll");
        }
    }

    public static void foo() throws IOException, NoSuchMethodException {
        //some code
    }
}