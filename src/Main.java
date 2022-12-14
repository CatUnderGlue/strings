public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        /*
        Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся
        в неструктурированном формате. Бухгалтерия попросила написать программу, в которой
        можно работать с Ф. И. О. сотрудников.
        Напишите четыре строки:
        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: «ФИО сотрудника — …».
        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
         */
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника - %s%n", fullName);
    }

    public static void task2() {
        /*
        Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
        полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich"
        на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
         */
        System.out.println("Задача 2");
        String fullNameSmall = "Ivanov Ivan Ivanovich";
        String fullNameUpper = fullNameSmall.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s%n", fullNameUpper); // fullName.toUpperCase()
    }

    public static void task3() {
        /*
        Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая
        заменяет символ «ё» на символ «е».
        В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
         */
        System.out.println("Задача 3");
        String fullNameWithChar = "Иванов Семён Семёнович";
        String fullNameWithoutChar = fullNameWithChar.replace("ё", "е");
        System.out.printf("Данные ФИО сотрудника — %s%n", fullNameWithoutChar); // fullName.replace("ё", "е")
    }
}