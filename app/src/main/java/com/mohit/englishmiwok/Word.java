package com.mohit.englishmiwok;

public class Word {

    private String  mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){

        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId, int audioResourceId){

        mDefaultTranslation=defaultTranslation;
        mAudioResourceId=audioResourceId;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResourceId(){return  mAudioResourceId;}

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
