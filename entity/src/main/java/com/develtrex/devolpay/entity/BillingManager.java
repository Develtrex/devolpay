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
@Entity
@Table(catalog = "devolpay", schema = "devolpay", name = "client")
public class BillingManager extends NumericPkV1 implements Serializable {

     private static final long serial_version_uid = -4050448234422138484L;
    @Column(name = "owner_user_bean")
    private User owner_user_bean;
    
    //Mapping owner user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_user_id")
    private String ownserUser;
    
    @Column(name = "billing_user_bean")
    private User billing_user_bean;
    
   //Mapping billing user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_user_id")
    private User billingUser;
    
    @Column(name = "start_date")
    private Date start_date;
    @Column(name = "end_date")
    private Date end_date;
    @Column(name = "state")
    private String state;
    @Column(name = "version")
    private Long version;
    @Column(name = "operation")
    private String operation;

}
