package com.ajc.life;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
/*
private final String TAG = FirstFragment.class.getSimpleName();
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach");
    }
 */

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("TAG", "onAttach - FirstFragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate - FirstFragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("TAG", "onActivityCreated - FirstFragment");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d("TAG", "onViewStateRestored - FirstFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("TAG", "onCreateView - FirstFragment");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("TAG", "onViewCreated - FirstFragment");
        //initView() ; //here we are init ing views -> find viewbyid
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG", "onStart - FirstFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG", "onResume - FirstFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG", "onPause - FirstFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG", "onStop - FirstFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG", "onDestroyView - FirstFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy - FirstFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG", "onDetach - FirstFragment");
    }

}