package id.co.mandiri.bankapp.day4_assertion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestAnimal {
    static {
        String path = TestAnimal.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", path);
    }

    private static Logger logger = Logger.getLogger(TestAnimal.class.getName());

    public static void main(String[] args) {
        logger.fine("This is level fine logging");
        logger.info("this is level info  logging");
        logger.log(Level.SEVERE, "this is level severe logging");
    }
}
