import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
public class countVowelSubTest {
    @Test
    public void test0(){
        String str = "";
        assertEquals(0, countVowelSubv1.countVowelSubstrings(str));
    }
    @Test
    public void test1(){
        String str = "a";
        assertEquals(0, countVowelSubv1.countVowelSubstrings(str));
    }
    @Test
    public void test2(){
        String str = "eh";
        assertEquals(0, countVowelSubv1.countVowelSubstrings(str));
    }
    @Test
    public void test3(){
        String str = "about";
        assertEquals(0, countVowelSubv1.countVowelSubstrings(str));
    }
    @Test
    public void test4(){
        String str = "weigh";
        assertEquals(0, countVowelSubv1.countVowelSubstrings(str));
    }
    @Test
    public void test5(){
        String str = "louis";
        assertEquals(0, countVowelSubv1.countVowelSubstrings(str));
    }
    @Test
    public void test0b(){
        String str = "";
        assertEquals(0, countVowelSubv2.countVowelSubstrings(str));
    }
    @Test
    public void test1b(){
        String str = "a";
        assertEquals(0, countVowelSubv2.countVowelSubstrings(str));
    }
    @Test
    public void test2b(){
        String str = "eh";
        assertEquals(0, countVowelSubv2.countVowelSubstrings(str));
    }
    @Test
    public void test3b(){
        String str = "about";
        assertEquals(0, countVowelSubv2.countVowelSubstrings(str));
    }
    @Test
    public void test4b(){
        String str = "weigh";
        assertEquals(0, countVowelSubv2.countVowelSubstrings(str));
    }
    @Test
    public void test5b(){
        String str = "louis";
        assertEquals(0, countVowelSubv2.countVowelSubstrings(str));
    }

@Test
public void testWithVowelSubstring(){
String str = "cuaieuo";
assertEquals(2, countVowelSubv1.countVowelSubstrings(str));
}
@Test
public void testWithVowelSubstringb(){
String str = "cuaieuo";
assertEquals(2, countVowelSubv2.countVowelSubstrings(str));
}

}