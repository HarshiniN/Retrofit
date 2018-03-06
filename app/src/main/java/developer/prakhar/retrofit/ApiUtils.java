package developer.prakhar.retrofit;

import developer.prakhar.retrofit.data.remote.RetrofitClient;
import developer.prakhar.retrofit.data.remote.SOService;

/**
 * Created by prakhar on 6/3/18.
 */

public class ApiUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}