public class Ex706 {
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breed = "포메라니언";     // public 변수
        d.color = "갈색";           // public 변수

        System.out.println("강아지 품종 : " + d.breed);
        System.out.println("강아지 색상 : " + d.color);
        d.sound();  // public 메소드

        d.age = 10; // protected 변수
        System.out.println("강아지 나이 : " + d.age);
        d.run();    // protected 메소드

        // d.name = "다운";    // private 변수 (오류)
        // System.out.println("강아지 이름 : " + d.name);  // 오류
        // d.sleep();  // private 메소드 (오류)
    }
}
