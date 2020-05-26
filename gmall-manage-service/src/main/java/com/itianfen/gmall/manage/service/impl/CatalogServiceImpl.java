package com.itianfen.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itianfen.gmall.bean.PmsBaseCatalog1;
import com.itianfen.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.itianfen.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.itianfen.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.itianfen.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }
}
