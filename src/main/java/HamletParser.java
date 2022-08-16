import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }





    public boolean findHamlet(String string){
        Pattern pat = Pattern.compile("(?i)hamlet");
        Matcher matcher = pat.matcher(string);
        return matcher.matches();
    }

    public boolean findHoratio(){
        return false;
    }

    public String changeHamletToLeon(String hamlet) {
        return null;
    }

    public String changeHoratioToTariq(String hamlet) {
        return null;
    }
}
