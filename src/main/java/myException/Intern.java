package myException;

public class Intern {

    private String firstName;
    boolean isAdult;
    boolean isJavaExpert;
    boolean isEnglishSpeaker;

    Intern(String firstName) {
        this.firstName = firstName;
    }

    void checkAge() {

        System.out.println("Intern is adult person!");
        this.isAdult = true;
    }

    void checkJavaLevel() {

        System.out.println("Intern knows Java!");
        this.isJavaExpert = true;
    }

    public void checkEnglishLevel() {
        System.out.println("Intern knows English!");
        this.isEnglishSpeaker = true;
    }

    void accept() throws MyException {

        System.out.println("Person is under review......");
        System.out.println("............................");
        if (isAdult && isJavaExpert && isEnglishSpeaker) {
            System.out.println("Woo hoo, this person - " + firstName + " is accepted!");
        } else {
            throw new MyException("Ohh no, this person -  " + firstName + " is not accepted!");
        }
    }

}
