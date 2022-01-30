package ru.zubrilinartem.shoppinglist.activities

import android.app.Application
import ru.zubrilinartem.shoppinglist.db.MainDataBase

class MainApp:Application() {
    val database by lazy { MainDataBase.getDataBase(this ) }
}