package com.develtrex.devolpay.entity;

import java.io.Serializable;

public class RPCUser implements Serializable {

    private static final long serial_version_uid = 1L;

    private String user_id;
    private String name;
    private String lastname;
    private String email;
    private Long version;
    private String session_id;
    private Boolean is_rol_owner;
    private Boolean is_rol_admin;
    private Boolean is_rol_billing_manager;
}
