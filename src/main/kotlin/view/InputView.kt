package view

import camp.nextstep.edu.missionutils.Console.readLine

class InputView {
    fun userInput(): String {
        val input = readLine()
        return input
    }
}