import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testFindHamletLowerCase() {
        // Given
        String hamlet = "hamlet";
        // When
        boolean actual = hamletParser.findHamlet(hamlet);
        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void testFindHamletUpperCase() {
        // Given
        String hamlet = "hamlet";
        // When
        boolean actual = hamletParser.findHamlet(hamlet);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHoratio(){

    }
}