package cn.imust.logindemo;

import cn.imust.logindemo.bean.Root;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Create by APPEN on 2018/7/30 17:04
 * E-mail：palmsoft@126.com
 */
public interface LoginAPI {
    @FormUrlEncoded
    @POST ("auth/login")
    Call<Response> login(@Field("username") String username, @Field("password")String pwd,
                         @Field("loginCode") String code);
    @FormUrlEncoded
    @POST ("auth/login")
    Call<Root> login1(@Field("username") String username, @Field("password")String pwd,
                      @Field("loginCode") String code);

}
