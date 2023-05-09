package com.develtrex.devolpay.config;

import com.jofrantoba.model.jpa.psf.PSF;
import com.jofrantoba.model.jpa.psf.connection.ConnectionPropertiesPostgre;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.develtrex.devolpay.repository"})
public class RepositoryConfig {
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
