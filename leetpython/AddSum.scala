import scala.util.control._
object AddSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val loop = new Breaks
    var util:Map[Int,Int] = Map()
    var result = new Array[Int](2)
    for (x <- 0 to nums.length-1){
      val left = target - nums(x)
      if(!util.keys.toList.contains(nums(x))){
        util += (left -> x)
      }else{
        result.apply(x)
        result.apply(nums(x))
        loop.break
      }
    }
     result
  }

  def main (args: Array[String]){
    val nums = Array(3,2,4)
    val target = 6
    val result = this.twoSum(nums,target)
    print(result)
  }

}