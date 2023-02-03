package com.qa.pages;

import io.cucumber.java.sl.In;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

import java.util.List;

public class PermissionHandlerPage extends BasePage{
    int imageIndexInGallery = 1;
    int videoIndexInGallery = 2;

    //@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    @FindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public WebElement CameraPermission;

    @FindBy(id="com.android.permissioncontroller:id/permission__message")
    public WebElement CameraPermissionMessage;

    @FindBy(id="com.android.permissioncontroller:id/permission_message")
    public WebElement CameraPermissionMessage2;

    @FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    public WebElement CameraPermission2;

    @FindBy(id="android:id/message")
    public WebElement LocationPermision;

    @FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement permission1;

    @FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    public WebElement permission2;

    @FindBy(id="com.koo.app:id/album_image") //mi specific
    public WebElement videoAlbum;

    @FindBy(id="com.koo.app:id/album_name")
    public WebElement galleryMenu;

    @FindBy(className = "android.widget.TextView")
    public List<WebElement> galleryMenuOptions;

    @FindBy(id="com.koo.app:id/image_gallery_item")
    public WebElement video1;

    @FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
    public WebElement miMobileCamera;

    @FindBy(id="com.koo.app:id/image_gallery_item")
    public List<WebElement> samsungCameraIcon;

    @FindBy(id="com.koo.app:id/btnCapture")
    public WebElement samsungCameraCaptureButton;

    @FindBy(id="com.koo.app:id/image_gallery_item")
    public WebElement samsungCameraGallery;

    @FindBy(id="com.koo.app:id/btnCapture")
    public WebElement cameraScreen;

    @FindBy(id="com.koo.app:id/btn_post")
    public WebElement cropSaveButton;

    @FindBy(id="com.koo.app:id/post_text_view")
    public WebElement kooCreationTextBox;

    @FindBy(id="com.koo.app:id/tv_add_comment_to_this_rekoo")
    public WebElement addACommentToThisRekooPopup;

    @FindBy(id="com.koo.app:id/rekooYes")
    public WebElement addACommentToThisRekooPopupYes;

    @FindBy(id="com.koo.app:id/rekooNo")
    public WebElement addACommentToThisRekooPopupNo;

    public void masterPermissionHandler() throws InterruptedException {
        //this function takes care of permissions being shown in any order, add more permission types to accommodate devices
        int permissioncount = 0;
        try {
            if(isElementPresent(permission1)) {
                waitForVisibility(permission1);
                Assert.assertTrue(isElementPresent(permission1));
                click(permission1);
                permissioncount++;
                Thread.sleep(2000);
            }
            if(isElementPresent(permission2)) {
                waitForVisibility(permission2);
                Assert.assertTrue(isElementPresent(permission2));
                click(permission2);
                permissioncount++;
                Thread.sleep(2000);
            }
            if(isElementPresent(permission1)) {
                waitForVisibility(permission1);
                Assert.assertTrue(isElementPresent(permission1));
                click(permission1);
                permissioncount++;
                Thread.sleep(2000);
            }
            if(isElementPresent(permission2)) {
                waitForVisibility(permission2);
                Assert.assertTrue(isElementPresent(permission2));
                click(permission2);
                permissioncount++;
                Thread.sleep(2000);
            }
            if(isElementPresent(permission1)) {
                waitForVisibility(permission1);
                Assert.assertTrue(isElementPresent(permission1));
                click(permission1);
                permissioncount++;
                Thread.sleep(2000);
            }
            if(isElementPresent(permission2)) {
                waitForVisibility(permission2);
                Assert.assertTrue(isElementPresent(permission2));
                click(permission2);
                permissioncount++;
                Thread.sleep(2000);
            }
        }catch (Exception e) {
            System.out.println("None of the permission types matched ");
            e.getStackTrace();
        }
       // Assert.assertTrue(permissioncount>0); //checking if at least one permission shows up
        return;
    }

    public void chooseVideo(int index) throws InterruptedException {
        try {
            Thread.sleep(3000);
            if (isElementPresent(videoAlbum)) {
                waitForVisibility(videoAlbum);
                Assert.assertTrue(isElementPresent(videoAlbum));
                click(videoAlbum);
                waitForVisibility(video1);
                Assert.assertTrue(isElementPresent(video1));
                click(video1);
            } else if (isElementPresent(samsungCameraIcon.get(index))) {
                Thread.sleep(2000);
                waitForVisibility(samsungCameraIcon.get(index));
                Assert.assertTrue(samsungCameraIcon.get(index).isDisplayed());
                samsungCameraIcon.get(index).click();
            }
        } catch (Exception e) {
            System.out.println("None of the video options matched");

        }


        return;
    }
    public void chooseVideo() throws InterruptedException {
        try {
            Thread.sleep(3000);
            if (isElementPresent(videoAlbum)) {
                waitForVisibility(videoAlbum);
                Assert.assertTrue(isElementPresent(videoAlbum));
                click(videoAlbum);
                waitForVisibility(video1);
                Assert.assertTrue(isElementPresent(video1));
                click(video1);
            } else if (isElementPresent(samsungCameraIcon.get(2))) {
                Thread.sleep(2000);
                waitForVisibility(samsungCameraIcon.get(2));
                Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
                samsungCameraIcon.get(2).click();
            }
        } catch (Exception e) {
            System.out.println("None of the video options matched");

        }


        return;
    }

