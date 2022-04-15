package developer.abdusamid.foodapp

import Cacher.MySharedPreference
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_food.*

class AboutFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_food)

        supportActionBar?.hide()

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString

        val positions = intent.getIntExtra("position", 0)

        txt_name.text = list[positions].name

        txt_food_product.text = list[positions].ingredient

        txt_preparation_order.text = list[positions].preparationOrder
    }
}