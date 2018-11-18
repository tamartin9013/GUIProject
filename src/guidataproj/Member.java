/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidataproj;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//Member Class to be stored in mySQL
public class Member {
    
    //Member Name
    private final StringProperty memberName = new SimpleStringProperty(this, "memberName");
    public StringProperty memberNameProperty() {
        return memberName;
    }
    public final String getmemberName() {
        return memberNameProperty().get();
    }
    public final void setmemberName(String memberName) {
        memberNameProperty().set(memberName);
    }
    
    //Member Email
    private final StringProperty memberEmail = new SimpleStringProperty(this, "memberEmail");
    public StringProperty memberEmailProperty() {
        return memberEmail;
    }
    public final String getmemberEmail() {
        return memberEmailProperty().get();
    }
    public final void setmemberEmail(String memberEmail) {
        memberEmailProperty().set(memberEmail);
    }    
    
    //Member Region
    private final IntegerProperty memberRegion = new SimpleIntegerProperty(this, "memberRegion");
    public IntegerProperty memberRegionProperty() {
        return memberRegion;
    }
    public final int getmemberRegion() {
        return memberRegionProperty().get();
    }
    public final void setmemberRegion(int memberRegion) {
        memberRegionProperty().set(memberRegion);
    }
    
    //Member Join Date
    private final IntegerProperty memberJoinDate = new SimpleIntegerProperty(this, "memberJoinDate");
    public IntegerProperty memberJoinDateProperty() {
        return memberJoinDate;
    }
    public final int getmemberJoinDate() {
        return memberJoinDateProperty().get();
    }
    public final void setmemberJoinDate(int memberJoinDate) {
        memberJoinDateProperty().set(memberJoinDate);
    }
    
    public Member(String memberName, String memberEmail, int memberRegion, int memberJoinDate) {
        setmemberName(memberName);
        setmemberEmail(memberEmail);
        setmemberRegion(memberRegion);
        setmemberJoinDate(memberJoinDate);
    }
    
}
