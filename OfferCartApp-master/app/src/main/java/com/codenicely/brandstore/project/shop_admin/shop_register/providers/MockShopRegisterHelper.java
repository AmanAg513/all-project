package com.codenicely.brandstore.project.shop_admin.shop_register.providers;

import android.net.Uri;

import com.codenicely.brandstore.project.shop_admin.shop_register.OnCitiesReceived;
import com.codenicely.brandstore.project.shop_admin.shop_register.OnPreRegistrationApiResponse;
import com.codenicely.brandstore.project.shop_admin.shop_register.data.ShopRegisterData;

import java.io.IOException;

import rx.Observable;

/**
 * Created by meghal on 11/10/16.
 */

public class MockShopRegisterHelper implements ShopRegisterHelper {

    @Override
    public Observable<ShopRegisterData> registerShop(String name, String mobile, String password, String description, String address, String category, String city,Double latitude,Double longitude, Uri imageUri) throws IOException {
        return null;
    }

    @Override
    public void requestPreRegistrationDetails(OnPreRegistrationApiResponse onPreRegistrationApiResponse) {
        // do nothing
    }

    @Override
    public void requestCityList(int state_id, OnCitiesReceived onCitiesReceived) {

    }

}
