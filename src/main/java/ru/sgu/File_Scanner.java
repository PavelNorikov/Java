import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class File_Scanner {
    public void start(){
        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] s = scanner.nextLine().split(" ");
                if(s.length == 1 && s[0].equals("")) {
                    System.out.println();
                }
                else if(s.length >= 3){
                    int i;
                    for(i = 0; i < 3; i++){
                        for(int j = 0; j < s[i].length(); j++){
                            if(Character.isDigit(s[i].charAt(j))){
                                i = 10;
                                break;
                            }
                        }
                    }
                    if (i < 10){
                        System.out.println(s[1] + " " + s[0].charAt(0) + "." + s[2].charAt(0) + ".");
                    }
                    else {
                        System.out.println("...есть разные варианты..");
                    }
                }
                else {
                    System.out.println("...есть разные варианты..");
                }
            }
            scanner.close();
        }

        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
