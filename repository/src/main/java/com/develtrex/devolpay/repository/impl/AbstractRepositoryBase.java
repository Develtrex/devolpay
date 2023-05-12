package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.repository.inter.InterRepositoryBase;
import com.jofrantoba.model.jpa.daoentity.AbstractJpaDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

public abstract class AbstractRepositoryBase<T extends Serializable> extends AbstractJpaDao<T> implements InterRepositoryBase<T> {
    public AbstractRepositoryBase(SessionFactory sessionFactory, Class<T> clazz) {
        super();
        setClazz(clazz);
        setSessionFactory(sessionFactory);
    }
}
