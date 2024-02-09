package registry;


import java.util.ArrayList;
import java.util.Scanner;

public class Cats extends Home_animals {

    Scanner scanner = new Scanner(System.in);
    private String birth;
    private String name;
    private ArrayList<String> commands = new ArrayList<String>();

    public Cats(String name, String birth){
        this.birth=birth;
        this.name=name;

    }

    public Cats(){
        System.out.println("Введите имя:");
        name = scanner.nextLine(); 
        System.out.println("Введите дату рождения:");
        birth = scanner.nextLine();
        System.out.println("Введите команды(для окончания ввода введите 'q'):");
        String command1 = scanner.nextLine();
        commands.add(command1);
        while (!command1.equals("q")) {
            command1 = scanner.nextLine();
            commands.add(command1);

        }

    }


    ArrayList<String> getCommands() {
            return commands;
    }

    String getName(){
        return name;
    }
    String getBirth(){
        return birth;
    }
    
}
