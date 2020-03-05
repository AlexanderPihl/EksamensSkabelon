package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response){
        String email = request.getParameter( "email" );
        String password = request.getParameter( "password" );
        User user = LogicFacade.UpdateUser( password, email);
        HttpSession session = request.getSession();
        return "employeepage";
    }
}
