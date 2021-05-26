import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class DplTask {

    static Integer startNumber;
    static List<Integer> output;

    static List<Integer> getResult(final String input) {

        startNumber = 0;
        output = new ArrayList<>();
        Commands commands = new Commands();

        if (input == null) {
            return output;
        }

        for (char commandChar : input.toCharArray()) {


            try {
                commands.getCommand(String.valueOf(commandChar)).getMethod("run").invoke(null);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                throw new NullPointerException("\"" + commandChar + "\"" + " -- неверная команда!");
            }
        }
        return output;
    }
}
