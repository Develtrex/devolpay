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
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Component
@Scope("prototype")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(catalog = "devolpay", schema = "devolpay", name = "client")
public class Amortization extends NumericPkV1 implements Serializable {

    @Column(name = "amount")
    private Double amount;
    @Column(name = "date")
    private Date date;
    @Column(name = "version" )
    private Long version;
    private String operation;
    @Column(name = "loan_bean")
    private Loan loan_bean;
    @Column(name = "loan_id")
    private String loan_id;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "amortization_cod")
    private String amortization_cod;
    @Column(name = "total_amortization")
    private Double total_amortization;
    @Column(name = "client_manager_id")
    private String client_manager_id;
    @Column(name = "billing_manager_id")
    private String billing_manager_id;
    @Column(name = "billing_role")
    private String billing_role;
    @Column(name = "billing_user_id")
    private String billing_user_id;
    @Column(name = "billing_name")
    private String billing_name;
    @Column(name = "billing_lastname")
    private String billing_lastname;
    @Column(name = "value_generator_id")
    private String value_generator_id;
    @Column(name = "id_create_amortization" )
    private String id_create_amortization;


}
