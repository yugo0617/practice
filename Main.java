class Animal {
    void eat() {
        System.out.println("たべる");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("ワンワン！");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // ← 親クラスのメソッド
        d.bark();  // ← 自分のメソッド
    }
}
