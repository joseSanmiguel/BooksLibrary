package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LibroClickListener
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        misPhotos()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = cardAdapter(libroList, this@MainActivity)
        }
    }

    override fun onClick(libro: libro) {
        val intent = Intent(applicationContext,DetailActivity::class.java).apply {
            putExtra(LIBRO_ID_EXTRA, libro.id)}
        startActivity(intent)
    }

    private fun misPhotos() {
        val libro1 = libro(
            R.drawable.one,
            title = "magna",
            description = "Lorem",
            notes = "Mauris magna justo, ornare in tellus sit amet, tempor maximus est. Curabitur diam dolor, feugiat id pretium non, auctor at tellus. Quisque mollis rutrum ligula, et vestibulum urna finibus et. Curabitur tempor mauris et malesuada rhoncus. In viverra tincidunt justo, non eleifend nisl facilisis sed. Nunc efficitur tempor lorem ut facilisis. Aliquam tempus elit a aliquet gravida. Sed ante neque, finibus nec mattis eu, interdum ut leo. Donec dui diam, ullamcorper a turpis sed, volutpat vestibulum quam."
        )
        libroList.add(libro1)

        val libro2 = libro(
            R.drawable.two,
            title = "Morbi",
            description = "ipsum",
            notes = "Morbi sollicitudin, dolor vitae laoreet venenatis, ex nisl vestibulum mi, consequat elementum augue augue ac enim. Aenean pretium convallis ligula vitae aliquet. Vivamus eu posuere urna. Aenean non augue sagittis neque consequat dictum. Nullam fringilla laoreet placerat. Sed ornare mi quis tellus ultrices luctus. Vestibulum porttitor vel sapien id malesuada. Ut quis nibh at felis placerat egestas eu ac quam. Duis aliquam suscipit lacus eu luctus. Donec id rutrum mauris, vitae egestas nulla. Sed non sapien dignissim, lacinia libero vel, aliquam turpis. Suspendisse ut erat sed nunc lobortis vehicula. Pellentesque dapibus, metus nec suscipit suscipit, risus sem sollicitudin dui, eu aliquet dui nisl euismod erat. Phasellus id pretium turpis."
        )
        libroList.add(libro2)

        val libro3 = libro(
            R.drawable.three,
            title = "Lorem",
            description = "dolor",
            notes = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec elit lorem, sodales quis tellus eget, convallis sodales eros. Sed porttitor quam arcu, vel tristique purus ultricies non. Nulla venenatis, elit vel congue consectetur, dolor ex malesuada urna, in semper mauris lectus vitae orci. Fusce pellentesque ante sit amet ante congue, quis bibendum nisi feugiat. Nulla facilisi. Morbi ultrices justo ut ultrices hendrerit. Sed at lorem id metus convallis luctus. Nulla sodales augue nulla, vulputate scelerisque eros varius porta. Cras in porta dui, at vehicula quam. Sed quis rhoncus velit. Maecenas quam felis, semper ac pulvinar ac, mattis vel turpis. Aliquam ac est sed eros sagittis ullamcorper."
        )
        libroList.add(libro3)

        val libro4 = libro(
            R.drawable.four,
            title = "Nunc",
            description = "dapibus",
            notes = "Nunc dapibus, nulla id iaculis elementum, felis turpis pellentesque odio, eget placerat risus mi nec enim. Donec ut turpis orci. Etiam eget tincidunt tellus. Morbi porttitor velit ac ornare pharetra. Aliquam rutrum ut leo ut pellentesque. In quis diam posuere, consequat mi sed, laoreet nunc. Cras eu efficitur quam, vel dignissim enim. Vestibulum ultricies magna a nunc faucibus iaculis. Sed dapibus, justo id laoreet gravida, neque sapien lacinia risus, et consequat metus orci vitae massa. Phasellus feugiat condimentum tellus quis tempor."
        )
        libroList.add(libro4)

        val libro5 = libro(
            R.drawable.five,
            title = "Vestibulum",
            description = "vel",
            notes = "Vestibulum vel diam quam. Phasellus rhoncus accumsan sapien, id ullamcorper lacus cursus ut. Curabitur vitae turpis maximus, bibendum neque sed, imperdiet augue. Donec sodales dapibus dolor, ut vestibulum massa egestas ut. Nullam posuere nibh non justo commodo, ut eleifend odio accumsan. Maecenas vitae libero ornare, elementum sapien nec, vehicula erat. Sed aliquam felis a sem congue tempor. Quisque vitae porttitor justo."
        )
        libroList.add(libro5)

        val libro6 = libro(
            R.drawable.six,
            title = "Proin",
            description = "fringilla",
            notes = "Proin fringilla, urna nec venenatis efficitur, orci urna consectetur arcu, nec ullamcorper libero ante eu ligula. Interdum et malesuada fames ac ante ipsum primis in faucibus. Praesent porttitor a tellus eu vehicula. Morbi hendrerit scelerisque turpis vel ullamcorper. Sed aliquam, erat ut placerat rhoncus, nisi sapien euismod lectus, ac viverra ante nibh ac diam. Quisque ultricies, dui sed cursus porta, est leo consectetur sapien, id facilisis neque est ultricies eros. Phasellus auctor sagittis cursus. Pellentesque rhoncus ante nunc, feugiat ullamcorper nisi molestie porta. Aenean posuere, sem id gravida blandit, elit mauris auctor ex, et commodo metus metus eget ante. Vestibulum lectus erat, posuere ut tortor sit amet, molestie consectetur quam. Nullam non laoreet tortor. Etiam fringilla est quis leo luctus mollis. Mauris sit amet magna a elit mattis porttitor feugiat non quam. Nam ante est, viverra gravida sollicitudin non, rhoncus in quam. Duis tempor viverra erat, sed gravida ipsum dignissim id. Maecenas accumsan mi in aliquam ornare."
        )
        libroList.add(libro6)

        val libro7 = libro(
            R.drawable.seven,
            title = "Vivamus",
            description = "mi dragon",
            notes = "Vivamus blandit, justo in fringilla ornare, lorem arcu pharetra nisl, in viverra ligula neque sed est. Nullam molestie, sapien vitae congue vehicula, odio est volutpat enim, ut dapibus massa nisl sit amet risus. Fusce erat dui, blandit sit amet magna ut, tristique sodales turpis. Aliquam viverra velit a dictum placerat. Nullam ut maximus ipsum, eget porta sapien. Donec at mollis nulla. Etiam a mollis metus, non tincidunt risus. Suspendisse aliquam mauris et rhoncus venenatis. Integer sodales justo eget pulvinar pulvinar. Vivamus nec accumsan risus, sed aliquet ante."
        )
        libroList.add(libro7)

        val libro8 = libro(
            R.drawable.eight,
            title = "Nulla",
            description = "arcu urna",
            notes = "Nulla arcu urna, cursus a ante eget, vulputate tempor urna. Nam congue rhoncus leo, non porttitor sem pharetra lobortis. Vestibulum iaculis magna eu nulla eleifend, quis hendrerit odio consequat. In quis tortor non mauris tempor interdum. Nunc lobortis nisi id sem luctus, non faucibus augue mattis. Aliquam et leo hendrerit, euismod lectus eget, pellentesque ipsum. Nam gravida leo erat, quis vestibulum ipsum dignissim et. Vestibulum velit neque, elementum et tortor sed, consectetur scelerisque nisi. Nam risus orci, rutrum varius placerat eu, congue at orci. Vestibulum arcu turpis, dapibus efficitur dui congue, cursus elementum enim."
        )
        libroList.add(libro8)

        val libro9 = libro(
            R.drawable.nine,
            title = "quis",
            description = "congue nunc",
            notes = "Praesent quis congue nunc. Sed dignissim ex eu dignissim ultricies. Aenean tempus suscipit quam, sed aliquet nunc molestie eget. Nullam magna eros, rutrum non leo at, bibendum commodo elit. Aenean varius magna non felis efficitur, a hendrerit quam interdum. Etiam varius accumsan sapien sed laoreet. Donec non sem ante. Integer dapibus magna a erat posuere, nec facilisis neque tristique. Donec varius nulla et eros pellentesque malesuada vitae et nibh. Sed elementum nisi vel erat bibendum, vitae ultricies eros commodo. Nunc non lobortis dolor. Donec congue, ipsum sit amet lobortis elementum, metus erat lacinia felis, eget facilisis urna tellus vestibulum mauris. Integer dapibus accumsan ex, id vestibulum enim pretium sed. Quisque commodo libero sem, nec tincidunt eros maximus vel. Donec placerat libero eget risus pulvinar, id lacinia sapien sodales."
        )
        libroList.add(libro9)

        val libro10 = libro(
            R.drawable.ten,
            title = "mia",
            description = "Praesent bibendum",
            notes = "Donec eget elementum nisi. Praesent bibendum mattis nulla, et tincidunt est ornare eget. Donec ut est vel lacus fringilla viverra eu eget ex. Quisque facilisis tempor nisi vestibulum elementum. Duis quis nunc massa. Vivamus lorem nibh, tempor aliquet rutrum a, vestibulum eget tortor. Etiam mollis nunc nec sem faucibus, quis eleifend tortor tincidunt. In erat turpis, cursus eu tempus quis, posuere in augue. Sed nulla magna, laoreet et arcu at, tristique ornare quam. Suspendisse ut erat ex. Aenean at rutrum velit. Integer viverra dapibus ante, ac pulvinar lacus aliquet sed. Aenean in rutrum ipsum."
        )
        libroList.add(libro10)

        val libro11 = libro(
            R.drawable.eleven,
            title = "Praesent",
            description = "hendrerit",
            notes = "Praesent hendrerit dapibus pellentesque. Nam purus enim, porttitor et tortor pretium, cursus posuere lorem. Curabitur eu eros quis eros rutrum tempus cursus a elit. Nunc at odio maximus, condimentum turpis lacinia, ultricies tellus. Fusce convallis ante ipsum, non suscipit eros iaculis ac. Nullam consequat arcu eros. Vivamus tristique, metus non convallis molestie, velit massa ultrices lectus, eu commodo diam ligula nec leo. In at libero odio. Nulla facilisi. Nunc non malesuada nibh. Quisque vitae bibendum massa. Praesent id interdum turpis."
        )
        libroList.add(libro11)

    }

}


