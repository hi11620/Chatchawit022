package com.example.chatchawit022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        btn_ayutthaya.setOnClickListener(View.OnClickListener {
            img_img.setImageDrawable(getDrawable(R.drawable.ayutthaya))
            text__J.setText("คำขวัญจังหวัด"+getString(R.string.btn_ayutthaya))
            text_c.setText(getString(R.string.content_ayutthaya))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_ayutthaya),Toast.LENGTH_LONG).show()
        })

        btn_buri.setOnClickListener(View.OnClickListener {
            img_img.setImageDrawable(getDrawable(R.drawable.chon_buri_img))
            text__J.setText("คำขวัญจังหวัด"+getString(R.string.btn_buri))
            text_c.setText(getString(R.string.content_buri))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_buri),Toast.LENGTH_LONG).show()
        })
        btn_nan.setOnClickListener(View.OnClickListener {
            img_img.setImageDrawable(getDrawable(R.drawable.nan_img))
            text__J.setText("คำขวัญจังหวัด"+getString(R.string.btn_nan))
            text_c.setText(getString(R.string.content_nan))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_nan),Toast.LENGTH_LONG).show()
        })
        btn_Thammarat.setOnClickListener(View.OnClickListener {
            img_img.setImageDrawable(getDrawable(R.drawable.thammarat__img))
            text__J.setText("คำขวัญจังหวัด"+getString(R.string.btn_Thammarat))
            text_c.setText(getString(R.string.content_Thammarat))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_Thammarat),Toast.LENGTH_LONG).show()
        })
    }
}
