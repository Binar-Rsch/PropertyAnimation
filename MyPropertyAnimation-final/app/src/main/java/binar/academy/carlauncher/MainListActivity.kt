package binar.academy.carlauncher

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import binar.academy.carlauncher.animationactivities.*
import java.util.*

class MainListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        val recyclerView = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)

        val items = ArrayList<CarAnimationItem>()

        items.add(CarAnimationItem(getString(R.string.title_no_animation),
                Intent(this, NoAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_launch_car),
                Intent(this, LaunchCarValueAnimatorAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_spin_car),
                Intent(this, RotateCarAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_accelerate_car),
                Intent(this, AccelerateCarAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_launch_car_objectanimator),
                Intent(this, LaunchCarObjectAnimatorAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_color_animation),
                Intent(this, ColorAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.launch_spin),
                Intent(this, LaunchAndSpinAnimatorSetAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.launch_spin_viewpropertyanimator),
                Intent(this, LaunchAndSpinViewPropertyAnimatorAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_with_logo),
                Intent(this, FlyWithLogoAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_animation_events),
                Intent(this, WithListenerAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_there_and_back),
                Intent(this, FlyAndBackAnimationActivity::class.java)))

        items.add(CarAnimationItem(getString(R.string.title_jump_and_blink),
                Intent(this, XmlAnimationActivity::class.java)))

        recyclerView.adapter = CarAdapter(this, items)
    }
}
