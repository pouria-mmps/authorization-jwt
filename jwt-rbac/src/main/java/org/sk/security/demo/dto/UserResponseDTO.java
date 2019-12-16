package org.sk.security.demo.dto;

import lombok.Data;

@Data
public class UserResponseDTO extends UserDTO {

    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
