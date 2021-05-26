import java.util.HashMap;

class Commands {
    private HashMap<String, Class> commandsMap = new HashMap<>();

    Commands() {

        this.commandsMap.put("i", Increase.class);
        this.commandsMap.put("d", Reduce.class);
        this.commandsMap.put("s", Squaring.class);
        this.commandsMap.put("o", AddInList.class);
    }

    Class<?> getCommand(String commandKey) {

        return commandsMap.get(commandKey);
    }
}

class Increase {

    public static void run() {
        DplTask.startNumber++;
    }
}

class Reduce {

    public static void run() {
        DplTask.startNumber--;
    }
}

class Squaring {

    public static void run() {
        DplTask.startNumber *= DplTask.startNumber;
    }
}

class AddInList {

    public static void run() {
        DplTask.output.add(DplTask.startNumber);
    }
}


