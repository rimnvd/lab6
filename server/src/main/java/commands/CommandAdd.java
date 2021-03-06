package commands;

import data.Dragon;
import utility.CollectionManager;
import utility.Response;


/**
 * This class is responsible for the adding an element to the collection.
 */
public class CommandAdd extends Command {
    private static final long serialVersionUID = 1L;
    private final CollectionManager collectionManager;

    public CommandAdd(CollectionManager collectionManager) {
        super("add");
        this.collectionManager = collectionManager;


    }

    @Override
    public Response execute(String enteredCommand, Dragon dragon) {
        if (collectionManager.addToCollection(dragon))
            return new Response(CommandCode.CHANGE, "Элемент успешно добавлен в коллекцию");
        return new Response(CommandCode.ERROR, "Элемент не может быть добавлен в коллекцию");
    }

}


