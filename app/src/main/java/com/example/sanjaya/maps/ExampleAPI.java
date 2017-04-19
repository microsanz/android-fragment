package com.example.sanjaya.maps;


        import java.util.List;

        import retrofit2.Call;
        import retrofit2.http.GET;
        import retrofit2.http.Query;

public interface ExampleAPI {


    @GET("maps/api/geocode/json")
    Call<Example> loadChanges(@Query("latlng") String latlng);
}