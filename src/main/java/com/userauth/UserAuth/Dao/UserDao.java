package com.userauth.UserAuth.Dao;

import com.userauth.UserAuth.Entities.User;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    
}
