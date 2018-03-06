package developer.prakhar.retrofit.data.remote;

/**
 * Created by prakhar on 6/3/18.
 */

import developer.prakhar.retrofit.data.model.SOAnswersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
   Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}