/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Moose
 */
public class Game implements Serializable {

    // Game instance vereable 
    private int score;
    private int startTime;
    private String itemList;

    private Player player;
    private Map map;
    private Items[] items;
    private Actors[] actors;

    public Game(int score, int startTime, String itemList) {
        this.score = score;
        this.startTime = startTime;
        this.itemList = itemList;
    }

    public Game() {
    }

    public Actors[] getActors() {
        return actors;
    }

    public void setActors(Actors[] actors) {
        this.actors = actors;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.score;
        hash = 53 * hash + this.startTime;
        hash = 53 * hash + Objects.hashCode(this.itemList);
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + Arrays.deepHashCode(this.items);
        hash = 53 * hash + Arrays.deepHashCode(this.actors);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.items, other.items)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actors, other.actors)) {
            return false;
        }
        return true;
    }

    public void setscore(int i) {
    }

    public void setstarttime(int i) {
    }

    public void setitemlist(String knife) {
    }

}
