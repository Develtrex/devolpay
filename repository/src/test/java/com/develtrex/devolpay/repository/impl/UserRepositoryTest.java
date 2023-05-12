package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.User;
import com.develtrex.devolpay.repository.inter.InterRepositoryBase;
import com.jofrantoba.model.jpa.shared.UnknownException;
import org.hibernate.Transaction;
import org.junit.Test;

public class UserRepositoryTest extends RepositoryBaseTest {
    @Test
    public void createUser() throws UnknownException {
        User user = contextEntity.getBean(User.class);
        InterRepositoryBase<User> userRepository = contextRepository.getBean(UserRepository.class);
        user.setName("Alexander");
        user.setLastname("Nole");
        Transaction tx = userRepository.getSession().beginTransaction();
        userRepository.save(user);
        tx.commit();
    }
}
