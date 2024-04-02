public class Ex704 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 20221004;
        s2.name = "유재석";
        s1.printInfo();

        s2.insertRecord(20021005, "마동석");    // Don Lee
        s2.printInfo();

        Student s3 = new Student(20221006, "김유석");
        s3.printInfo();
    }
}
