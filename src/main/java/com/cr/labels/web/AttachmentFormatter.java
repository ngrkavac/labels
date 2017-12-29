package com.cr.labels.web;
import com.cr.labels.domain.Attachment;
import com.cr.labels.service.AttachmentService;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.formatters.RooFormatter;

@RooFormatter(entity = Attachment.class, service = AttachmentService.class)
public class AttachmentFormatter {
}
