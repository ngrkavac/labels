package com.cr.labels.web;
import com.cr.labels.domain.LabelTranslation;
import com.cr.labels.service.LabelTranslationService;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.formatters.RooFormatter;

@RooFormatter(entity = LabelTranslation.class, service = LabelTranslationService.class)
public class LabelTranslationFormatter {
}
