package org.sk.security.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sk.security.demo.db.entities.EntityConverter;
import org.sk.security.demo.db.entities.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements EntityConverter<User> {

    protected String firstName;
    protected String lastName;
    protected String loginId;
    protected String password;
    protected boolean active;
    protected String role;

    @Override
    public User getEntity(int id) {
        return new User(id, this.firstName, this.lastName, this.loginId, this.password, this.active, this.role);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
