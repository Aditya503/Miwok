package com.example.android.miwok;

/**
 * Created by Anusha on 8/11/2016.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    private int mMediaResourceId;

    //to hide image view
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String DefaultTransition,String MiwokTransition,int MediaResourceId)
    {
        mDefaultTranslation = DefaultTransition;
        mMiwokTranslation = MiwokTransition;
        mMediaResourceId = MediaResourceId;

    }

    public Word(String DefaultTransition,String MiwokTransition,int ImageResourceId,int MediaResourceId)
    {
        mDefaultTranslation = DefaultTransition;
        mMiwokTranslation = MiwokTransition;
        mImageResourceId = ImageResourceId;
        mMediaResourceId = MediaResourceId;
    }



    public String getMiwokTranslation()
    {
       return  mMiwokTranslation;
    }
    public String getDefaultTranslation()
    {
        return  mDefaultTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getMediaResourceId(){return mMediaResourceId;}

    //METHOD TO DETERMINE IF VIEW HAS AN IMAGE
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
