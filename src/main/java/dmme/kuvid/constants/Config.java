package dmme.kuvid.constants;

/**
 * Configuration variables of application.
 */
public class Config {
    public static final LogLevel DEFAULT_LOG_LEVEL = LogLevel.INFO;
    public static final int fontSize = 40;

    public static String getAssetsPath() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            return "./assets/";
        } else {
            return ".\\assets\\";
        }
    }
}
