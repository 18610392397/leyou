package com.leyou.service;

import com.leyou.dao.SpecParamMapper;
import com.leyou.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecParamService {
    @Autowired
    private SpecParamMapper specParamMapper;

    public void saveSpecParam(SpecParam specParam) {
        specParamMapper.insert(specParam);
    }

    public void updateSpecParam(SpecParam specParam) {
        specParamMapper.updateByPrimaryKey(specParam);
    }

    public void deleteSpecParamById(Long id) {
        SpecParam specParam = new SpecParam();
        specParam.setId(id);
        specParamMapper.deleteByPrimaryKey(specParam);

    }
    //根据分类id查询规格参数
    public List<SpecParam> findSpecParamBycid(Long cid) {
        return specParamMapper.findSpecParamBycid(cid);
    }
}
