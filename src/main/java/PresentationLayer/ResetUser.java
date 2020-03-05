package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResetUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response){
        String email = request.getParameter( "email" );
        User user = LogicFacade.ResetUser( email );
        HttpSession session = request.getSession();
        return "employeepage";
    }
}
