package com.madhusudan.livedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.madhusudan.livedatademo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this).get(MyViewModel::class.java)

        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).apply {

            this.setLifecycleOwner(this@MainActivity)
            this.mViewModel = model
        }
        
        model.edittextName.observe(this, Observer {
            txtName.text = it
        })
        model.edittextEmail.observe(this, Observer {
            txtEmail.text = it
        })

    }
}
