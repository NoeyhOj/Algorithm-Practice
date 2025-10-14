class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: (Array<String>) -> Array<String> = { str ->
            val lst = str.toList()
            if (lst.contains("l") && lst.contains("r")) {
                if (lst.indexOf("l") < lst.indexOf("r")) {
                    lst.subList(0, lst.indexOf("l"))
                } else {
                    lst.subList(lst.indexOf("r") + 1, lst.size)
                }
            } else {
               if (lst.contains("l")) {
                   lst.subList(0, lst.indexOf("l"))
               } else if (lst.contains("r")) {
                   lst.subList(lst.indexOf("r") + 1, lst.size)
               } else {
                   emptyList()
               }
            }.toTypedArray()
        }
        return answer(str_list)
    }
}