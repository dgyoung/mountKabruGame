/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import Classes.CIT260.MountKabru.Actor;
import Classes.CIT260.MountKabru.Items;
import Classes.CIT260.MountKabru.BattleScene;
import Classes.CIT260.MountKabru.Game;
import Classes.CIT260.MountKabru.Location;
import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Player;
import Classes.CIT260.MountKabru.Scene;
import citbyui.cit260.mountKabru.view.ErrorView;
import citbyui.cit260.mountKabru.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class MountKabru {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static void main(String[] args) {

        try {

            MountKabru.inFile = new BufferedReader(new InputStreamReader(System.in));

            MountKabru.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            MountKabru.logFile = new PrintWriter(filePath);
            StartProgramView startProgramView = new StartProgramView();

            startProgramView.display();
        } catch (Throwable te) {
            ErrorView.display("StartProgramView, There is an error", te.getMessage());
            te.printStackTrace();
        } finally {
            try {
                if (MountKabru.outFile != null) {
                    MountKabru.outFile.close();
                }
                if (MountKabru.inFile != null) {
                    MountKabru.inFile.close();
                }
                if (MountKabru.logFile != null) {
                    MountKabru.logFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MountKabru.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MountKabru.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MountKabru.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MountKabru.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MountKabru.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MountKabru.logFile = logFile;
    }

}
