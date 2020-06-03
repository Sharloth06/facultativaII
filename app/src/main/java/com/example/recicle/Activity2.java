package com.example.recicle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Intent;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {
    TextView mTitleView, mDescripView, mProfview, mDiaview, mHoraview, mFechaview;
    ImageView mImagenView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        ActionBar actionBar=getSupportActionBar();

        mTitleView=findViewById(R.id.title_view);
        mDescripView =findViewById(R.id.descripcion_view);
        mImagenView =findViewById(R.id.image_view);
        mProfview =findViewById(R.id.profesor_view);
        mDiaview=findViewById(R.id.dia_view);
        mHoraview=findViewById(R.id.hora_view);
        mFechaview =findViewById(R.id.fecha_view);

        Intent intent=getIntent();
        String mTitle=intent.getStringExtra("iTitle");
        String mDes=intent.getStringExtra("iDesc");
        String mPro=intent.getStringExtra("iProfesor");
        String mDi=intent.getStringExtra("iDia");
        String mHor=intent.getStringExtra("iHora");
        String mFechen=intent.getStringExtra("iFecha");

        byte[] mBytes=getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap=BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);
        mTitleView.setText(mTitle);
        mDescripView.setText(mDes);
        mImagenView.setImageBitmap(bitmap);
        mProfview.setText(mPro);
        mDiaview.setText(mDi);
        mHoraview.setText(mHor);
        mFechaview.setText(mFechen);


    }

}
