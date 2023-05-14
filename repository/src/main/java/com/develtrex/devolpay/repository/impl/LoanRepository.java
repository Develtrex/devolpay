package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.entity.Loan;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

public class LoanRepository extends AbstractRepositoryBase<Loan> {
    public LoanRepository(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        super(sessionFactory, Loan.class);
    }
}
