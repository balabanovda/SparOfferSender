package com.sas.spar.mapper;

import com.example.demo.restclient.model.BaseTargetGroupDto;
import com.example.demo.restclient.model.OfferDto;
import com.example.demo.restclient.model.OffersImportModel;
import com.sas.spar.dao.*;
//import com.sas.spar.dao2.BaseTargetGroupDAO;
import com.sas.spar.dao2.OfferDAO;
import com.sas.spar.dao2.OffersImportModelDAO;
import com.sas.spar.web.model.dto.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OffersImportModelMapper {
    OffersImportModelMapper OFFERS_IMPORT_MODEL_MAPPER = Mappers.getMapper(OffersImportModelMapper.class);

    OffersImportModelDAO offersImportModelToOffersImportModelDAO(OffersImportModel offersImportModel);

    List<OfferDAO> offerDtoListToOfferDAOList(List<OfferDto> offers);

    OfferDAO offerDtoToOfferDAO(OfferDto offer);
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "offerDAO", ignore = true)
//    BaseTargetGroupDAO baseTargetGroupDtoToBaseTargetGroupDAO(BaseTargetGroupDto baseTargetGroupDto);

    @InheritInverseConfiguration
    OffersImportModel offersImportModelDAOToOffersImportModel(OffersImportModelDAO OffersImportModelDAO);

//    @Mapping(target = "partnerDAOList", source = "partner")
//    PartnersDAO partnersToPartnersDAO (Partners partners);
//  // List<PartnerDAO> partnerListToPartnerDAOList (List<Partner> partner);




//
//    @Mapping(target = "partnerDAOList", source = "partner")
//    PartnersDAO partnersToPartnersDAO(Partners partners);
//
//    Partner2DAO partnerToPartner2DAO(Partner partner);
//
//    @Mapping(target = "eventsDAOList", source = "events")
//    RulesDAO rulesToRulesDAO(Rules rules);
//
//
//    List<EventsDAO> eventsListToEventsDAOList(List<Events> events);
//
//    @Mapping(target = "chainsDAOList", source = "chains")
//    @Mapping(target = "stype", source = "$type")
//    EventsDAO eventsToEventsDAO(Events events);
//
//    List<ChainsDAO> chainsListToChainsDAOList(List<Chains> chains);
//
//    @Mapping(target = "filtersList", source = "filters")
//    @Mapping(target = "actionsList", source = "actions")
//    ChainsDAO chainsToChainsDAO(Chains chains);
//
//    List<FiltersDAO> filtersListToFiltersDAOList(List<Filters> filters);
//
//    List<ActionsDAO> actionsListToActionsDAOList(List<Actions> actions);
//
//    //@Mapping(target = "calculationExclusionDiscountTypesList", source = "calculationExclusionDiscountTypes")
//    @Mapping(target = "stype", source = "$type")
//    ActionsDAO actionsToActionsDAO(Actions actions);
//    @Mapping(target = "stype", source = "$type")
//    FiltersDAO filtersToFiltersDAO(Filters filters);
//
//    List<CalculationExclusionDiscountTypesDAO> calculationExclusionDiscountTypesListToCalculationExclusionDiscountTypesDAOList(List<CalculationExclusionDiscountTypes> calculationExclusionDiscountTypes);
//
//    CalculationExclusionDiscountTypesDAO calculationExclusionDiscountTypesToCalculationExclusionDiscountTypesDAO(CalculationExclusionDiscountTypesDAO calculationExclusionDiscountTypesDAO);
//    //@Mapping(target = "partner", source = "partnerList")
////    Partners offersDAOToPartners(OffersDAO offersDAO);
//
//
//    @InheritInverseConfiguration
//    Root rootDAOToRoot(RootDAO rootDAO);
//
//    @InheritInverseConfiguration
//    Offers offersDAOToOffers(OffersDAO offersDAO);
//    @InheritInverseConfiguration
//    Partners partnersDAOToPartners(PartnersDAO partnersDAO);
//    @InheritInverseConfiguration
//    Rules rulesDAOToRules(RulesDAO rulesDAO);
//    @InheritInverseConfiguration
//    Events eventsDAOToEvents(EventsDAO eventsDAO);
//    @InheritInverseConfiguration
//    Chains chainsDAOToChains(ChainsDAO chainsDAO);
//    @InheritInverseConfiguration
//    Actions actionsDAOToActions(ActionsDAO actionsDAO);
//    @InheritInverseConfiguration
//    Filters filtersDAOToFilters(FiltersDAO filtersDAO);

}
