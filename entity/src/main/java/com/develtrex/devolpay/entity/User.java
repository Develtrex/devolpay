package com.develtrex.devolpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Component
@Scope("prototype")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(catalog = "devolpay", schema = "devolpay", name = "users")
public class User extends NumericPkV1 implements Serializable {

    private static final long serial_version_uid = 1L;

    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "session_id")
    private String session_id;
    @Column(name = "is_rol_owner")
    private Boolean is_rol_owner;
    @Column(name = "is_rol_admin")
    private Boolean is_rol_admin;
    @Column(name = "is_rol_billing_manager")
    private Boolean is_rol_billing_manager;
}
