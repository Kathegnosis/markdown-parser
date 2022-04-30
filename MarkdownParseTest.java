import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.*;

public class MarkdownParseTest {

    // Ke and Keren: This indicates to junit that the following method is a test.
    @Test
    public void addition() {
        // Ke and Keren: Returns true if 2 (expected output of operation) and 1+1 (operation) are the same. Otherwise, asserts false. 
        assertEquals(2, 1 + 1);
    }


    @Test
    public void getLinksTester() throws IOException{
        try {
            // getting path
            Path fileName = Path.of("test-file.md");

            String expectedLinks = Files.readString(fileName);

            ArrayList<String> links = MarkdownParse.getLinks(expectedLinks); 

            assertEquals(List.of("https://something.com", "some-thing.html"), links);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void getLinkshaveBracket() throws IOException{
        try {
            // getting path
            Path fileName = Path.of("haveBracket.md");

            String expectedLinks = Files.readString(fileName);

            ArrayList<String> links = MarkdownParse.getLinks(expectedLinks); 

            assertEquals(List.of(), links);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void getLinksnew() throws IOException{
        try {
            // getting path
            Path fileName = Path.of("new.md");

            String expectedLinks = Files.readString(fileName);

            ArrayList<String> links = MarkdownParse.getLinks(expectedLinks); 

            ArrayList<String> expected = new ArrayList();
            expected.add("https://docs.google.com/document/d/1oEmpjjKUJHLCEYCF9t_CLcSqeisCokhz5id_Vt4EHgI/edit");

            assertEquals(expected, links);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void getLinkswithout() throws IOException{
        try {
            // getting path
            Path fileName = Path.of("without.md");

            String expectedLinks = Files.readString(fileName);

            ArrayList<String> links = MarkdownParse.getLinks(expectedLinks); 

            assertEquals(List.of(), links);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void getLinksmixed() throws IOException{
        try {
            // getting path
            Path fileName = Path.of("failingtest2.md");

            String file = Files.readString(fileName);

            ArrayList<String> links = MarkdownParse.getLinks(file); 

            assertEquals(List.of("link"), links);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}