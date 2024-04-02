public class Student {
    int id;
    String name;

    // 메소드 오버로딩 (같은 클래스에서)
    Student() { System.out.println("학생 생성"); }  // 매계변수 없는 Student
    Student(int id, String name) {      // 매계변수 있는 Student
        insertRecord(id, name);
    }    

    void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void printInfo() {
        System.out.println("아이디 : " + this.id);
        System.out.println("이름 : " + this.name);
    }
}
