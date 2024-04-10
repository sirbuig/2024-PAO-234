package exceptions.Overrride;

import java.io.FileNotFoundException;

public class ChildClass extends ParentClass {

    @Override
    public void myFirstMethod() throws FileNotFoundException, RuntimeException {
    }
}
