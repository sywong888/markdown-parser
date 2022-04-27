import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        Path filePath = Path.of("./test-file.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> correctLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(correctLinks, links);
    }


}

// import static org.junit.Assert.*;
// import org.junit.*;
// public class MarkdownParseTest {
//     @Test
//     public void addition() {
//         assertEquals(2, 1 + 1);
//     }
// }