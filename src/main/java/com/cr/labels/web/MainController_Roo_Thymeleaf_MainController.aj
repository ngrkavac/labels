// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cr.labels.web;

import com.cr.labels.web.MainController;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

privileged aspect MainController_Roo_Thymeleaf_MainController {
    
    declare @type: MainController: @Controller;
    
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String MainController.index(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        return "index";
    }
    
}
