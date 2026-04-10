package com.github.novotnyr.multimodule.shared

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.ui.Messages

class SharedAction : DumbAwareAction("Invoke Shared Content Module") {
    override fun actionPerformed(p0: AnActionEvent) {
        Messages.showInfoMessage("Hello from shared module", "Shared Module")
    }
}