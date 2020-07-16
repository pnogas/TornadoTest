package com.paulnogas.log.analyzer

import javafx.fxml.FXML
import javafx.scene.control.ListView
import javafx.scene.layout.VBox
import tornadofx.View
import java.util.*

class MainView : View("Main View") {
    @FXML
    lateinit var listView: ListView<String>

    override fun onBeforeShow() {
        super.onBeforeShow()
        listView.items.addAll(dummyData)
    }

    override val root: VBox by fxml(hasControllerAttribute = true)

    companion object {
        private val dummyData = Arrays.asList(
            "afani  kjhdfa ih aduifhk  iuhadfuih uh uadf ",
            "jadhf adfu haudfui  uaudfhuafh ufhuf uhfauidfa ",
            "adfjk h  adsf adf adfhaf  adfuh ",
            "adf adoi3 da af89 e9 sdfafadgf iua 9 dafdf  9adfj na9  df dafa ",
            "a dufh a  udf ",
            "afani  kjhdfa ih aduifhk  iuhadfuih uh uadf ",
            "jadhf adfu haudfui  uaudfhuafh ufhuf uhfauidfa ",
            "adfjk h  adsf adf adfhaf  adfuh ",
            "adf adoi3 da af89 e9 sdfafadgf iua 9 dafdf  9adfj na9  df dafa ",
            "a dufh a  udf ",
            "afani  kjhdfa ih aduifhk  iuhadfuih uh uadf ",
            "jadhf adfu haudfui  uaudfhuafh ufhuf uhfauidfa ",
            "adfjk h  adsf adf adfhaf  adfuh ",
            "adf adoi3 da af89 e9 sdfafadgf iua 9 dafdf  9adfj na9  df dafa ",
            "a dufh a  udf ",
            "afani  kjhdfa ih aduifhk  iuhadfuih uh uadf ",
            "jadhf adfu haudfui  uaudfhuafh ufhuf uhfauidfa ",
            "adfjk h  adsf adf adfhaf  adfuh ",
            "adf adoi3 da af89 e9 sdfafadgf iua 9 dafdf  9adfj na9  df dafa ",
            "a dufh a  udf ",
            "afani  kjhdfa ih aduifhk  iuhadfuih uh uadf ",
            "jadhf adfu haudfui  uaudfhuafh ufhuf uhfauidfa ",
            "adfjk h  adsf adf adfhaf  adfuh ",
            "adf adoi3 da af89 e9 sdfafadgf iua 9 dafdf  9adfj na9  df dafa ",
            "a dufh a  udf "
        )
    }
}