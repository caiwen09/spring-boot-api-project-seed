package com.company.project.service.impl;

import com.company.project.dao.CountryMapper;
import com.company.project.pojo.Country;
import com.company.project.service.CountryService;
import com.company.project.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/02/22.
 */
@Service
@Transactional
public class CountryServiceImpl extends BaseServiceImpl<Country> implements CountryService {
    @Resource
    private CountryMapper countryMapper;

}
