package com.sunil.demoapplication.rest;

import com.sunil.demoapplication.model.Employee;

import java.util.ArrayList;
import java.util.List;


import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by ROBOT on 7/20/2018.
 */

public interface ApiInterface {

    @GET("employee")
    Call<List<Employee>> getInterest();

   /*




    @GET("GetCategoryList")
    Call<List<Category>> getQueryCategoryList();




    @POST
       Call<LatestPosts> getLatestPosts(
            @Query("user_id") String user_id,
            @Query("page") int pageIndex
    );

    @POST
    Call<InfoPosts> getPostsInfo(
            @Query("user_id") String user_id,
            @Query("page") int pageIndex
    );

    @FormUrlEncoded
    @POST("UserSave")
    Call<String> createAccount(
            @Field("CityId") String cityId,
            @Field("FirstName") String FirstName,
            @Field("LastName") String LastName,
            @Field("EmailId") String emailId,
            @Field("MobileNo") String mobNo,
            @Field("Gender") String gender,
            @Field("Address") String address,
            @Field("AboutInfo") String aboutInfo,
            @Field("Password") String password2

    );

    @FormUrlEncoded
    @POST("InterestGetBySearch")
    Call<ArrayList<UserInterest>> getCategory(
            @Field("Name") String name
    );

    @FormUrlEncoded
    @POST("CityGetBySearch")
    Call<ArrayList<City>> getCity(
            @Field("CityName") String name
    );



    @FormUrlEncoded
    @POST("UserLogin")
    Call<ArrayList<UserInfo>> checkLogin(@Field("EmailId") String emailId,
                                         @Field("Password") String password
    );
*//*
    @GET("UserDetail/{conversationId}")
    Call <ArrayList<UserDetail>> getUserDetail(@Path("conversationId") String conversationId); *//* // for parameter concat in url

    @FormUrlEncoded
    @POST("UserInterestSave")
    Call<String> saveInterest(@Field("UserId") String userId,
                              @Field("InterestId") String interestId
    );



    @GET("CityGetByAll")
    Call <ArrayList<City>> getCityAll();


    @FormUrlEncoded
    @POST("UserGetById")
    Call <ArrayList<UserDetailNew>> getUserDetail(@Field("UserId") String id);

    @FormUrlEncoded
    @POST("UserPostSave")
    Call <String> writePost(@Field("UserId") int id,
                            @Field("InterestId") String categoryId,
                            @Field("PostMsg") String latestMsg);


    @FormUrlEncoded
    @POST("UserUpdate")
    Call<String> updateProfie(@Field("UserId") String userID,
                              @Field("CityId") String cityId,
                              @Field("FirstName") String firstName,
                              @Field("LastName") String lastName,
                              @Field("EmailId") String email,
                              @Field("MobileNo") String mobile,
                              @Field("Gender") String gender,
                              @Field("Address") String address,
                              @Field("AboutInfo") String about
    );


    @PUT("NeedyInfo")
    @FormUrlEncoded
    Call<String> postNeedyInfo(@Field("Name") String name,
                               @Field("profile") String img,
                               @Field("Address") String address,
                               @Field("Discription") String description);

    @Multipart
    @POST("UserImgUpdate")
    Call<ResponseBody> uploadProfilePic(@Query("UserId") String userId,
                                        @Part MultipartBody.Part file, @Part("desc") RequestBody filename);


    @FormUrlEncoded
    @POST("MessageSave")
    Call<String> sendMessage(@Field("FromUserId") String fromUserId,
                             @Field("ToUserId") String toUserId,
                             @Field("Message") String message);

  *//*  @FormUrlEncoded
    @GET("UserGetByCityByInterest")
    Call<ArrayList<User>>userList(@Field("CityId")int cityId,
                       @Field("InterestId")int intrestid);*//*


    @FormUrlEncoded
    @POST("AwardSave")
    Call<String> saveAward(@Field("FromUserId") String fromUserId,
                           @Field("ToUserId") String toUserId);

    @Multipart
    @POST("StrangerHelpSave")
    Call<ResponseBody> uploadNeedyInfo(@Query("CityId") String CityId,
                                       @Query("FirstName") String FirstName,
                                       @Query("LastName") String LastName,
                                       @Query("EmailId") String EmailId,
                                       @Query("MobileNo") String MobileNo,
                                       @Query("Gender") String Gender,
                                       @Query("Address") String Address,
                                       @Query("AboutInfo") String AboutInfo,
                                       @Query("UserId") String userId,
                                       @Part MultipartBody.Part file);

    //StrangerHelpGetByCity
    @FormUrlEncoded
    @POST("StrangerHelpGetByCity")
    Call<List<Stranger>> getStrangerList(
            @Field("CityId") String cityId
    );

    @FormUrlEncoded
    @POST("UserPostGetByUser")
    Call<List<LatestPosts>> getUserPosts(
            @Field("UserId") String userId
    );

    @FormUrlEncoded
    @POST("ADUserPostGetByCity")
    Call<List<LatestPosts>> getPostsByCity(
            @Field("CityId") String userId
    );

    @POST("ADUserPostGetByCity")
    Call<List<LatestPosts>> getUserPostsByCity(
            @Query("CityId") String cityId
    );


    @GET("ADUserGetByAwardByTop10")
    Call <ArrayList<TopHelpers>> getTopHelpersOfDay();

    @FormUrlEncoded
    @POST("MessageGetByToUserId")
    Call<List<UserMessage>> getUserMessageByToUserId(
            @Field("ToUserId") String toUserId
    );



    @FormUrlEncoded
    @POST("UserInterestGetByUserId")
    Call <List<UserInterest>> getUserInterestsById(
            @Field("UserId") String toUserId
    );


    @FormUrlEncoded
    @POST("NotificationGetByToUserId")
    Call <List<UserNotification>> getUserNotification(
            @Field("ToUserId") String toUserId
    );




    @FormUrlEncoded
    @POST("MessageGetByFromUserIdByToUserId")
    Call <ArrayList<ChatPojo>> getChatMessage(
            @Field("ToUserId") int toUserId,
            @Field("FromUserId") int fromUserId
    );




    @FormUrlEncoded
    @POST("UserGetByCityByInterest")
    Call <List<ProfileInfo>> getUserList(
            @Field("CityId") String cityId,
            @Field("InterestId") String inerestId
    );


    @FormUrlEncoded
    @POST("ADUserPostGetByCityByInterest")
    Call <List<LatestPosts>> getPostList(
            @Field("UserId") int userId

    );


    @FormUrlEncoded
    @POST("UserGetBySearch")
    Call <List<UserDetailNew>> searchUsers(
            @Field("FirstName") String searchKey
    );

    @FormUrlEncoded
    @POST("FriendRequestSave")
    Call <String> sendFriendReq(@Field("FromUserId") String fromUserId,
                                @Field("ToUserId") String toUserId,
                                @Field("Status") String status,
                                @Field("FriendRequestId") String friendRequestId);

    @FormUrlEncoded
    @POST("FriendRequestStatusUpdate")
    Call <String> updateRequest(
            @Field("FromUserId") String fromUserId,
            @Field("ToUserId") String toUserId,
            @Field("Status") String status
    );

    @FormUrlEncoded
    @POST("FriendRequestGetByToUserId")
    Call <List<FriendRequestData>> getFriendList(
            @Field("ToUserId") String userId
    );


    @FormUrlEncoded
    @POST("FriendRequestGetByFriend")
    Call <List<FriendRequestData>> getFriendListAccpted(
            @Field("ToUserId") String userId
    );

    @GET("VersionGetByAll")
    Call<ArrayList<VersionApp>> checkVersion();

    @FormUrlEncoded
    @POST("MessageGetByFromUserId")
    Call<List<UserMessage>> getUserMessageByFromUserId(
            @Field("FromUserId") String toUserId
    );

    @FormUrlEncoded
    @POST("AwardCheckExist")
    Call<String> saveAwardCheck(@Field("FromUserId") String fromUserId,
                                @Field("ToUserId") String toUserId);

    @FormUrlEncoded
    @POST("FriendRequestCheckExist")
    Call<String> friendRequestCheck(@Field("FromUserId") String fromUserId,
                                    @Field("ToUserId") String toUserId);

    @FormUrlEncoded
    @POST("CommentSave")
    Call<String> commentSave(@Field("UserId") String userId,
                             @Field("UserPostId") String postId,
                             @Field("CommentMsg") String commentMessage);


    @FormUrlEncoded
    @POST("CommentGetByPost")
    Call<List<Comment>> getCommentsByPost(
            @Field("UserPostId") String postId
    );



    @FormUrlEncoded
    @POST("UserInterestDelete")
    Call<String> deleteInterest(@Field("UserId") String userId,
                                @Field("InterestId") String interestId
    );

    @FormUrlEncoded
    @POST("UIGetOtp")
    Call<String> sendOTP(@Field("EmailId") String emailID
    );

    @FormUrlEncoded
    @POST("UserUpdatePassword")
    Call<String> resetPassword(@Field("EmailId") String email,
                               @Field("Password") String password

    );

    @FormUrlEncoded
    @POST("FriendRequestDelete")
    Call<String> unFriend(@Field("FromUserId") String fromUserId,
                          @Field("ToUserId") String toUSerID

    );*/
}
