/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  DAVID
 */

public class HRegistro {
    String vector = "";
    long timeSha2_384= 0;
    long timeSha2_512= 0;
    long timeSha3_384= 0;
    long timeSha3_512= 0;
    
    public HRegistro(String vector, long timeSha2_384,long timeSha2_512,long timeSha3_384,long timeSha3_512) {
        this.vector = vector;
        this.timeSha2_384 = timeSha2_384;
        this.timeSha2_512 = timeSha2_512;
        this.timeSha3_384 = timeSha3_384;
        this.timeSha3_512 = timeSha3_512;
    }
}
