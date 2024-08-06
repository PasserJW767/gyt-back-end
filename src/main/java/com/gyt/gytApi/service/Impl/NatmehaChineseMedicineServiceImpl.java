package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaChineseMedicineDTO;
import com.gyt.gytApi.mapper.NatmehaChineseMedicineMapper;
import com.gyt.gytApi.service.INatmehaChineseMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 莫起润
 * @date : 2021/8/26/23:11
 */
@Service("NatmehaChineseMedicineService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class NatmehaChineseMedicineServiceImpl implements INatmehaChineseMedicineService {
    @Autowired
    NatmehaChineseMedicineMapper natmehaChineseMedicineMapper;

    @Override
    public List<NatmehaChineseMedicineDTO> selectNatmehaChineseMedicines() {
        return this.natmehaChineseMedicineMapper.selectNatmehaChineseMedicines();
    }

    @Override
    public NatmehaChineseMedicineDTO selectByItemCode(String itemCode) {
        return this.natmehaChineseMedicineMapper.selectByItemCode(itemCode);
    }
}
