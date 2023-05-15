package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.Client;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClientRepository extends AbstractRepositoryBase<Client> {
    public ClientRepository(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        super(sessionFactory, Client.class);
    }
}
