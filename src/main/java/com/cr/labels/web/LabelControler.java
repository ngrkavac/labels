package com.cr.labels.web;
import com.cr.labels.domain.Label;
import com.cr.labels.service.api.LabelService;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

@RooController(path = "/labels", entity = Label.class, service = LabelService.class)
@RooThymeleaf
@RooJSON
public class LabelControler {
}
