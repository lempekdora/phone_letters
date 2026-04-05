package telephone;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;


public class MainTest {
    @Test
    public void testEmptyInput(){
        assertEquals(new ArrayList<String>(), Main.letters_to_digits(""));

        assertEquals(new ArrayList<String>(), Main.letters_to_digits(null));
    }

    @Test
    public void testSimpleInput(){
        assertEquals(List.of("c", "b", "a"), Main.letters_to_digits("2"));

        assertEquals(List.of("i", "h", "g"), Main.letters_to_digits("4"));

        assertEquals(List.of("s", "r", "q", "p"), Main.letters_to_digits("7"));
    }

    @Test
    void testComplexInput(){
        assertEquals(List.of(
            "cf", "ce", "cd", 
            "bf", "be", "bd", 
            "af", "ae", "ad"
        ), Main.letters_to_digits("23"));

        assertEquals(List.of(
            "sz", "sy", "sx", "sw", 
            "rz", "ry", "rx", "rw", 
            "qz", "qy", "qx", "qw", 
            "pz", "py", "px", "pw"
        ), Main.letters_to_digits("79"));
    }

    @Test
    void testComplexLength(){
        List<String> result = Main.letters_to_digits("7979");
    
        assertEquals(256, result.size());

        List<String> result2 = Main.letters_to_digits("2222");
        
        assertEquals(81, result2.size());

        List<String> result3 = Main.letters_to_digits("234");

        assertEquals(27, result3.size());
    }

    @Test
    void testOrder(){
        List<String> result = Main.letters_to_digits("7979");
    
        assertEquals("szsz", result.get(0));

        assertEquals("pwpw", result.get(255));


        List<String> result2 = Main.letters_to_digits("2222");

        assertEquals("cccc", result2.get(0));
        
        assertEquals("aaaa", result2.get(result2.size() - 1));
    }

    @Test
    void testInvalidInput() {
        assertEquals(new ArrayList<String>(), Main.letters_to_digits("1"));

        assertEquals(new ArrayList<String>(), Main.letters_to_digits("3512"));

        assertEquals(new ArrayList<String>(), Main.letters_to_digits("77777"));

        assertEquals(new ArrayList<String>(), Main.letters_to_digits("abc"));

        assertEquals(new ArrayList<String>(), Main.letters_to_digits("0"));

        assertEquals(new ArrayList<String>(), Main.letters_to_digits(" 23"));
        
        assertEquals(new ArrayList<String>(), Main.letters_to_digits("2-3"));
    }
}
