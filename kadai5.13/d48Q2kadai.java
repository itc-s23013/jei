//classをアニマル,ドッグ、キャットで分けてメインで出力
class Animal {
    public void makeSound() {
        System.out.println("どうぶつの森");
    }

    public void test() {
        System.out.println("テスト出力");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("わんわん");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ニャー");
    }
}

public class d48Q2kadai {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
	a.test();
        Animal c = new Cat();
        c.makeSound();
    }
}

