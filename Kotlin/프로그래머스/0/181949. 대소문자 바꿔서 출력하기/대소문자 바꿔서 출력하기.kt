fun main(args: Array<String>) {
    val s1 = readLine()!!
    for (i in s1)
    {
        if (i.isUpperCase()) 
        {
            print(i.toLowerCase())
        } else {
            print(i.toUpperCase())
        }
    }
}