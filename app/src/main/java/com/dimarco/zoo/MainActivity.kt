package com.dimarco.zoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.animal_ticket.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal_ticket)
    }

    // goes to the animal specific pages
    fun clickAnimal(view: View) {
        when (view.id) {
            R.id.llBaboon -> setContentView(R.layout.baboon)
            R.id.llBulldog -> setContentView(R.layout.bulldog)
            R.id.llPanda -> setContentView(R.layout.panda)
            R.id.llSwallow -> setContentView(R.layout.swallow)
            R.id.llTiger -> setContentView(R.layout.tiger)
            R.id.llZebra -> setContentView(R.layout.zebra)
        }
    }

    // goes back to list view of all animals
    fun clickBack(view: View) {
        setContentView(R.layout.animal_ticket)
    }

    fun clickDelete(view: View) {
        // TODO : implement
    }

    fun clickAdd(view: View) {
        // TODO : implement
    }
}
