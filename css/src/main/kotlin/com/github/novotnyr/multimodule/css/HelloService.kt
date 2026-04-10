package com.github.novotnyr.multimodule.css

import com.intellij.openapi.components.Service

@Service
class HelloService {
    fun sayHello() = "Hello from CSS module"
}
