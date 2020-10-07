package myException;

public class App {

    public static void main(String[] args) {

        Intern intern = new Intern("Pele");
        intern.checkAge();
        intern.checkJavaLevel();
        intern.checkEnglishLevel();
        try {
            intern.accept();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Checking: is person adult? - " + intern.isAdult + "\r\n is person Java expert? - "
                    + intern.isJavaExpert + "\r\n does person speak english? " + intern.isEnglishSpeaker);
        }

    }
}
