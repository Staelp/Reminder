package seclass.qc.edu.glm;

import java.util.*;

public class Reminder {

    private String type;
    private String name;
    private boolean checkOff;


    private Reminder() { }

    private Reminder(String t, String n) {
        type = t;
        name = n;
        checkOff = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public static void edit(Reminder r) {

    }

}