import java.util.Arrays
fun main(){
    print("Using arrayof() method:")
    var arr1 = arrayOf(17,48,59,72,30)
    println(Arrays.deepToString(arr1))
    print("Using Array<>() method:")
    var arr2 = Array<String>(5){i -> (i * i).toString()}
    arr2.forEach { print( it) }
    print("\nUsing IntArray() method:")
    var arr4 = IntArray(5)
    arr4[0]=21
    arr4[1]=57
    arr4[2]=36
    arr4[3]=80
    arr4[4]=66
    for(i in arr4){
        print(" $i")
    }
    print("\nUsing intArrayOf() method:")
    var arr5 = intArrayOf(45,77,30,5,4)
    for(i in arr5){
        print(" $i")
    }
}