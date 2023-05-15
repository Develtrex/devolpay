package com.develtrex.devolpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
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
@Table(catalog = "devolpay", schema = "devolpay", name = "clients_manager")
public class ClientManager extends NumericPkV1 implements Serializable {

    private static final long serial_version_uid = 1L;
    @Column(name = "owner_user_bean")
    private User owner_user_bean;
    
     //Mapping owner user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_user_id")
    private String ownerUser;
    
    
    @Column(name = "billing_manager_bean")
    private BillingManager billing_manager_bean;
    
    //Mapping billing manager id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_manager_id")
    private BillingManager billingManager;
    
    @Column(name = "billing_user_bean")
    private User billing_user_bean;
    
      //Mapping billing user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_user_id")
    private User billingUser;
    
    @Column(name = "client_bean")
    private Client client_bean;
    
    //Mapping client
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    
    @Column(name = "start_date")
    private Date start_date;
    @Column(name = "end_date")
    private Date end_date;
    @Column(name = "status")
    private String state;
}
