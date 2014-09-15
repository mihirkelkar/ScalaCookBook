//Splitting strings in scala. 
//Often you want to split strings converting it into a list /Array of sorts and then maybe later creating a CSV or some other kind of representation.

//This would split the string on white space into an array of separate strings. 
var string = "Hello World!"
string.split(" ").foreach(println)


//The parameter that the split method accepts is actually a regular expression. 
string = "4805, Rainbow Drive, Cupertino, California"
string.split(",").foreach(println)

//We can sanitize the strings from leading and trailing white spaces by calling the function trim on them all. We can call the function on all of them by first mapping the array. 

string.split(",").map(_.trim).foreach(println)

//Again an exmaple of a split using a pure regular expression. 
string.split("\\s+").foreach(println)
//Now lets clean up the commans and then print it 
string.replaceAll(",","").split("\\s+").foreach(println)
