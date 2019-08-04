package com.sven.demo.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class SvenGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.logger.quiet "* Sven gradle plugin loaded."
    }
}