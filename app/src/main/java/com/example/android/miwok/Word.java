package com.example.android.miwok;

/**
 * Created by Tiberius on 2/11/18.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwork translation for the word */
    private String mMiwokTranslation;

    /** Resource ID for the image */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Resource ID for the sound */
    private int mAudioResourceId;


    /**
     *
     * @param defaultTranslation - default translation text
     * @param miwokTranslation - miwok text
     * @param audioResourceId - resource id for corresponding sound
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }


    /**
     *
     * @param defaultTranslation - default translation text
     * @param miwokTranslation - miwok text
     * @param imageResourceId - resource id for corresponding image
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = soundResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get resource id
     */
    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get sound id
     */

    public int getAudioResourceId() { return mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}


