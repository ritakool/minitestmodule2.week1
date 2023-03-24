import java.util.Scanner;

public class Main {
    static class Student {
        String Name;
        byte Age;
        String nameClass;
        public Student(String Name, byte Age,String nameClass){
            this.Name = Name;
            this.Age = Age;
            this.nameClass = nameClass;
        }
        public String getName() {
            return Name;
        }
        public void setName(String Name) {
            this.Name = Name;
        }
        public String getNameClass() {
            return nameClass;
        }
        public void setNameClass(String nameClass) {
            this.nameClass = nameClass;
        }
        public byte getAge() {
            return Age;
        }
        public void setAge(byte Age){
            this.Age = Age;
        }
    }
    public static void main(String[] args) {

        System.out.print("Nhap ten: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Nhap tuoi: ");
        byte age = new Scanner(System.in).nextByte();
        System.out.print("Nhap lop: ");
        String nameclass = new Scanner(System.in).nextLine();
        Student student = new Student(name, age, nameclass);
        System.out.println("Tên là '" + student.getName() + "' Tuổi '" + student.getAge() + "' học lớp '" + student.getNameClass()+ "'");
    }
}