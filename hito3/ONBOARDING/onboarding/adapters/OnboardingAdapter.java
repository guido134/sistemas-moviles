package com.example.onboarding.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.onboarding.onboarding.FaceDetectionFragment;
import com.example.onboarding.onboarding.TextRecognitionFragment;
import com.example.onboarding.onboarding.WelcomeFragment;

public class OnboardingAdapter extends FragmentPagerAdapter {

   /*constructor*/
    public OnboardingAdapter(FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WelcomeFragment();
            case 1:
                return new FaceDetectionFragment();
            case 2:
                return new TextRecognitionFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
