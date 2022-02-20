package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private String role;
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer id, String role) {
        super(id);
        this.role = role;
        securityIncidents = new ArrayList<>();
    }

    @Override
    public boolean assignPin(int pin) {
        if (pin < 100000 || pin > 1000000) {
            return false;
        } else {
            this.pin = pin;
            return true;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (!Objects.equals(this.id, confirmedAuthID)){
            authIncident();
            return false;
        } else {
            return true;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    public void authIncident(){
        String report = String.format("Datetime Submitted: %s \n, ID: %s\n Notes: %s\n",
                new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
