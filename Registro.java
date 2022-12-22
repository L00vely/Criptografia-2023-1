/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class Registro {
    
    String vector = "";
    long timeChacha20 = 0;
    long timeAESECB = 0;
    long timeAESCBC = 0;

    public Registro(String vector, long timeChacha20, long timeAESECB, long timeAESCBC) {
        this.vector = vector;
        this.timeChacha20 = timeChacha20;
        this.timeAESECB = timeAESECB;
        this.timeAESCBC = timeAESCBC;
    }

    public Registro(String vector, long timeChacha20) {
        this.vector = vector;
        this.timeChacha20 = timeChacha20;
    }    
    
    public Registro(String vector, long timeChacha20, long timeAESECB) {
        this.vector = vector;
        this.timeChacha20 = timeChacha20;
        this.timeAESECB = timeAESECB;
    }
    
}
