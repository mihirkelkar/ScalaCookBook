//The parseInt method in scala converts strings represented in other bases to base 10 Ints. 

//THe formst to do that is something like ParseInt("otherbasestring", otherbase)

var decimal_equivalent = Integer.parseInt("101", 2)
println(decimal_equivalent)

decimal_equivalent = Integer.parseInt("10", 8)
println(decimal_equivalent)


//Lets introduce you to what an implicit class in class and method is in scala. //Lets write an implicit method which acts on a string and implicitly converts into an Int of the specified radix

implicit class myImplicitClass(s:String){
  def toIntRadix(radix: Int) = Integer.parseInt(s, radix)
}

println("100".toIntRadix(2))

//What would happen if we pass a wrong string like "ab" as an arguement to toInt//We need to handle that exception is to redeclare the toInt function to handle the exception. 

def toInt(s:String):Option[Int] = {
  try{
    Some(s.toInt)
  }
  catch{
    case e: NumberFormatException => None
  }
}

//Now we use the getOrElse with the function we defined to assign a value of 0 if a null is returned. Remember we defined the function as toInt(string). string.toInt is still the original function
val number  = toInt("ab").getOrElse(0)
println(number)
