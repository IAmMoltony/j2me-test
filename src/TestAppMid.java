import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class TestAppMid extends MIDlet implements CommandListener
{
    public void startApp()
    {
        Display display = Display.getDisplay(this);
        Form mainForm = new Form("Test App"); // Create a new form
        mainForm.append("Hello, world!"); // Append hello world text into the form

        // Create an exit command and add it to the current form
        Command exitCommand = new Command("Exit", Command.EXIT, 0);
        mainForm.addCommand(exitCommand);

        // Set the app as the form's command listener
        mainForm.setCommandListener(this);

        display.setCurrent(mainForm);
    }

    public void pauseApp()
    {
    }

    public void destroyApp(boolean uncond)
    {
    }

    public void commandAction(Command command, Displayable able)
    {
        // When getting an exit command, destroy the app
        if (command.getCommandType() == Command.EXIT)
            notifyDestroyed();
    }
}
