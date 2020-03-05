package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewEmployee extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter( "email" );
        String password = request.getParameter( "password" );
        String role = request.getParameter( "role" );

        User user = LogicFacade.NewEmployee( email, password, role );
        HttpSession session = request.getSession();

        session.setAttribute("email",email);
        session.setAttribute( "user", user );
        session.setAttribute( "role", role );

        return "employeepage";
    }
}
