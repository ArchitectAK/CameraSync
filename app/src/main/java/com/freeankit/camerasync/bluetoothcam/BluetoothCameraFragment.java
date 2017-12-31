package com.freeankit.camerasync.bluetoothcam;

import android.bluetooth.BluetoothAdapter;
import android.hardware.Camera;
import android.support.v4.app.Fragment;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author by Ankit Kumar (ankitdroiddeveloper@gmail.com) on 12/30/17 (MM/DD/YYYY )
 **/

public class BluetoothCameraFragment extends Fragment implements SurfaceHolder.Callback, Camera.PreviewCallback {


    TextView testView;
    Camera camera;
    SurfaceView surfaceView;
    SurfaceView surfaceView2;
    SurfaceHolder surfaceHolder;
    SurfaceHolder surfaceHolder2;
    Camera.PictureCallback rawCallback;
    Camera.ShutterCallback shutterCallback;
    Camera.PictureCallback jpegCallback;
    private final String tag = "tagg";

    Button start, stop, capture;

    private static final String TAG = "BluetoothCamera";


    private static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    private static final int REQUEST_CONNECT_DEVICE_INSECURE = 2;
    private static final int REQUEST_ENABLE_BT = 3;


    private ListView mConversationView;
    private EditText mOutEditText;
    private Button mSendButton;
    private ImageView imageview;


    private String mConnectedDeviceName = null;


    private ArrayAdapter<String> mConversationArrayAdapter;


    private StringBuffer mOutStringBuffer;


    private BluetoothAdapter mBluetoothAdapter = null;


    private BluetoothCameraManager mCameraService = null;
    private boolean isCameraRunning = false;

    @Override
    public void onPreviewFrame(byte[] bytes, Camera camera) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
