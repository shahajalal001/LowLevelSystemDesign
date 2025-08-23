package CreationalPattern.SingletonPattern.Solution;

public class AppSettings {
    private static AppSettings instance;

    public static AppSettings getInstance() {
        if(instance == null){
            instance = new AppSettings();
        }
        return instance;
    }

    private String databaseUrl, apiKey;

    private AppSettings(){
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
