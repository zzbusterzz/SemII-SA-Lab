/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author MScIT17
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediaAdapter adapter = new MediaAdapter();
        adapter.Play("aaa.MP4");
        adapter.Play("bbb.MP3");
        adapter.Play("ccc.aac");
    }
    
}
