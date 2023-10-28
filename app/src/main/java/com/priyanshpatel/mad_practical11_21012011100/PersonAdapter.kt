package com.priyanshpatel.mad_practical11_21012011100

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PersonAdapter( val context: Context,val personArray:ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersonViewHolder>()

{
    inner class PersonViewHolder(val view:View):ViewHolder(view)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personArray.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
       val view = holder.view
        val contact=personArray.get(position)

        view.findViewById<TextView>(R.id.person_name).text = contact?.name
        view.findViewById<TextView>(R.id.personnumber).text = contact?.phoneNo
        view.findViewById<TextView>(R.id.personemail).text = contact?.emailId
        view.findViewById<TextView>(R.id.personaddress).text = contact?.address
        val button1: Button = view.findViewById(R.id.locationBtn)
        button1.setOnClickListener {
            // Start the MapsActivity when button1 is clicked
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }

    }
}