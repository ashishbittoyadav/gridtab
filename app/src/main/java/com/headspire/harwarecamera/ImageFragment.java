package com.headspire.harwarecamera;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;





/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment implements View.OnClickListener{

    private FrameLayout containerfragment;
    private ImageView harley1;
    private ImageView harley2;
    private ImageView harley3;
    private ImageView water;

    public ImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        containerfragment=view.findViewById(R.id.containerfragment);
        harley1=view.findViewById(R.id.harley1);
        harley2=view.findViewById(R.id.harley2);
        harley3=view.findViewById(R.id.harley3);
        water=view.findViewById(R.id.water);
        harley3.setOnClickListener(this);
        harley2.setOnClickListener(this);
        harley1.setOnClickListener(this);
        water.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.harley1:
                containerfragment.setBackgroundResource(R.drawable.harleydavidson);
                break;
            case R.id.harley2:
                containerfragment.setBackgroundResource(R.drawable.harleydavidson2);
                break;
            case R.id.harley3:
                containerfragment.setBackgroundResource(R.drawable.large);
                break;
            case R.id.water:
                containerfragment.setBackgroundResource(R.drawable.download);
                break;
        }
    }
}
