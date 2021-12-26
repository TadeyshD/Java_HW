package Java_Home_Work.HW_5;
/**
 *  * 4. Создать массив из 5 сотрудников.
 *  * Пример:
 *  * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 *  * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
* */
public class Worker_array {
    public static void main (String[] args){
                Worker[] worker_array = new Worker[5];
        worker_array[0] = new Worker ("Ivan", "Ivanov","Ivanovich", "director", "blabla@bla.bl",
                "+3546-123-65-64", 54000, 60 );
        worker_array[1] = new Worker("Ivan", "Sevastopolev","Grishcko", "manager", "Shrek2@bla.bl",
                "+3546-432-32-32", 14000, 32);
        worker_array[2] = new Worker("Vlad", "Lem","Maxpayneovich", "sales manager", "+blabla@bla.bl",
                "+3546-123-62-34", 34000, 42);
        worker_array[3] = new Worker("Alan", "Wayke", "Nightmareovich", "state writer", "give@alanwayke2.pls",
                "+78455-789-96-78", 54000, 47);
        worker_array[4] = new Worker("Jim", "Halpert", "Petrovich", "actor", "office@office.of",
                "+32455-604-36-58", 4000, 20);
        for (int i = 0; i < worker_array.length; i++){
            if (worker_array[i].getAge() > 40){
                worker_array[i].print();
            }
        }
    }
        }
