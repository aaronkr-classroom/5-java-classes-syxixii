public class Ex703 {
    
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        
        c1.setName("Iron Man");
        c2.setName("Thor");
        c3.setName("Wolverine");

        c1.eat();
        c2.scratch();
        c3.sound();
    }
}
