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
public class Game implements Serializable{
    // Game instance vereable 
    private int score;
    private int startTime; 
    private String itemList;

    public Game(int score, int startTime, String itemList) {
        this.score = score;
        this.startTime = startTime;
        this.itemList = itemList;
    }

    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.score;
        hash = 89 * hash + this.startTime;
        hash = 89 * hash + Objects.hashCode(this.itemList);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", startTime=" + startTime + ", itemList=" + itemList + '}';
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
        final Game other = (Game) obj;
        if (this.score != other.score) {
            return false;
        }
        if (this.startTime != other.startTime) {
            return false;
        }
        if (!Objects.equals(this.itemList, other.itemList)) {
            return false;
        }
        return true;
    }
    
}
