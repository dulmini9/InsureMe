package com.example.insureme;

public class Database {

    public static final String DB_NAME = "INSURANCE";
    public static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "CALCULATIONS";

    public static final String CID = "ID";
    public static final String INSURANCE_TYPE = "INSURANCE_TYPE";
    public static final String MKTVAL = "MKTVAL";
    public static final String FUEL = "FUEL";
    public static final String BRAND = "BRAND";
    public static final String TOTAL = "TOTAL";

    public static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ("
            +CID+ " INSERT PRIMARY KEY AUTOINCREMENT,"
            +INSURANCE_TYPE+ " TEXT,"
            +MKTVAL+ " TEXT,"
            +FUEL+ " TEXT,"
            +BRAND+ " TEXT,"
            +TOTAL+ " TEXT,"
            +INSURANCE_TYPE+ " TEXT"
            +");";

}
