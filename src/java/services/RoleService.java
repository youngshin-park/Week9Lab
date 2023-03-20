package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

/**
 *
 * @author third
 */
public class RoleService {
    
        public List<Role> getAll(Role role) throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll(role);
        return roles;
    }
}
