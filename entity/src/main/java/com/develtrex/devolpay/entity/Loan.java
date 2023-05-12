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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Component
@Scope("prototype")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
//@Entity
@Table(catalog = "devolpay", schema = "devolpay", name = "loans")
public class Loan extends NumericPkV1 implements Serializable {

     private static final long serial_version_uid = 1L;
    @Column(name = "date")
    private Date date;
    @Column(name = "amoun")
    private Double amount;
    @Column(name = "tax")
    private Double tax;
    @Column(name = "to_retur")
    private Double to_return;
    @Column(name = "returned")
    private Double returned;
    @Column(name = "state")
    private String state;
    @Column(name = "dni")
    private String dni;
    @Column(name = "version")
    private Long version;
    @Column(name = "operation")
    private String operation;
    @Column(name = "client_bean")
    private Client client_bean;
    
  //Mapping client
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    
   //Mapping user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    
    
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "loan_cod")
    private String loan_cod;
    @Column(name = "value_generator_id")
    private String value_generator_id;
    @Column(name = "create_loan_id")
    private String create_loan_id;
    @Column(name = "loan_type")
    private String loan_type;
    @Column(name = "gloss")
    private String gloss;
}
