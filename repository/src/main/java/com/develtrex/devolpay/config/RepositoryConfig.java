package com.develtrex.devolpay.config;

import com.jofrantoba.model.jpa.psf.PSF;
import com.jofrantoba.model.jpa.psf.connection.ConnectionPropertiesPostgre;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.develtrex.devolpay.repository"})
public class RepositoryConfig {
    @Autowired
    @Primary
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory() {
        List<String> packages = new ArrayList();
        packages.add("com.develtrex.devolpay.entity");
        PSF.getInstance().buildPSF("postgre", getConnection(), packages);
        SessionFactory sessionFactory = PSF.getInstance().getPSF("postgre");
        return sessionFactory;
    }

    private ConnectionPropertiesPostgre getConnection() {
        return new ConnectionPropertiesPostgre(
                "localhost", 5432, "devolpay", "postgres", "admin"
        );
    }
}
