//Generate a random number in Scala. Define a random number generator object

val r = scala.util.Random

//Generating the next integer
println(r.nextInt)

//Generating the next integer, you can limit the number to a maximum value.
//The returned value lies between 0 and maximum value included.  
println(r.nextInt(10))

//You can also randomly generate float values between 0.0 and 1.0
println(r.nextFloat)

//We can also generate random double values between 0.0 and 1.0
println(r.nextDouble)

//Generate Random character generators. 
println(r.nextPrintableChar)
