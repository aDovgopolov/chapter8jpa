package com.apress.prospring5.ch8.jpaFirstPart.service;

import com.apress.prospring5.ch8.jpaFirstPart.view.SingerSummary;

import java.util.List;

public interface SingerSummaryService {
    List<SingerSummary> findAll();
}