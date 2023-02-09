public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
        private static void task1() {
            System.out.println("Задача1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
                    String lastName = "Ivanov";
                    String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        System.out.println("Задача2");
    String fullName = "Ivanov Ivan Ivanovich";
    String fullName2 = "IVANOV IVAN IVANOVICH";
        boolean sEqualsIgnoreCasefullName2 = fullName.equalsIgnoreCase(fullName2);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
    }

    private static void task3() {
        System.out.println("Задача3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullNameTrue);
    }
}


