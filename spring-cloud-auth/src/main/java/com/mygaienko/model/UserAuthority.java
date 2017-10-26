package com.mygaienko.model;

import org.springframework.security.core.GrantedAuthority;

public enum UserAuthority implements GrantedAuthority {

    ADMIN,
    USER;

    public String getAuthority() {
        return name();
    }

}
