//The parseInt method in scala converts strings represented in other bases to base 10 Ints. 

//THe formst to do that is something like ParseInt("otherbasestring", otherbase)

var decimal_equivalent = Integer.parseInt("101", 2)
println(decimal_equivalent)

decimal_equivalent = Integer.parseInt("10", 8)
println(decimal_equivalent)


//Lets introduce you to what an implicit class in class and method is in scala. //Lets write an implicit method which acts on a string and implicitly converts into an Int of the specified radix

implicit class myImplicitClass(s:String){
  def toInt(radix: Int) = Integer.parseInt(s, radix)
}

println("100".toInt(2))
