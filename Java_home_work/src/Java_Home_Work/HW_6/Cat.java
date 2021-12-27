package Java_Home_Work.HW_6;

public class Cat extends Animal{
    public static int cat_count = 0;
    public Cat(String type, String name, int run) {
        super(type, name, run);
        ++ cat_count;
    }


    @Override
    protected String swim() {
        return (type + " " + name + " does not want and will not swim!");
    }
    }

