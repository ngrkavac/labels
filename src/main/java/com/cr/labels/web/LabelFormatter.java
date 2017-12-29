package com.cr.labels.web;
import com.cr.labels.domain.Label;
import com.cr.labels.service.api.LabelService;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.formatters.RooFormatter;

@RooFormatter(entity = Label.class, service = LabelService.class)
public class LabelFormatter {
}
