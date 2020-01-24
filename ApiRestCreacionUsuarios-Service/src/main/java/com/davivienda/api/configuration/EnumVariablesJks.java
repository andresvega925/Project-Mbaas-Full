package com.davivienda.api.configuration;

public enum EnumVariablesJks {

    NOMBRE_JKS("keystore.jks"),
    ALIAS_JKS("ALIAS_JKS"),
    ALIAS_TUSTORE("ALIAS_TRUSTSTORE"),
    PASSWORD_JKS("PASS_JKS"),
    PASSWORD_TRSUTSTORE("PASS_TRUSTSTORE"),
    PATH_JKS("PATH_JKS"),
    PATH_TRUSTSTORE("PATH_TRUST"),
    TYPE_INSTANCE("JKS");

    private String nameVariable;

    EnumVariablesJks(String nameVariable){
        this.nameVariable = nameVariable;
    }

    public String getNameVariable() {
        return nameVariable;
    }

}
