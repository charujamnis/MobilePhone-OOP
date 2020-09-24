package com.dtcc.projects;

public class Iphone extends MobilePhone {
    boolean frontCamera;
    boolean backCamera;
    boolean flash;

    public boolean isFrontCamera() {
        return true;
    }
    public boolean isBackCamera(){
        return true;
    }
    public boolean isFlash(){
        return true;
    }

    public String getRingtone() {
        return "iphone ringtone";
    }

    public String getOperatingSystem() {
        return "iOS";
    }
}
