package com.github.tmazeika.racketide.services

import com.intellij.openapi.project.Project
import com.github.tmazeika.racketide.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
