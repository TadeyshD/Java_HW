package Java_Home_Work;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    //player date
    public static char player = 'P';
    public static String namePlayer = "General Akbar";
    public static int player_hp = 100;
    public static int player_str = 20;
    public static int playerX;
    public static int playerY;
    public static final int player_moveUp = '8';
    public static final int player_moveLeft = '4';
    public static final int player_moveRight = '6';
    public static final int player_moveDown = '2';
    //map date
    public static char [][] game_field;
    public static int game_fieldHeight;
    public static int game_fieldWidth;
    public static int game_fieldSizeMin = 5;
    public static int game_fieldSizeMax = 10;
    public static char empty_field = '_';
    public static char done_field = 'O';
    //trap date
    public static char trap = 'X';
    public static int trap_damage;
    public static int trap_count;
    public static int trap_max_count = 2;
    public static int trap_min_count = 11;


    public static void main(String[] args){
        new_game_field();
        look_at_the_game_field();
    }


    public static void new_game_field() {
        game_fieldHeight = randomValue(game_fieldSizeMin, game_fieldSizeMax);
        game_fieldWidth = randomValue(game_fieldSizeMin, game_fieldSizeMax);
        game_field = new char[game_fieldHeight][game_fieldWidth];

        for (int y = 0; y < game_fieldHeight; y++) {
            for (int x = 0; x < game_fieldWidth; x++) {
                game_field[y][x] = empty_field;
            }
        }
        System.out.println("General! The size of the star system is " + game_fieldHeight + " x " + game_fieldWidth + ".");
    }
    public static void look_at_the_game_field() {
        for (int y = 0; y < game_fieldHeight; y++) {
            for (int x = 0; x < game_fieldWidth; x++) {
                System.out.print(game_field[y][x] + "|");
            }
            System.out.println();
        }
    }
    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
