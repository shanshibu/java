
public class Main {

    public static void main(String[] args) {

        String appName = System.getenv("APP_NAME");
        String environment = System.getenv("APP_ENV");
        String apiKey = System.getenv("API_KEY");

        System.out.println("Application: " + appName);
        System.out.println("Environment: " + environment);

        if (apiKey != null && !apiKey.isBlank()) {
            System.out.println("API Key: Configured");
        } else {
            System.out.println("API Key: Missing");
        }
    }
}
