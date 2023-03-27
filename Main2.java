public class Main2 {
    public static void main(String[] args) {
        Person person = new Person("Miftah", "Jl.xxx, Tangerang Selatan");
        Student student = new Student("Salma", "Jl. yyy, Yogyakarta", "TRPL", 2022, 5000);
        Staff staff = new Staff("Angel", "jl.zzz, Boyolali", "xx SHS", 10000);

        System.out.println(person.toString());
        System.out.println();

        System.out.println(student.toString());
        System.out.println();

        System.out.println(staff.toString());
    }
}