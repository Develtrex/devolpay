package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.BillingManager;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

public class BillingManagerRepository extends AbstractRepositoryBase<BillingManager> {
    public BillingManagerRepository(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        super(sessionFactory, BillingManager.class);
    }
}
