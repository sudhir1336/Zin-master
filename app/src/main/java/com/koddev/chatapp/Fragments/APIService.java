package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABGZPKnY:APA91bGByLHRuCMmIRuxmfik30f1AsPGYsCcybY65a1UaZWTZIXG65kFmd9pKZdF1UD6Ld9RsouDwyxuIguQmEc2VIx1_osVuQFbMBcZ86RvXlIBgjGjLVhQvN3u9qzTJkxtLp4CugFH"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
