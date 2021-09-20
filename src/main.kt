fun main(){
    val movies=arrayOf("","","","","")
    println("Please enter your top 5 Movies")
    var count=5
    while(count>0){
        print("Please Enter Movie rank $count: ")
        movies[count-1]= readLine().toString()
        count--
    }
    println("Your Top 5 Movies Are:")
    for(i in movies){
        println(i)
    }

}