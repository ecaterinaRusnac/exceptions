package check;

        import java.io.FileNotFoundException;
        import java.io.IOException;

public class Check_1 {

    public static void main(String[] args) {
        try {
            testExceptions();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testExceptions() throws IOException{
        //bla bla bla
    }
}
