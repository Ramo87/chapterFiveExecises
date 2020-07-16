package test;
import java.io.File;


public final class Logger {
    static {
        File logDirPath = new File("logs");

        if(!logDirPath.exists() || !logDirPath.isDirectory()){
            logDirPath.mkdir();
        }
        logDirPath = null;
        System.getProperties().setProperty("java.util.logging.config.file", "logging.properties");
    }
}
