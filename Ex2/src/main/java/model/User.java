package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private String username;
    private String email;
    private String password;

    @Override
    public String toString() {
        return username + " - " + email + " - " + password;
    }
}
