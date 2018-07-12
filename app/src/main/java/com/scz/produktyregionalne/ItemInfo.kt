package com.scz.produktyregionalne

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_item_info.*


class ItemInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_info)

        val name_string = intent.getStringExtra("name")
        val whichImage = intent.getStringExtra("image")

        name.text = name_string
        main_info.text = "Produkt wpisany na listę produktów tradycyjnych w dniu 2011-08-25 w kategorii produkty mięsne w woj. dolnośląskim"

        val list = description()
        wyglad.text = list[0]
        ksztalt.text = list[1]
        rozmiar.text = list[2]
        barwa.text = list[3]
        konsystencja.text = list[4]
        smak.text = list[5]


        var id: Int = this.resources.getIdentifier(whichImage, "drawable", this.packageName)
        if (id == 0) {
            id = this.resources.getIdentifier("ic_photo_black_24dp", "drawable", this.packageName)
            image?.setImageResource(id)
        } else {
            image?.setImageResource(id)
        }
    }

    private fun description(): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()

        list.add("Farsz ściśle przylegający do naturalnej osłonki. W przekroju widoczna galaretka oraz niewielkie kawałki tłuszczu.")
        list.add("Pętka z naturalnych jelit, na przekroju okrągłe. Końcówki zamknięte drewnianą szpilką.")
        list.add("Długość batonu w kiełbaśnicach wynosi od 25 cm do 30 cm. Średnica wędliny mieści się w granicach od około 2,5 cm do 3 cm. Waga pojedynczego pęta wynosi od 0,20 dag do 0,25 dag.")
        list.add("Zewnętrzna warstwa batonu jest koloru od jasnobrązowego do brązowego. Po przekrojeniu plastry mają barwę różową, niekiedy z widocznym jasnobrązowym oczkiem. Barwa tłuszczu koloru białego.")
        list.add("Konsystencja – miękka i jędrna. Skórka pomarszczona, widoczne są przez nią ziarna pieprzu oraz kawałki mięsa, średnio rozdrobnione i równomiernie rozmieszone.")
        list.add("Smak charakterystyczny dla kiełbasy wędzonej – z wyraźnym zapachem wędzenia. Smak lekko słony z wyczuwalnym dodatkiem przypraw.")
        list.add("-")
        list.add("Z przeprowadzonych wywiadów etnograficznych wynika, że na Dolnym Śląsku zawód masarza był i jest bardzo ceniony. Według producentów kiełbasy niemczańskiej podstawą sukcesu masarza jest sprawny ubój oraz solidne wykonanie wyrobów, łącznie z ich sparzeniem czy uwędzeniem. Najważniejszą, a zarazem najtrudniejszą sztuką jest takie doprawienie kiełbasy, aby przyprawy były wyczuwalne oraz nadały produktowi niepowtarzalny smak.")

        return list
    }
}
