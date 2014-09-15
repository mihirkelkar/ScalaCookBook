//Often we need to determine whether a given string contains a regular expression pattern 

//Solution: We create a regex object by invoking the .r method on a String and then use the pattern with findFirstIn if you are loooking for the first instance of the pattern and findAllIn when you are lloking for all instance of the pattern. 

//eg. Lets say we are lloking for all numerical pattern in the string. 

val address = "4805 Dainbow Drive, Cupertino, CA 95014"

val numPattern = "[0-9]+".r

val match1 = numPattern.findFirstIn(address)
//The above method however returns an Option[String]
println(match1.toString)



var matchall = numPattern.findAllIn(address)
//matchall is a on empty iterator. You need to convert it to to an array for various purposes
matchall.foreach(println)

var matchallArr = matchall.toArray
matchallArr.foreach(println)

//Like findAllIn and findFirstIn, there are methods like replaceAll and replaceFirst

val obfuscated_addresss = address.replaceAll("[0-9]", "x")
println(obfuscated_addresss)

//Or you could just obfuscate the first occurence of a numeral by using the 
//replacefirst method

println(address.replaceFirst("[0-9]", "x"))
