package com.cr.labels.web;
import com.cr.labels.domain.LabelTranslation;
import com.cr.labels.service.LabelTranslationService;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

@RooController(path = "/labeltranslations", entity = LabelTranslation.class, service = LabelTranslationService.class)
@RooJSON
@RooThymeleaf
public class LabelTranslationController {
}
