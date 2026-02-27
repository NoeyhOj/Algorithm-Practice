fun main() {
    repeat(readln().toInt()) {
        // 입력값은 11보다 작은 양수. 즉, 10까지
        val dp = IntArray(11)
        dp[1] = 1 // 1을 만들 수 있는 경우의 수 -> 1
        dp[2] = 2 // 2를 만들 수 있는 경우의 수 -> 1 + 1, 2
        dp[3] = 4 // 3을 만들 수 있는 경우의 수 -> 1 + 1 + 1, 1 + 2, 2 + 1, 3
        for (i in 4..10) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]
        }
        
        val n = readln().toInt()

        println(dp[n])
    }
}