import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;


public class MarkdownParseTest {
    @Test
    public void testSnippet1() throws IOException {
        ArrayList<String> snip1 = new ArrayList<>();        
        snip1.add("`google.com");
        snip1.add("ucsd.edu");
        String snip1Test = MarkdownParse.converter("snippet1.md");
        assertEquals(snip1, MarkdownParse.getLinks(snip1Test));
    }
    @Test
    public void testSnippet2() throws IOException {
        ArrayList<String> snip2 = new ArrayList<>();
        snip2.add("a.com");
        snip2.add("a.com(("); 
        snip2.add("example.com");      
        String snip2Test = MarkdownParse.converter("snippet2.md");
        assertEquals(snip2, MarkdownParse.getLinks(snip2Test));
    }
    @Test
    public void testSnippet3() throws IOException {
        ArrayList<String> snip3 = new ArrayList<>();
        snip3.add("https://www.twitter.com");
        snip3.add("https://ucsd-cse15l-w22.github.io/"); 
        snip3.add("https://cse.ucsd.edu/");
        String snip3Test = MarkdownParse.converter("snippet3.md");
        assertEquals(snip3, MarkdownParse.getLinks(snip3Test));
    }    
}
