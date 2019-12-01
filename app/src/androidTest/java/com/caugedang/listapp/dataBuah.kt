package com.caugedang.listapp

object dataBuah {
    private val namaBuah = arrayOf(
        "Nanas",
        "Semangka",
        "Melon",
        "Rambutan",
        "Durian",
        "Jambu Air",
        "Markisa",
        "Jeruk",
        "Anggur",
        "Pepaya",
        "Salak",
        "Pisang"
    )

    private val detailBuah = arrayOf(
        "Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae).",
        "Semangka atau tembikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan.",
        "Melon (Cucumis melo L.) merupakan nama buah sekaligus tanaman yang menghasilkannya, yang termasuk dalam suku labu-labuan atau Cucurbitaceae.",
        "Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut.",
        "Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri.",
        "Jambu air adalah tumbuhan dalam suku jambu-jambuan atau Myrtaceae yang berasal dari Asia Tenggara. Jambu air sebetulnya berbeda dengan jambu semarang (Syzygium samarangense), kerabat dekatnya yang memiliki pohon dan buah hampir serupa.",
        "Markisa tergolong ke dalam tanaman genus Passiflora, berasal dari daerah tropis dan sub tropis di Amerika. Buah ini berbentuk bulat dan mempunyai biji berselaput kuning.",
        "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis.",
        "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae.[1] Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung.",
        "Pepaya (Carica papaya L.), atau betik adalah tumbuhan yang berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya. ",
        "Salak adalah sejenis palma dengan buah yang biasa dimakan. Ia dikenal juga sebagai sala (Min., Mak., Bug.,[1] dan Thai). Dalam bahasa Inggris disebut salak atau snake fruit, sementara nama ilmiahnya adalah Salacca zalacca.",
        "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar memanjang dari suku Musaceae. Beberapa jenisnya (Musa acuminata, M. balbisiana, dan M. ×paradisiaca) menghasilkan buah konsumsi yang dinamakan sama."
    )

    private val gambarBuah = intArrayOf(
        R.drawable.anggur,
        R.drawable.durian,
        R.drawable.jambu,
        R.drawable.jeruk,
        R.drawable.markisa,
        R.drawable.melon,
        R.drawable.nanas,
        R.drawable.pepaya,
        R.drawable.pisang,
        R.drawable.rambutan,
        R.drawable.salak,
        R.drawable.semangka)

    val listData: ArrayList<buah>
        get() {
            val list = arrayListOf<buah>()
            for(position in namaBuah.indices){
                val databuah = buah()
                databuah.nama_buah = namaBuah[position]
                databuah.detail_buah = detailBuah[position]
                databuah.photo = gambarBuah[position]
                list.add(databuah)
            }
            return list
        }

}