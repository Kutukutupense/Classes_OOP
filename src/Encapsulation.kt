// Encapsulation nedir?
// encapsulationda Bir Class'ın üye olan her hangi bir verisi mümkün oldukça private yapılır
// bunun sebebi ise bu verilere dışarıdan alakasız yerlerden ulaşılmasını engellemek ve
// kurulan mimari içerisinde tertip ve düzenin sağlanarak karışıklığın giderilmesidir.
// sonrasında erişilmesi gereken veriler fonksiyon olarak tanımlanır.

class Encapsulation {
    private val name: String = "Eylem"
    private val surName: String = "Bilecik"

    fun getFullName():String {

        return "$name $surName"
    }
}

// diğer örnek
class Person(){
    private var name: String = "Eylem"
    private var age: Int = 35

    fun setName(newName: String){
         name = newName
    }
    fun getName():String{
        return name
    }
}
fun main(){
    val person1 = Person()
    person1.setName("Kamil")
    person1.getName()

}