import com.bytedance.ads.ApiClient;

public class test {
    public static void main(String args[]){

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.oceanengine.com");
        apiClient.addDefaultHeader("Access-Token", "test");
    }
}
