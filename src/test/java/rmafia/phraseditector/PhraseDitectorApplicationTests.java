package rmafia.phraseditector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhraseDitectorApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(PhraseDetector.getSubtitlesData("5nlG0svf9t4"));
    }

}
