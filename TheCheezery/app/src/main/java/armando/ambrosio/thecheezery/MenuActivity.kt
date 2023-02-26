package armando.ambrosio.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var type: String

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button

        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button

        var btnSalty: Button = findViewById(R.id.button_salties) as Button

        var btnSweet: Button = findViewById(R.id.button_sweets) as Button

        var btnCombos: Button = findViewById(R.id.button_combos) as Button

        var btnCustom: Button = findViewById(R.id.button_custom) as Button

        btnCold.setOnClickListener{
            type = "cold"
            var intent: Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnHot.setOnClickListener{
            type = "hot"
            var intent: Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnSalty.setOnClickListener{
            type = "salty"
            var intent: Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnSweet.setOnClickListener{
            type = "sweet"
            var intent: Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnCombos.setOnClickListener{
            type = "combo"
            var intent: Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

        btnCustom.setOnClickListener{
            type = "custom"
            var intent: Intent = Intent(this,ProductsActivity::class.java)
            intent.putExtra("type", type)
            startActivity(intent)
        }

    }
}