// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cr.labels.web;

import com.cr.labels.service.LabelTranslationService;
import com.cr.labels.service.api.LabelService;
import com.cr.labels.web.LabelControler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

privileged aspect LabelControler_Roo_Controller {
    
    declare @type: LabelControler: @Controller;
    
    declare @type: LabelControler: @RequestMapping("/labels");
    
    public LabelService LabelControler.labelService;
    
    public LabelTranslationService LabelControler.labelTranslationService;
    
    @Autowired
    public LabelControler.new(LabelService labelService, LabelTranslationService labelTranslationService) {
        this.labelService = labelService;
        this.labelTranslationService = labelTranslationService;
    }

}
