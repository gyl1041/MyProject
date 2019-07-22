package com.cn.util;

public class DatabaseContextHolder {

    public static final String DATA_SOURCE_A = "testDataSource";
    public static final String DATA_SOURCE_B = "test1DataSource";
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {

        contextHolder.set(customerType);
    }

    public static String getCustomerType() {

        return contextHolder.get();
    }

    public static void clearCustomerType() {

        contextHolder.remove();
    }

}
