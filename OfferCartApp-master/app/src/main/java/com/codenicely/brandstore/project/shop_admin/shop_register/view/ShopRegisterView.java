package com.codenicely.brandstore.project.shop_admin.shop_register.view;

import com.codenicely.brandstore.project.city.data.CityDetails;
import com.codenicely.brandstore.project.shop_admin.shop_register.data.ShopPreRegistrationData;

import java.util.List;

/**
 * Created by meghal on 11/10/16.
 */

public interface ShopRegisterView {


    void showLoader(boolean show);

    void showDialogLoader(boolean show);

    void showMessage(String message);

    void onCitiesRecieved(List<CityDetails> cityDataList);
    /**
     * This method is for checking camera permission.
     * Applicable only for devices with Api 23 or more.
     *
     * @return
     */
    boolean checkPermissionForCamera();

    /**
     * This method is for checking gallery permission.
     * Applicable only for devices with api 23 or more.
     *
     * @return
     */
    boolean checkPermissionForGallery();

    /**
     * This function is for requesting camera permission if user does'nt have taken permission
     * previously.
     *
     * @return
     */
    boolean requestCameraPermission();

    /**
     * This function is for requesting gallery permission if user does'nt have taken permission
     * previously.
     *
     * @return
     */
    boolean requestGalleryPermission();


    /**
     * This method is called when user chooses to open camera.
     */
    void showCamera();

    /**
     * This method is called when user chooses to open gallery.
     */

    void showGallery();

    void fileFromPath(String filePath);

    void showDialog(String title, String message);

    void setPreRegistrationData(ShopPreRegistrationData shopPreRegistrationData);

    void onRegistrationSuccess();
}
