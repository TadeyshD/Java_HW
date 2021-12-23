package Java_Home_Work.HW_5;
/**
 * На JAVA НЕ!!!! ПИШУТ на русском языке *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Date_about_worker {
    public static void main(String[] args) {
        Worker worker1 = new Worker ("Ivan", "Ivanov","Ivanovich", "director", "+blabla@bla.bl",
                "+3546-123-65-64", 54000, 60 );
       worker1.print();
    }

}
