package id.co.mandiri.bankapp.day4_assertion;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class BelajarLogging {
    private static final Logger LOGGER = Logger.getLogger(BelajarLogging.class.getName());
    public static void main(String[] args) throws IOException {
        Handler handler = new FileHandler("file-log.log");
        LOGGER.addHandler(handler);
        LOGGER.info("Aplikasi berjalan");
        LOGGER.info("Looping dimulai");
        for (int i = 0; i <5; i++){
            LOGGER.info("nilai i sekarang: " + i);
        }
        LOGGER.info("Looping selesai");
        LOGGER.info("Aplikasi selesai");
    }
}
