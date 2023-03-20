
package services;

import dataaccess.RoleDB;
import dataaccess.UserDB;
import java.util.List;
import models.Role;
import models.User;

/**
 *
 * @author third
 */
public class UserService {

    public User get(String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.get(email);
        return user;
    }
    
    public List<User> getAll(User user) throws Exception {
        UserDB userDB = new UserDB();
        List<User> users = userDB.getAll(user);
        return users;
    }
    
    public void insert(String email, String firstName, String lastName, String password, boolean active, int roleID) throws Exception {
        RoleDB roleDB = new RoleDB();
        Role role = roleDB.get(roleID);
        
        User user = new User(email, active, firstName, lastName, password);
        user.setRole(role);
 
        UserDB userDB = new UserDB();
        userDB.insert(user);
    }
    
    public void update(String email, String firstName, String lastName, String password, boolean active, int roleID) throws Exception {
        RoleDB roleDB = new RoleDB();
        Role role = roleDB.get(roleID);
        
        UserDB userDB = new UserDB();        
        User user = userDB.get(email);
        
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setActive(active);
        user.setRole(role);
                
        userDB.update(user); 
    }
    
    public void delete(String email) throws Exception {
        UserDB userDB = new UserDB();
        User user = userDB.get(email);
        userDB.delete(user);
    }

    public boolean insert(String email, String firstName, String lastName, String password, boolean active, String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
