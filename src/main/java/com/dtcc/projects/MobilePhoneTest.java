package com.dtcc.projects;

public class MobilePhoneTest {
    public static void main(String[] args){

        Iphone iphone=new Iphone();
        Samsung samsung=new Samsung();

        System.out.println("Number is "+iphone.getMemory()); //from MobilePhone class...common method.
        System.out.println("Carrier Type "+iphone.getCarrierType());

        System.out.println("Iphone FrontCamera: "+iphone.isFrontCamera()); //from Iphone class
        System.out.println("Iphone Ringtone: "+iphone.getRingtone());
        System.out.println("Iphone OS: "+iphone.getOperatingSystem());

        System.out.println("Samsung FrontCamera: "+samsung.isFrontCamera());    //from Samsung class
        System.out.println("Samsung Ringtone: "+iphone.getRingtone());
        System.out.println("Samsung OS: "+samsung.getOperatingSystem());
    }
}
