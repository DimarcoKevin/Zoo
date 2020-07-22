package com.dimarco.zoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.animal_ticket.*
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
        // TODO : fix this delete button, it deletes one and then when you delete another the first one returns
        setContentView(R.layout.animal_ticket)
        val ll = findViewById<LinearLayout>(R.id.ll)!!

        when (view.id) {
            R.id.btnDeleteBaboon -> ll.removeView(llBaboon)
            R.id.btnDeleteBulldog  -> ll.removeView(llBulldog)
            R.id.btnDeletePanda  -> ll.removeView(llPanda)
            R.id.btnDeleteSwallow  -> ll.removeView(llSwallow)
            R.id.btnDeleteTiger  -> ll.removeView(llTiger)
            R.id.btnDeleteZebra  -> ll.removeView(llZebra)
        }

    }

    fun clickAdd(view: View) {
        setContentView(R.layout.add_animal)
    }
}
