package commands;


/**
 * This class is responsible for the completing the programme.
 */
public class CommandExit extends Command {

    public CommandExit() {
        super("exit");
    }


    @Override
    public boolean execute(String EnteredCommand) {
        if (checkCommand(EnteredCommand)) {
            System.exit(0);
        } else {
            System.out.println("Команда не найдена. Введите \"help\" для справки");
        }
        return false;
    }
}
