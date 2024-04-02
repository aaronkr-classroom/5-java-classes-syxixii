public class Ex702 {
    // 정적 (일반) 메소드
    static void staticMethod() {
        System.out.println("정적 메소드 호출");
    }
    // 인스턴스 (Class) 메소드
    public void instanceMethod() {
        System.out.println("인스턴스 메소드 호출");
    }

    public static void main(String[] args) {
        int y;

        staticMethod();
        // instanceMethod();

        Ex702 x = new Ex702();
        x.instanceMethod();
    }
}
