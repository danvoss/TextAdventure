package com.company;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Dan on 5/25/16.
 */
public class MainTest {
    static final String TEST_FILE = "test.json";

    @Test
    public void saveAndLoad() {
        Player player = new Player();
        player.name = "Test Player";
        player.weapon = "Test Weapon";
        player.location = "Test Location";

        Main.saveGame(player, "test.json");
        Player newPlayer = Main.loadGame("test.json");

        File f = new File(TEST_FILE);
        f.delete();

        assertTrue(newPlayer != null);
        assertTrue(newPlayer.name.equals(player.name));
        assertTrue(newPlayer.weapon.equals(player.weapon));
        assertTrue(newPlayer.location.equals(player.location));
    }

}