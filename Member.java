public class Member {
    String fName;
    String lName;
    String country;
    int age;
    
    public Member() { this("티아고"); }
    public Member(String name) { this(name, 20); }
    public Member(String name, int age) {
        this(name, age, "브라질");
    }
    public Member(String name, int age, String country) {
        this.fName = name;
        this.age = age;
        this.country = country;
    }

    void printInfo() {
        System.out.println("이름 : " + this.fName);
        System.out.println("국적 : " + this.country);
        System.out.println("나이 : " + this.age);
    }

}
