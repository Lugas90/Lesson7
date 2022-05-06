import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        // Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        // Задание 3
        fullName = fullName.replaceAll("IVANOV IVAN IVANOVICH", "Иванов Семён Семёнович");
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}