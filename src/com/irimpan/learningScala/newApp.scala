package com.irimpan.learningScala

object newApp extends App {

	val x = (x: Int, y: Int) => x + y
			println(x(1, 2))

			var variable = (x: Int, y: Int)  => println(x + y)
			variable(1, 2)
			variable(3, 6)


			def newName (name:String)  =  println("Hello " + name )
			newName("Navin")

			def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
			println(addThenMultiply(1, 2)(3))

			def getSquareString(input: Double): String = {
					val square = input * input
							square.toString
			}
			println(getSquareString(12.0))


			/*--------------*/
			/*--- Class ---*/      
			/*--------------*/

			class Greeter(prefix: String, suffix: String) {
				def greet(name: String): Unit =
						println(prefix + name + suffix)
			}

			val greeter = new Greeter("Hello, ", "!")
			greeter.greet("Scala developer") 


			/*--------------*/
			/*--Case Class--*/      
			/*--------------*/

case class Point(x: Int, y: Int)
val point = Point(1, 2)
val anotherPoint = Point(1, 2)
val yetAnotherPoint = Point(2, 2)

if (point == anotherPoint) {
	println(point + " and " + anotherPoint + " are the same.")
} else {
	println(point + " and " + anotherPoint + " are different.")
}

			/*--------------*/
			/* -- Objects --*/
			/*--------------*/

			object IdFactory {
				private var counter = 4
						def create(): Int = {
								counter += 3
										counter
						}
			}

			val newId: Int = IdFactory.create()
					println(newId)
					val newerId: Int = IdFactory.create()
					println(newerId)


					/*--------------*/
					/* -- Traits --*/
					/*--------------*/

					trait GreeterTrait {
						def greet(name: String): Unit =
								println("Hello, " + name + "!")
					}

					class DefaultGreeter extends GreeterTrait

					class CustomizableGreeter(prefix: String, postfix: String) extends GreeterTrait {
						override def greet(name: String): Unit = {
								println(prefix + name + postfix)
						}
					}

					val defaultGreeter = new DefaultGreeter()
					greeter.greet("Scala developer") // Hello, Scala developer!

					val customGreeter = new CustomizableGreeter("How are you, ", "?")
					customGreeter.greet("Scala developer") // How are you, Scala developer?


					val list: List[Any] = List(
							"a string",
							732,  // an integer
							'c',  // a character
							true, // a boolean value
							() => "an anonymous function returning a string"
							)
							println(list)
							list.foreach(element => println(element))


				/* -- Tail Recursion -- */
							
							def sum(f: Int => Int, a: Int, b: Int): Int = {
									def loop(x: Int, acc: Int): Int = {
											if (x > b) acc
											else loop(x + 1, acc + f(x))
									}
									loop(a,0)
							}
							println(sum(x => x, 1, 10)) 	

							
							
							def factorial (n: Int): Int = {
							  def loop (acc : Int , n: Int) : Int = 
							    if (n==0) acc
							    else loop(acc * n , n-1) 
							  loop(1,n)
							}
							println(factorial(8))
							
							
							
							
							
				/* -- Higher order Functions -- */
							
							def sumFunction(f : Int => Int )(a: Int , b : Int) : Int =  
							  if (a > b) 0 else f(a) + sumFunction(f)(a+1, b)
							  
							sumFunction(x => x*x*x) (1, 2)
							
							def mapReduce(f: Int => Int, combine: (Int,Int) => Int , n: Int ) = sumFunction(x => x*x*x) (1, 2)
					
							
}