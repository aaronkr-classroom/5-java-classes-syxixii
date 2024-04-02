public class Ex701 {
    
    public static void main(String[] args) {
        Cat my_cat = new Cat();
        my_cat.setAge(14);
        my_cat.setName("Aaron");

        System.out.println("Say hi to my cat, " + my_cat.getName());
        System.out.println("My cat is " + my_cat.getAge() + "years old");    // public 지정해놔서 my_cat.getAge하지 않아도 됨 private로 변경하면 오류

        my_cat.setAge(6);     // public 지정해놔서 my_cat.setAge하지 않아도 됨 private로 변경하면 오류 - 보다 더 안전함 = private
        System.out.println("My cat is " + my_cat.getAge() + "years old");     

    }
}