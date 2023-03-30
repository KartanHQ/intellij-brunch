package com.nekofar.milad.intellij.brunch.cli

import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.lang.javascript.boilerplate.JavaScriptNewTemplatesFactoryBase
import com.intellij.platform.ProjectTemplate

class BrunchProjectTemplateFactory : JavaScriptNewTemplatesFactoryBase() {
    override fun createTemplates(context: WizardContext?): Array<ProjectTemplate> = arrayOf(BrunchCliProjectGenerator())
}
