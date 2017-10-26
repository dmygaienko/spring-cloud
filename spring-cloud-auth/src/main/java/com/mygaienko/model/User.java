package com.mygaienko.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "user")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements UserDetails {

    @Id
    @GeneratedValue
    private long id;

    private String email;

    private String firstName;

    private String surname;

    private String contactNumber;

    private String address;

    private String password;

    @ElementCollection(targetClass = UserAuthority.class, fetch = FetchType.EAGER)
   /* @CollectionTable(
            name = "user_authority",
            joinColumns = @JoinColumn(name = "user_id")
    )*/
    @Enumerated(EnumType.STRING)
    private List<UserAuthority> authorities;

    public List<UserAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return email;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

    public String name() {
        return firstName + " " + surname;
    }
}
