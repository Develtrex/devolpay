package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.ClientManager;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClientManagerRepository extends AbstractRepositoryBase<ClientManager> {
    public ClientManagerRepository(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        super(sessionFactory, ClientManager.class);
    }
}
