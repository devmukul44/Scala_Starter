import scala.io._

object ex2{
	def main(args: Array[String]): Unit = {

		object Factorial{
		
			def computeFactorial(num : Int) :BigInt = {
				var i : Int = 0
				var fact : BigInt = 1
				for( i <- 1 to num) {
					fact *= i
				}
				fact
			}
			def computeFactorialRecursion(num : Int) : BigInt= {
				if(num == 1)
				1
				else
				num * computeFactorialRecursion(num-1)			
			}
		}
		case class CustomException(message: String = "", cause: Throwable = null) extends Exception(message, cause) 
		if(args.length == 0){
			printf("1")
		}
		else if(args(0).toInt >= 1 && args(0).toInt <= 100) {
			val fac = Factorial.computeFactorial(args(0).toInt)
			val facRec = Factorial.computeFactorialRecursion(args(0).toInt)
			printf(f"factorial is :\n\nIterative: $fac \n\nRecursive: $facRec\n")
		}
		else{
			try {
				throw new CustomException("FactorialInputOutOfRange")
			} 
			catch {
			   case c: CustomException => c.printStackTrace
			}
		}
	}
}