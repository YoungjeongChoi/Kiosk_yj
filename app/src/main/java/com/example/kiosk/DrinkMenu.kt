package com.example.kiosk

//import com.example.kotlinetest.Kiosk.Menu

class DrinkMenu(): Menu() {
    override fun menuDetail(menu: String) {

            var menuPrc = MenuPrice().price(menu)
            println("${menu} |")
            println("${menu}의 가격은 ${menuPrc}")


    }


}