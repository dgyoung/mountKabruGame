/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Moose
 */
public class Items implements Serializable{
    // Items instance veriables
    private String name;
    private String type;
    private String afect;
    private double power;

    public Items(String name, String type, String afect, double power) {
        this.name = name;
        this.type = type;
        this.afect = afect;
        this.power = power;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAfect() {
        return afect;
    }

    public void setAfect(String afect) {
        this.afect = afect;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Items{" + "name=" + name + ", type=" + type + ", afect=" + afect + ", power=" + power + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.afect);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.power) ^ (Double.doubleToLongBits(this.power) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.power) != Double.doubleToLongBits(other.power)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.afect, other.afect)) {
            return false;
        }
        return true;
    }
    
    
}
