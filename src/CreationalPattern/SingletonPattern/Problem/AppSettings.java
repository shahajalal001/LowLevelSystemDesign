package CreationalPattern.SingletonPattern.Problem;

public class AppSettings {
    private String databaseUrl;
    private String apiKey;

    public AppSettings(){
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "1234-ACDSF";
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
