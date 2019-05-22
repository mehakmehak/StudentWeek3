/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentweek3;

/**
 *
 * @author Mehak
 */
public class Student {
    private int ID;
    private String firstName;
    private int MaxCourse;
    private boolean PartTime;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the PartTime
     */
    public boolean isPartTime() {
        return PartTime;
    }

    /**
     * @param PartTime the PartTime to set
     */
    public void setPartTime(boolean PartTime) {
        this.PartTime = PartTime;
    }
    
}
