// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cr.labels.service.api;

import com.cr.labels.domain.Label;
import com.cr.labels.repository.GlobalSearch;
import com.cr.labels.service.api.LabelService;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

privileged aspect LabelService_Roo_Service {
    
    @Transactional(readOnly = false)
    public abstract Label LabelService.save(Label entity);    
    @Transactional(readOnly = false)
    public abstract void LabelService.delete(Long id);    
    @Transactional(readOnly = false)
    public abstract List<Label> LabelService.save(Iterable<Label> entities);    
    @Transactional(readOnly = false)
    public abstract void LabelService.delete(Iterable<Long> ids);    
    public abstract List<Label> LabelService.findAll();    
    public abstract List<Label> LabelService.findAll(Iterable<Long> ids);    
    public abstract Label LabelService.findOne(Long id);    
    public abstract long LabelService.count();    
    public abstract Page<Label> LabelService.findAll(GlobalSearch globalSearch, Pageable pageable);    
}
