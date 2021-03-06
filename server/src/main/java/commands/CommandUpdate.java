package commands;

import data.Dragon;
import utility.CollectionManager;
import utility.Response;


/**
 * This class is responsible for the updating the element, id of which coincides with the entered id.
 */
public class CommandUpdate extends Command {
    private static final long serialVersionUID = 13L;
    private final CollectionManager collectionManager;

    public CommandUpdate(CollectionManager collectionManager) {
        super("update");
        this.collectionManager = collectionManager;
    }

    /**
     * Executes the command.
     *
     * @param enteredCommand the full name of the entered command
     */
    public Response execute(String enteredCommand, Dragon dragon) {
        if (collectionManager.isEmpty()) {
            return new Response(CommandCode.ERROR, "Невозможно выполнить данную команду, так как коллекция пуста");
        } else {
            if (collectionManager.updateById(Long.parseLong(argument(enteredCommand)), dragon)) {
                return new Response(CommandCode.ERROR, "Невозможно выполнить данную команду, так как в коллекции нет элемента с такими значением id");
            } else {
                return new Response(CommandCode.CHANGE, "Элемент с id " + argument(enteredCommand) + " успешно обновлен");
            }
        }
    }
}


