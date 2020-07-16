package com.paulnogas.log.analyzer

import javafx.scene.image.Image
import javafx.stage.Stage
import tornadofx.App
import tornadofx.addStageIcon

class Main : App(MainView::class) {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            launch(Main::class.java, *args);
        }
    }

    override fun start(stage: Stage) {
        addStageIcon(Image("com/paulnogas/log/analyzer/icon.png"))
        super.start(stage)
    }
}