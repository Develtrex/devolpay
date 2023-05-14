package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.Amortization;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

public class AmortizationRepository extends AbstractRepositoryBase<Amortization> {
    public AmortizationRepository(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        super(sessionFactory, Amortization.class);
    }
}
