public class Main {
    public static void main(String[] args) throws GroupOverflowException, StudentNotFoundException {
        Student st1 = new Student("Ivan", "Ivanov", Gender.MALE, 34, "group Java");
        Student st2 = new Student("Petr", "Petrov", Gender.MALE, 23, "group Java");
        Student st3 = new Student("Misha", "Mishkin", Gender.MALE, 28, "group Java");
        Student st4 = new Student("Masha", "Mashkina", Gender.MALE, 24, "group Java");
        Student st5 = new Student("Lera", "Lerkina", Gender.FEMALE, 57, "group Java");
        Student st6 = new Student("Vasya", "Vasimna", Gender.FEMALE, 12, "group Java");
        Student st7 = new Student("Galya", "Galina", Gender.FEMALE, 29, "group Java");
        Student st8 = new Student("Zhenya", "Zhenina", Gender.FEMALE, 13, "group Java");
        Student st9 = new Student("Nikita", "Nikitof", Gender.MALE, 44, "group Java");
        Student st10 = new Student("Dima", "Dimich", Gender.MALE, 89, "group Java");
        Student st11 = new Student("Kiril", "Kirilov", Gender.MALE, 98, "group c#");

        Student[] students = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8, st9, st10};

        Group group = new Group();
        for (int i = 0; i < students.length; i++) {
            group.addStudent(students[i]);
        }
        System.out.println(group.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        //To test groupOverflowException
        // group.addStudent(st11);

        //to test studentNotFound
        //System.out.println(group.searchStudentByLasName("mikin"));

        //to test removing+adding students
        System.out.println(group.toString());
        group.removeStudentByID(57);
        System.out.println(group.toString());
        group.addStudent(st11);
        System.out.println(group.toString());
        group.removeStudentByID(111);



    }
}