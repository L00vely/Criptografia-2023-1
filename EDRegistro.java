/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class EDRegistro {
    
    String vector = "";
    long timeChacha20 = 0;
    long timeAESECB = 0;
    long timeAESCBC = 0;
    long timeRSA_OAEP = 0;

    public EDRegistro(String vector, long timeChacha20, long timeAESECB, long timeAESCBC,long timeRSA_OAEP) {
        this.vector = vector;
        this.timeChacha20 = timeChacha20;
        this.timeAESECB = timeAESECB;
        this.timeAESCBC = timeAESCBC;
        this.timeRSA_OAEP = timeRSA_OAEP;
    }

}
