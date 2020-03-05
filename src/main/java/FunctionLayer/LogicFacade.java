package FunctionLayer;

import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser(String s, String email, String password) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }

    public static User NewEmployee(String email, String password, String role) throws LoginSampleException {
        User user = new User(email, password, role);
        UserMapper.createUser( user );
        return user;
    }

    public static User DeleteUser(String email) {
        User user = new User(email);
        UserMapper.DeleteUser( user );
        return user;
    }

    public static User UpdateUser(String password, String email) {
        User user = new User(password, email);
        UserMapper.UpdateUser( user );
        return user;
    }

    public static User ResetUser(String email) {
        User user = new User(email);
        UserMapper.ResetUser( user );
        return user;
    }
}