    public void chooseImage(int index) throws InterruptedException {
        switchToImageAlbum(imageIndexInGallery);
        try {
            Thread.sleep(3000);
            if (isElementPresent(videoAlbum)) {
                waitForVisibility(videoAlbum);
                Assert.assertTrue(isElementPresent(videoAlbum));
                click(videoAlbum);
                waitForVisibility(video1);
                Assert.assertTrue(isElementPresent(video1));
                click(video1);
            } else if (isElementPresent(samsungCameraIcon.get(index))) {
                Thread.sleep(2000);
                waitForVisibility(samsungCameraIcon.get(index));
                Assert.assertTrue(samsungCameraIcon.get(index).isDisplayed());
                samsungCameraIcon.get(index).click();
            }
        } catch (Exception e) {
            System.out.println("None of the video options matched");

        }


        return;
    }

    public void chooseMultipleImages(int startIndex,int numberOfImages) throws InterruptedException {
        switchToImageAlbum(imageIndexInGallery);
            for(int i=startIndex;i<startIndex+numberOfImages;i++)
            {
                    Thread.sleep(3000);
                    if (isElementPresent(videoAlbum)) {
                        waitForVisibility(videoAlbum);
                        Assert.assertTrue(isElementPresent(videoAlbum));
                        click(videoAlbum);
                        waitForVisibility(video1);
                        Assert.assertTrue(isElementPresent(video1));
                        click(video1);
                    } else if (isElementPresent(samsungCameraIcon.get(i))) {
                        Thread.sleep(2000);
                        waitForVisibility(samsungCameraIcon.get(i));
                        Assert.assertTrue(samsungCameraIcon.get(i).isDisplayed());
                        samsungCameraIcon.get(i).click();
                    }
            }
    }
    public void chooseImage() throws InterruptedException {
        switchToImageAlbum(imageIndexInGallery);
        try {
            Thread.sleep(3000);
            if (isElementPresent(videoAlbum)) {
                waitForVisibility(videoAlbum);
                Assert.assertTrue(isElementPresent(videoAlbum));
                click(videoAlbum);
                waitForVisibility(video1);
                Assert.assertTrue(isElementPresent(video1));
                click(video1);
            } else if (isElementPresent(samsungCameraIcon.get(2))) {
                Thread.sleep(2000);
                waitForVisibility(samsungCameraIcon.get(2));
                Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
                samsungCameraIcon.get(2).click();
            }
        } catch (Exception e) {
            System.out.println("None of the video options matched");

        }


        return;
    }

    public void switchToImageAlbum(int index) throws InterruptedException {
        if(isElementPresent(galleryMenu))
        {
            galleryMenu.click();
            Thread.sleep(1000);
            galleryMenuOptions.get(index).click();

        }
        return;
    }

    public void switchToImageAlbum() throws InterruptedException {
        if(isElementPresent(galleryMenu))
        {
            galleryMenu.click();
            Thread.sleep(1000);
            galleryMenuOptions.get(imageIndexInGallery).click();

        }
        return;
    }
    public void saveVideo() throws InterruptedException {
        waitForVisibility(cropSaveButton);
        Assert.assertTrue(isElementPresent(cropSaveButton));
        click(cropSaveButton);
        for(int i=0;i<3;i++) {
            Thread.sleep(10000);
            System.out.println("Waiting for optimization ");
            if(isElementPresent(kooCreationTextBox))
            {
                return;
            }
        }
    }
    public void openCamera() throws InterruptedException {
        Thread.sleep(3000);
        if (isElementPresent(miMobileCamera)) {
            waitForVisibility(miMobileCamera);
            Assert.assertTrue(isElementPresent(miMobileCamera));
            click(miMobileCamera);
            Thread.sleep(2000);

        } else if (isElementPresent(samsungCameraIcon.get(0))) {
            Thread.sleep(2000);
            waitForVisibility(samsungCameraIcon.get(0));
            Assert.assertTrue(samsungCameraIcon.get(0).isDisplayed());
            samsungCameraIcon.get(0).click();
        }
    }

    public void captureImage() throws InterruptedException {
        Thread.sleep(2000);
        if(isElementPresent(samsungCameraCaptureButton)) {
            Assert.assertTrue(isElementPresent(samsungCameraCaptureButton));
            click(samsungCameraCaptureButton);
            Thread.sleep(2000);
        }
        else
        {
            if(isElementPresent(cameraScreen)) {
                Assert.assertTrue(isElementPresent(cameraScreen));
                click(cameraScreen);
            }
        }


    }

    public void dismissRekooCommentPopUp(String option) throws InterruptedException {
        Thread.sleep(2000);
        if(isElementPresent(addACommentToThisRekooPopup)) {
            if(option.equalsIgnoreCase("no")) {
                click(addACommentToThisRekooPopupNo);
            }
            else if(option.equalsIgnoreCase("yes"))
            {
                click(addACommentToThisRekooPopupYes);
            }
            else
            {
                click(addACommentToThisRekooPopupYes);
            }
        }
    }

    public void dismissRekooCommentPopUp() throws InterruptedException {
        Thread.sleep(2000);
        if(isElementPresent(addACommentToThisRekooPopup)) {
            {
                click(addACommentToThisRekooPopupYes);
            }
        }
    }
}
