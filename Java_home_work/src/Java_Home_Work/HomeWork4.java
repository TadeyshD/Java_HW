package Java_Home_Work;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);



    //map date
    public static char [][] game_field;
    public static int game_field_Height;
    public static int game_field_Width;
    public static int game_field_Size_Min = 3;
    public static int game_field_Size_Max = 7;
    public static char empty_field = '_';
    public static char done_field = '*';
    //player date
    public static char player = 'P';
    public static String namePlayer = "General Akbar";
    public static int player_hp = 10;
    public static int playerX;
    public static int playerY;
    public static final int player_moveUp = 8;
    public static final int player_moveLeft = 4;
    public static final int player_moveRight = 6;
    public static final int player_moveDown = 2;
    //trap date
    public static char trap = 'X';
    public static int trap_damage;
    public static int trap_count;
    public static int trap_min_count = 2;
    public static int trap_max_count = 11;


    public static void main(String[] args) {
        new_game_field();
        spawn_ship();
        spawn_trap();
        while (true) {
            look_at_the_game_field();
            fly_my_ship();
            if(!ship_in_service()){
                System.out.println("Oh no, we are destroy");
                break;
            }
            if(are_we_wining_son()){
                System.out.println("Napalm, son. Nothing else in the world smells like that.");
                System.out.println("Level one complete");
                break;
            }
        }

    }
    public static void new_game_field() {
        game_field_Width = randomValue(game_field_Size_Min, game_field_Size_Max);
        game_field_Height = randomValue(game_field_Size_Min, game_field_Size_Max);
        game_field = new char[game_field_Width][game_field_Height];

        for (int x = 0; x < game_field_Width; x++) { //ширина
            for (int y = 0; y < game_field_Height; y++) { //высота
                game_field[x][y] = empty_field;
            }
        }
        System.out.println("General! The size of the star system is " + game_field_Width + " x " + game_field_Height + ".");
    }
    public static void look_at_the_game_field() {
        System.out.println("**********>Welcome aboard, commander<**********");
        for (int x = 0; x < game_field_Width; x++) {
            for (int y = 0; y < game_field_Height; y++) {
                System.out.print(game_field[x][y] + "|");
            }
            System.out.println();
        }
       System.out.println("*************>Vzhzhzh, hyperdrive<*************");
    }

    public static void spawn_ship(){
        playerX = randomValue(0, game_field_Width - 1);
        playerY = randomValue(0, game_field_Height - 1);
        game_field[playerX][playerY] = player;
        System.out.println(namePlayer + " exited hyperspace at coordinates: " + "[" + (playerX + 1) + ":" + (playerY + 1) + "]");
    }
    public static void spawn_trap(){
        trap_damage = randomValue(trap_min_count, trap_max_count);
        trap_count = (game_field_Height + game_field_Width) / 2;
        int trapX;
        int trapY;
        for (int i = 1; i < trap_count; i++){
            do {
                trapX = random.nextInt(game_field_Width);
                trapY = random.nextInt(game_field_Height);
            } while (!isEmpty(trapX, trapY));
            game_field[trapX][trapY] = trap;
        }
        System.out.println("General! We have a " + trap_count + " trap in this system.");
    }
    public static void fly_my_ship() {
        int current_player_x = playerX;
        int current_player_y = playerY;
        int flight_side;
        do {
            System.out.print("Which way are we flying, General?: take " + player_moveUp + " to move up, take " + player_moveDown +
                    " to move down, take " + player_moveLeft + " to move left, take " + player_moveRight + " to move Right ==> ");
            flight_side = scanner.nextInt();
            switch (flight_side) {
                case player_moveUp:
                    playerX -= 1;
                    break;
                case player_moveDown:
                    playerX += 1;
                    break;
                case player_moveLeft:
                    playerY -= 1;
                    break;
                case player_moveRight:
                    playerY += 1;
                    break;
            }
        } while (!checkValidMove(current_player_x, current_player_y, playerX, playerY));
        player_fly_action(current_player_x, current_player_y, playerX, playerY);
    }
    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
    public static boolean isEmpty(int x, int y){
        return game_field[x][y] == empty_field;

    }
    public static boolean checkValidMove(int pastX, int pastY, int nextX, int nextY){
        if (nextX >= 0 && nextX <  game_field_Width && nextY >= 0 && nextY < game_field_Height) {
            System.out.println(namePlayer + ", we fly by " + "[" + (nextX + 1) + ":" + (nextY + 1) + "]" + " coordinates");
            return true;
        } else {
            System.out.println("Oh no, " + namePlayer + ", not this");
            playerX = pastX;
            playerY = pastY;
            return false;

        }
    }
    public static void player_fly_action(int pastX, int pastY, int nextX, int nextY){
        if (game_field[nextX][nextY] == trap){
            player_hp -= trap_damage;
            trap_count --;
            System.out.println("Oh no, " + namePlayer + ", ITS A TRAAAAP. We have a " + player_hp + " HP");
        }
        game_field[nextX][nextY] = player;
        game_field[pastX][pastY] = done_field;
    }
    public static boolean ship_in_service(){
        return (player_hp > 0);
    }
    public static boolean are_we_wining_son(){
        for (int x = 0; x < game_field_Width; x++){
            for (int y = 0; y < game_field_Height; y++){
                if (game_field[x][y] == empty_field) return false;
            }
        }
        return true;
    }
}
