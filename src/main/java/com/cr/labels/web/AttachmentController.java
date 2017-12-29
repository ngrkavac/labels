package com.cr.labels.web;
import com.cr.labels.domain.Attachment;
import com.cr.labels.service.AttachmentService;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

@RooController(path = "/attachments", entity = Attachment.class, service = AttachmentService.class)
@RooJSON
@RooThymeleaf
public class AttachmentController {
}
