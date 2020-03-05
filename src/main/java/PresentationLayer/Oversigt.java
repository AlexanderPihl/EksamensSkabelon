package PresentationLayer;

import DBAccess.UserMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class Oversigt extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        // request.setAttribute("hilsen","hej med dig");

        List<User> result = null;
        try{
            result = UserMapper.showUsers();
        }catch (SQLException e){
            e.printStackTrace();
        }

        request.setAttribute("Oversigt", result);

        return "Oversigt";
    }
}
