public class Main {
    public static void main(String[] args) {
        {

            // Task 1
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника - " + fullName);
        }
    }
 public static void  task2 () {
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";

        var fullName = String.format("%s %s %s", lastName, firstName, middleName);
    System.out.printf("Данные ФИО сотрудника для заполнения отчета - %s", fullName.toUpperCase());
    System.out.printf("Данные ФИО сотрудника для заполнения отчеиа  - %s %s %s", firstName, middleName, lastName);

    }
    public static void task3 () {
        var fullName = "Иванов Семён Семёнович";
        var result = fullName.replace("ё","е" );
    System.out.printf("Данные ФИО сотрудника - %s", result);



}
}


