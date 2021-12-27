package Java_Home_Work.HW_6;
/**
 *1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
 * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */
public class Dog extends Animal{
    public static int dog_count = 0;
    public Dog(String type, String name, int run) {
        super(type, name, run);
        ++ dog_count;
    }

    @Override
    protected String swim() {
        int dog_swim = 10;
        int watter_barrier = random.nextInt(1, 10);
        if (dog_swim >= watter_barrier){
            return(type + " " + name + " was able to swim " + watter_barrier + " meters.");
        } else {
            return (type + " " + name + " could not swim the distance " + watter_barrier + " meters.");
        }

    }

}

