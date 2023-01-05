/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEREMY
 */
public class SignRegistro {
    
    String vector = "";
    long timeRSA_OAEP = 0;
    long timeRSA_PSS = 0;
    long timeECDSA_PF = 0;
    long timeECDSA_BF = 0;    

    public SignRegistro(String vector,long timeRSA_PSS,long timeECDSA_PF,long timeECDSA_BF) {
        this.vector = vector;
        this.timeRSA_PSS = timeRSA_PSS;
        this.timeECDSA_PF = timeECDSA_PF;
        this.timeECDSA_BF = timeECDSA_BF;
    }
}
