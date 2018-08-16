package com.codenicely.brandstore.project.shop_admin.shop_add_offer.api;

import com.codenicely.brandstore.project.helper.Urls;
import com.codenicely.brandstore.project.shop_admin.shop_add_offer.data.OfferAddData;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Observable;

/**
 * Created by ujjwal on 12/5/17.
 */
public interface OfferAddApi {


	@Multipart
	@POST(Urls.OFFER_ADD)
	Observable<OfferAddData> requestOfferAdd(
		@Part("shop_access_token") RequestBody shop_name,
		@Part("offer_title") RequestBody offer_name,
		@Part("offer_description") RequestBody description,
		@Part("date") RequestBody date,
		@Part("month") RequestBody month,
		@Part("year") RequestBody year,
		@Part MultipartBody.Part offer_image);

}
