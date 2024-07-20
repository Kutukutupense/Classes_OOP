//Polimorfizm, Nesne Yönelimli Programlama (OOP) içinde önemli bir kavramdır
//nesnelerin kendi sınıflarından ziyade üst sınıflarının örnekleri gibi işlem görmelerini sağlar.
// Kotlin'de iki ana tür polimorfizm bulunur:

//1) Derleme Zamanı Polimorfizmi (overload yani statik polymorpism):
//Bu tür polimorfizm, aynı sınıf içinde aynı isme sahip fakat farklı parametrelere sahip birden fazla metot tanımlanarak elde edilir.
// Hangi metodun çağrılacağı, derleme zamanında metot imzasına göre belirlenir.



class HesapMakinesi {
    fun topla(a: Int, b: Int): Int {
        return a + b
    }

    fun topla(a: Double, b: Double): Double {
        return a + b
    }
}



//2)Çalışma Zamanı Polimorfizmi (Metot Ezme yani dinamik polymorpism ):
//override edilecek metod open anahtar kelimesini almak zorundadır.
//Bu tür polimorfizm, alt sınıfta üst sınıfta bulunan bir metod ile aynı ada ve parametrelere sahip bir metodun tanımlanmasıyla elde edilir.
// Hangi metodun çağrılacağı, çalışma zamanında gerçek nesne tipine göre belirlenir.



open class Hayvan {
    open fun sesCikar() {
        println("Hayvan ses çıkarıyor")
    }
}

class Kopek : Hayvan() {
    override fun sesCikar() {
        println("Köpek havlıyor")
    }
}

class Kedi : Hayvan() {
    override fun sesCikar() {
        println("Kedi miyavlıyor")
    }
}

fun main() {
    val benimHayvanim: Hayvan = Kopek()
    benimHayvanim.sesCikar() // Köpek'in sesCikar metodu çağrılır

    val baskaBirHayvan: Hayvan = Kedi()
    baskaBirHayvan.sesCikar() // Kedi'nin sesCikar metodu çağrılır
}

//Kotlin'de polimorfizm, metodların farklı türlerdeki nesneler üzerinde çalışmasını sağlayarak daha esnek ve yeniden kullanılabilir
// kod yazmayı mümkün kılar. Bu, kodun bakımını ve ölçeklenebilirliğini artırır.