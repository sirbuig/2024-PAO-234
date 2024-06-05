package ex1;

public class Main {
    public static void main(String[] args) {
            System.out.println(new C("D").sir);
        }

}

class A {
    String sir = "";
    public A(String sir) { this.sir = this.sir + sir + "A"; }
}
class B extends A {
    public B(String sir) { super(sir); this.sir = this.sir + sir + "B"; }
}
class C extends B {
    public C(String sir) { super(sir); this.sir = this.sir + sir + "C"; }
}
