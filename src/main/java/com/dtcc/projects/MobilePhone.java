package com.dtcc.projects;

public abstract class MobilePhone {
    String carrierType;
    long phoneNumber;
    int memory;

    public int getMemory(){
        return 32;
    }

    public String getCarrierType(){
        return "ATnT";
    }

    public long getPhoneNumber(){
        return 1231231234;
    }

    public abstract String getRingtone();

    public abstract String getOperatingSystem();
}
