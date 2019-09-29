import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class RuleTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void folderTest() throws IOException {
        File logs = folder.newFolder("logs");
        File log = folder.newFile("errors.log.txt");
        assertTrue(log.exists());
    }
}
