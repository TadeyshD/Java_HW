package Java_Home_Work.HW_6;

import java.util.Arrays;

/**
 *1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
 * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */
public class HomeWork6 {
    public static void main(String[] args) {
    Animal[] animals = new Animal[6];
    animals[0] = new Cat("British cat", "Murzik", 200);
    animals[1] = new Cat("Cheshire Cat", "Chechka", 200);
    animals[2] = new Cat("Metis cat", "Barsik", 200);
    animals[3] = new Dog("Shepherd dog", "Rex", 500);
    animals[4] = new Dog("Dachshund dog", "Sausage", 500);
    animals[5] = new Dog("Collie dog", "Colyan", 500);
    for (int i = 0; i < animals.length; i++){
    animals[i].lets_run();
    animals[i].lets_swim();
    System.out.println("____________________");
    }
    System.out.println(Animal.animal_count +" animals in total. " + Cat.cat_count + " cats and " + Dog.dog_count + " dogs.");
    }

}