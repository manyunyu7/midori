package com.manyunyu7.manyunyu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.manyunyu7.customview.SearchLangDialogFragment
import com.manyunyu7.customview.SearchLangDialogFragmentInterface
import com.manyunyu7.lib.LibDebug.Builder.i
import com.manyunyu7.lib.databinding.ManyunyuSearchModalBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        i("holla")

        val searchModal = SearchLangDialogFragment()
        searchModal.show(supportFragmentManager,"mytag")
        searchModal.setDialogInterface(object :SearchLangDialogFragmentInterface{
            override fun getBinding(binding: ManyunyuSearchModalBinding) {
                binding.btnYes.setOnClickListener {
                    Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
                }
            }
        })


    }
}
