package ru.mirea.task30;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GameTest {

    @Test
    public void testToString(){
        Game w1 = new Game("Mario", 13 , "hard");
        Game w2 = new Game("Metroid", 47, "easy");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Game: " + "nameLevel=Mario" + "; " +
                "level=13" + "; " +
                "difficult=hard" +
                '.');
        expected.add("Game: " + "nameLevel=Metroid" + "; " +
                "level=13" + "; " +
                "difficult=easy" +
                '.');

        ArrayList<String> actual = new ArrayList<>();
        actual.add(w1.toString());
        actual.add(w2.toString());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode(){
        Game w1 = new Game("Mario", 13 , "hard");
        Game w2 = new Game("Metroid", 47, "easy");
        Game w3 = new Game("Man of war", 11, "hero");
        Game w4 = new Game("Doom", 13, "middle");

        ArrayList<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(false);

        ArrayList<Boolean> actual = new ArrayList<>();
        actual.add(w1.hashCode() == w2.hashCode());
        actual.add(w1.hashCode() == w3.hashCode());
        actual.add(w1.hashCode() == w4.hashCode());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  testAlwaysNotPass(){
        Game w1 = new Game("Mario", 13 , "hard");
        Game w2 = new Game("Metroid", 47, "easy");

        String expected = "green";
        String actual = w2.getEyesColor();

        Assert.assertEquals(expected, actual);
    }
}