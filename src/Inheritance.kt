// Miras alma yani inheritance:  bir classın özelliklerini diğer bir class için kulllanılabilir hale getirilmesidir.
// bir classın miras alınabilmesi için başına open anahtar kelimesi gelmek zorundadır.
// yani ben classlara baktığımda open kelimesini görüyorsam o illa ki bir class için miras alınmıştır.


final class  Animal1() {   // varsayılan olarak her class başında final vardır. bu miras alınamaz demektir.
    var name: String = ""
    var age: Int = 0
    var color: String = ""
    var feetCount: Int = 0

      fun makeASound():String{
        return ""
    }

    fun eat(){

    }

    fun attack(){

    }
}

open class Animal2() {   // başına open eklendiğinde miras alınabilir class haline gelir.
    var name: String = ""
    var age: Int = 0
    var color: String = ""
    var feetCount: Int = 0

    open fun  makeASound(): String{  // fonksiyonun başına open ekleyerek override edilmesine izin veriyoruz -> cat classına bak
       return ""
    }

    fun eat(){

    }

    fun attack(){

    }
}

 // class Dog():Animal{}  // final class olduğu için miras alınamadı -> yorum satırını kaldır bak

class Cat(): Animal2(){  // open class yapıldığı için miras alındı

    override fun makeASound(): String{  //fonksiyonu override ettik yani tekrar üzerine yazdık.
        println("Miyav")
        return "Miyav"



    }
}
fun main(){

   val cat1 = Cat()
    cat1.name = "Tears"
    cat1.age = 3
    cat1.color = "Black"
    cat1.feetCount = 4



    println("${cat1.name},${cat1.age},${cat1.color},${cat1.feetCount}")

    cat1.makeASound()
}

