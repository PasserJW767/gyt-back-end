package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.NatmehaChineseMedicineDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NatmehaChineseMedicineMapper {

    public List<NatmehaChineseMedicineDTO> selectNatmehaChineseMedicines();

    public NatmehaChineseMedicineDTO selectByItemCode(String itemCode);
}