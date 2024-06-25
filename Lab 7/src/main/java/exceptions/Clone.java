package exceptions;

public class Clone {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //clone the object
        return super.clone();
    }
}

class MyCloneClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class testClone {

    public static void main(String[] args) {
        Clone clone = new Clone();

        try {
            clone.clone();  // => will throw CloneNotSupportedException
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported:" + e);
        }

        MyCloneClass myCloneClass = new MyCloneClass();
        try {
            myCloneClass.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Never gets here");
        }
    }
}
