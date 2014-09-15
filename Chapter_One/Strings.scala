//This example essentially involves showing you how to play arounf with strings in scala

//Decalring a string in scala
var string = "Hello ! World"
println(string)
//Calculating the length of a given string
println(string.length)
//Concatenate two string
string = "Hello" + "Dude!"
println(string)

//Strings have access to all methods of the stringOps class. So you can essentially iterate over a string like a sequence of characters.
// The way you can in python as well

//This is an example for the for each method that can be used on strings

"Learning Scala".foreach(println)

//Quite similarly, you can treate a string as a sequence of cahracters inside a for loop. 

for(x <- "Learning Scala") println(x)

//You can also treat them as a sequence of ASCII codes and print them out

"Learning Scala".getBytes.foreach(println)

//You can use methods like filter to delete chars from strings that you might not need. 
//Also, keep in mind that the element inside the filter class has to be present in single quotes. 
val result = "learning scala".filter(_ != 'l')
println(result)
