package com.rodolfo.superhero

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*

class HeroAdapter(val superhero:List<SuperHero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }


    class HeroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun render(superhero: SuperHero) {
            view.tvRealName.text = superhero.realName
            view.tvSuperHeroName.text = superhero.superhero //aqui puede haber un error
            view.tvPublisher.text = superhero.publisher
            Picasso.get().load(superhero.image).into(view.ivHero)
        }
    }
}
