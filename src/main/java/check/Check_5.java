package check;

import java.io.IOException;

public class Check_5 {

    public void start() throws IOException {
    }

    public void foo() throws NullPointerException{

    }
}

class TestException5 extends Check_5{

    public void start() {
    }

    public void foo() throws RuntimeException{

    }
}
