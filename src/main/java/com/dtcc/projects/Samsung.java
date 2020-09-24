package com.dtcc.projects;

public class Samsung extends MobilePhone{
    boolean frontCamera;
    boolean backCamera;
    boolean flash;

    public boolean isFrontCamera() {
        return false;
    }
    public boolean isBackCamera(){
        return true;
    }
    public boolean isFlash(){
        return true;
    }

    public String getRingtone() {
        return "samsung ringtone";
    }

    public String getOperatingSystem() {
        return "android mobile";
    }
}
