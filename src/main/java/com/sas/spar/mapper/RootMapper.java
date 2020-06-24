package com.sas.spar.mapper;

import com.sas.spar.dao.*;
import com.sas.spar.web.model.dto.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RootMapper {
    RootMapper ROOT_MAPPER = Mappers.getMapper(RootMapper.class);

    @Mapping(target = "offersList", source = "offers")
    RootDAO rootToRootDAO(Root root);


    List<OffersDAO> offersListToOffersDAOList(List<Offers> offers);
//    @Mapping(target = "partnerDAOList", source = "partner")
//    PartnersDAO partnersToPartnersDAO (Partners partners);
//  // List<PartnerDAO> partnerListToPartnerDAOList (List<Partner> partner);


    @Mapping(target = "partnersDAO", source = "partners")
    @Mapping(target = "rulesDAO", source = "rules")
    OffersDAO offersToOffersDAO(Offers offers);

    @Mapping(target = "partnerDAOList", source = "partner")
    PartnersDAO partnersToPartnersDAO(Partners partners);

    Partner2DAO partnerToPartner2DAO(Partner partner);

    @Mapping(target = "eventsDAOList", source = "events")
    RulesDAO rulesToRulesDAO(Rules rules);


    List<EventsDAO> eventsListToEventsDAOList(List<Events> events);

    @Mapping(target = "chainsDAOList", source = "chains")
    @Mapping(target = "stype", source = "$type")
    EventsDAO eventsToEventsDAO(Events events);

    List<ChainsDAO> chainsListToChainsDAOList(List<Chains> chains);

    @Mapping(target = "filtersList", source = "filters")
    @Mapping(target = "actionsList", source = "actions")
    ChainsDAO chainsToChainsDAO(Chains chains);

    List<FiltersDAO> filtersListToFiltersDAOList(List<Filters> filters);

    List<ActionsDAO> actionsListToActionsDAOList(List<Actions> actions);

    //@Mapping(target = "calculationExclusionDiscountTypesList", source = "calculationExclusionDiscountTypes")
    @Mapping(target = "stype", source = "$type")
    ActionsDAO actionsToActionsDAO(Actions actions);
    @Mapping(target = "stype", source = "$type")
    FiltersDAO filtersToFiltersDAO(Filters filters);

    List<CalculationExclusionDiscountTypesDAO> calculationExclusionDiscountTypesListToCalculationExclusionDiscountTypesDAOList(List<CalculationExclusionDiscountTypes> calculationExclusionDiscountTypes);

    CalculationExclusionDiscountTypesDAO calculationExclusionDiscountTypesToCalculationExclusionDiscountTypesDAO(CalculationExclusionDiscountTypesDAO calculationExclusionDiscountTypesDAO);
    //@Mapping(target = "partner", source = "partnerList")
//    Partners offersDAOToPartners(OffersDAO offersDAO);


    @InheritInverseConfiguration
    Root rootDAOToRoot(RootDAO rootDAO);

    @InheritInverseConfiguration
    Offers offersDAOToOffers(OffersDAO offersDAO);
    @InheritInverseConfiguration
    Partners partnersDAOToPartners(PartnersDAO partnersDAO);
    @InheritInverseConfiguration
    Rules rulesDAOToRules(RulesDAO rulesDAO);
    @InheritInverseConfiguration
    Events eventsDAOToEvents(EventsDAO eventsDAO);
    @InheritInverseConfiguration
    Chains chainsDAOToChains(ChainsDAO chainsDAO);
    @InheritInverseConfiguration
    Actions actionsDAOToActions(ActionsDAO actionsDAO);
    @InheritInverseConfiguration
    Filters filtersDAOToFilters(FiltersDAO filtersDAO);

}
