import org.junit.Test;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount();

        String document = "Practice makes perfect.";
        String test1 = "Pizza time";
        String test2 = " ";
        String test3 = "";
        String test4 = "Failure will lead to success somehow";
        String test5 = "You are late";

        String[][] res = wordCount(document);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }


    }
}
