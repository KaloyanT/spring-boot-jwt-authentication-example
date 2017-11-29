package com.sb.springbootjwtauthentication.repository;

import com.sb.springbootjwtauthentication.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserId(final long userId);

    User findByUsername(final String username);

    User findByEmail(final String email);
}

