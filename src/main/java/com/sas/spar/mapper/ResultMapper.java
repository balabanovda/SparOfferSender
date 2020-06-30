package com.sas.spar.mapper;

import com.example.demo.restclient.model.ResultModelOfOffersImportResponse;
import com.sas.spar.dao2.result.ResultModelOfOffersImportResponseDAO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResultMapper {
    ResultMapper RESULT_MAPPER = Mappers.getMapper(ResultMapper.class);

    ResultModelOfOffersImportResponseDAO ResultModelOfOffersImportResponseToResultModelOfOffersImportResponseDAO(ResultModelOfOffersImportResponse resultModelOfOffersImportResponse);

}
