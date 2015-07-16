/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autowiring;

import org.springframework.stereotype.Component;

/**
 *
 * @author jiza
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title="Musica";
    private String artist = "The beatles";
    
    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
    
}
