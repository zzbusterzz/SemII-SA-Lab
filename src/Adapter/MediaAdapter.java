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
public class MediaAdapter implements AdvancedPlayer,MediaPlayer {

    public void Play(String fileName){
        if(fileName.contains("MP4")){
            playMP4(fileName);
        }else if(fileName.contains("MP3")){
            playMP3(fileName);
        } else{
            playVLC(fileName);
        }
    }
    
    @Override
    public void playVLC(String Name) {
        System.out.println("Playing VLC song : " + Name);
    }

    @Override
    public void playMP4(String Name) {
        System.out.println("Playing MP4 song : " + Name);
    }

    @Override
    public void playMP3(String Name) {
        System.out.println("Playing MP3 song : " + Name);
    }
    
}
