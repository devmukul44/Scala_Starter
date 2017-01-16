import scala.io._

class InnoString(str : String){
	private var name = str
	override def toString = str
	def concat(arg: String) = {
		name = name + arg
		println(this.name)
	}
	def +(that: InnoString) = new InnoString(this.name + that.name)
	def ==(that: InnoString) = new InnoString((this.name == that.name).toString)
	def isPalindrome() = {
		this.name == this.name.reverse
	}
}
object ex3 {
	def main(args: Array[String]) :Unit = {
		val instance = new InnoString("Inno")
		instance.concat("Vaccer")
		val instance2 = new InnoString("ABCBA")
		println(instance + instance2)
		println(instance == instance2)
		println(instance2.isPalindrome)
	}
}