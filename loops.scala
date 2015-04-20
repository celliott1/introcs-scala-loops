import scala.math.min

object loops {
  
  // Return a string containing n copies of s, end to end.
  // For example StringOfReps("Ok", 9) returns: "OkOkOkOkOkOkOkOkOk"
  def stringOfReps(s: String, n: Int): String = {
      var str = ""
    for(i<-0 until n){
        str = str + s
    }
      str
  }

  // Return n! (n factorial: 1*2*3 *...* n if n >=1; 0! is 1.).  
  //For example Factorial(4) returns 1*2*3*4 = 24.
  def factorial(n: Int): Int = {
        var number = n
      if(n>=1){
        for(i<-1 until n){
            number = number*i
        }
        number  
      }else{
      number = 1
      number
  }
 

   // Return a string containing a filled rectange, where the filling is 
   // the specified number of columns and rows of the character inChar,
   // surrounded by a border made of the character edgeChar.
   // For example printRectangle(3, 2, 'i', 'e') prints
   //    eeeee
   //    eiiie
   //    eiiie
   //    eeeee
   def printRectangle(columns:Int, rows:Int, inChar:String, edgeChar:String): String = {
     var tb = edgeChar * (columns+rows)
     var innum = (columns+rows) - 2
     var in = edgeChar + (inChar * innum) + edgeChar
       var rectangle = tb
       for(i<-1 until rows+1){
           rectangle += "\n" + in
       }
       rectangle += "\n" + tb
       rectangle
     }

}
