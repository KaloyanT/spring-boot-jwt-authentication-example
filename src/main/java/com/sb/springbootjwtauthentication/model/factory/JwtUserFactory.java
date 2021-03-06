package com.sb.springbootjwtauthentication.model.factory;

import com.sb.springbootjwtauthentication.model.entity.User;
import com.sb.springbootjwtauthentication.model.security.JwtUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import java.util.Collection;

public class JwtUserFactory {

    public static JwtUser create(User user) {
        Collection<? extends GrantedAuthority> authorities;
        try {
            authorities = AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities());
        } catch (Exception e) {
            authorities = null;
        }
        return new JwtUser(
                user.getUserId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getLastPasswordResetDate(),
                authorities
        );
    }

}
