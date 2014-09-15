val string = "hello, I live in cupertino California"

//We have to use the toByte function on a char to convert it into its corresponding ascii code. 
//Just as a note here, although its not relevant here. 
//Declaring a char in scala : val char = 'a' 
//Note the single quote

//Declaring a string in scala
//val char = "a". Note the double quote here

for(c <- string) {
println(c.toByte)
}

//The method getBytes can return a sequential collection of string Bytes as an array

string.getBytes.foreach(println)
