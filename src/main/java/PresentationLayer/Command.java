package PresentationLayer;

import FunctionLayer.LoginSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "Oversigt", new Oversigt() );
        commands.put( "employeepage", new employeepage() );
        commands.put( "NewEmployee", new NewEmployee() );
        commands.put( "DeleteUser", new DeleteUser() );
        commands.put( "UpdateUser", new UpdateUser() );
        commands.put( "ResetUser", new ResetUser() );
        commands.put( "Logout", new Logout() );
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginSampleException;

}
