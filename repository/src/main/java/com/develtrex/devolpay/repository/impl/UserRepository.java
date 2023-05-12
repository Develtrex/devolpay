package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractRepositoryBase<User> {
    public UserRepository(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        super(sessionFactory, User.class);
    }
}
