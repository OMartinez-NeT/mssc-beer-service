package com.springframework.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BearPageList extends PageImpl<BeerDto> {

    public BearPageList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BearPageList(List<BeerDto> content) {
        super(content);
    }
}
