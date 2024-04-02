public class Cat extends Animal {   // Cat is-a Animal
    String breed;
    String color;

    void eat() {
        System.out.println(this.getName() + " 먹이를 먹다.");
    }

    void scratch() {
        System.out.println(this.getName() + " 발톱으로 할퀴다.");
    }

    public void sound() {   // 메소드 오버라이딩(다른 객체에서 덮어쓰기)
        System.out.println(this.getName() + " 야옹, 야옹, meow, meow~~~~");
    }
}

