package org.ermain.scala_tutorial_2

object Main {
  
    def main(args: Array[String]):Unit = {
      
      println("Print all the number from 0 to 20 incrementing by 2: ")
        var i = 0
        while (i < 20){
          print(i + "\t")
          i += 2
        }
      println()
      
      val age:Int = 22
      val response = if (age < 18){
        "No Admission"
      }else{
        "Come on in!"
      }
      
      println(response)
      
      for (i <- 0 until 10; if i%3 ==0 || i%5 ==0; j <- 'a' to 'c'){
        print(i + "" + j + "\t")
      }
      
      // An alternate for-Loop takes the form
      val stuff = for{
          i <- 0 until 20 
          if i%3 == 0 || i%5 == 0
          j <- 'a' to 'c'
          sqr = i*i}
      yield {
        i -> j   // This statement creates a vector
      }
      
      println(stuff)
   }
}