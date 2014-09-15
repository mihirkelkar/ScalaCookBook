//In this example we will learn to slice strings in scala. Delete parts from the// string and getting substrings from within a string. 

//Lets declare a string first. 
var string = "hello world!"
println(string)
//Lets delete the first two chars in that string using the drop keyword. 

string = string.drop(2)
println(string)

//Now lets slice out the next 2 chars from the string and store them in a diffwerent variable using the take method. 

var substring = string.take(2)
println(substring)

//Now lets capitalize the first letter of the substring that we just retrieved from the string. 
//This is the scala equivalent of the function in Python
println(substring.capitalize)

string = "case conversions"
//Now lets convert an entire string to uppercase
println(string.toUpperCase)
//Converting a string to lower case scala
string = "CASE TO LOWER"
println(string.toLowerCase)

//Multiline strings in scala. 
string = """This is
	  a multi line
	  string in scala"""


//Scala's equivalent of a prepalce method in Python. 
string = "hi, my name is harry huffington"
string = string.replaceAll("h", "")
println(string)
