package com.github.novotnyr.multimodule.css

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.components.service
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Messages

class CssDisplayAction : DumbAwareAction("Show CSS") {
    override fun actionPerformed(e: AnActionEvent) {
        val helloService = service<HelloService>()
        Messages.showInfoMessage(helloService.sayHello(), "CSS")
    }
}
