package com.sas.spar.mapper;

import com.sas.spar.dao2.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import restclient.model.*;

import java.util.List;

//import com.sas.spar.dao2.BaseTargetGroupDAO;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OffersImportModelMapper {
    OffersImportModelMapper OFFERS_IMPORT_MODEL_MAPPER = Mappers.getMapper(OffersImportModelMapper.class);

    OffersImportModelDAO offersImportModelToOffersImportModelDAO(OffersImportModel offersImportModel);

    List<OfferDAO> offerDtoListToOfferDAOList(List<OfferDto> offers);

    OfferDAO offerDtoToOfferDAO(OfferDto offer);
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "offerDAO", ignore = true)
//    BaseTargetGroupDAO baseTargetGroupDtoToBaseTargetGroupDAO(BaseTargetGroupDto baseTargetGroupDto);

    OfferActionsChainDAO offerActionsChainDtoToOfferActionsChainDAO(OfferActionsChainDto offerActionsChainDto);

    default FilterDAO filterDtoToFilterDAO(FilterDto filterDto) {

        if (filterDto instanceof CardListFilterDto) {
            CardListFilterDAO cardListFilterDAO = new CardListFilterDAO();
            cardListFilterDAO.setName(filterDto.getName());
            cardListFilterDAO.setCards(((CardListFilterDto) filterDto).getCards());

            return cardListFilterDAO;
        } else {
            FilterDAO filterDAO = new FilterDAO();
            filterDAO.setName(filterDto.getName());
            return filterDAO;
        }
    }

    default ActionDAO actionDtoToActionDAO(ActionDto actionDto) {

        if (actionDto instanceof DirectDiscountActionDto) {
            DirectDiscountActionDAO directDiscountActionDAO = new DirectDiscountActionDAO();
            directDiscountActionDAO.setAmount(((DirectDiscountActionDto) actionDto).getAmount());
            directDiscountActionDAO.setAmountMeasure(((DirectDiscountActionDto) actionDto).getAmountMeasure());
            directDiscountActionDAO.setAmountPerMeasure(((DirectDiscountActionDto) actionDto).getAmountPerMeasure());
            directDiscountActionDAO.setAmountPerUniqueSku(((DirectDiscountActionDto) actionDto).getAmountPerUniqueSku());
            directDiscountActionDAO.setAmountPerUnit(((DirectDiscountActionDto) actionDto).getAmountPerUnit());
            directDiscountActionDAO.setAmountPerWeight(((DirectDiscountActionDto) actionDto).getAmountPerWeight());
            directDiscountActionDAO.setAmountWeight(((DirectDiscountActionDto) actionDto).getAmountWeight());
            directDiscountActionDAO.setCalculationExclusionDiscountTypes(calculationExclusionDiscountTypesEnumListToCalculationExclusionDiscountTypesEnumList1(((DirectDiscountActionDto) actionDto).getCalculationExclusionDiscountTypes()));
            directDiscountActionDAO.setDiscountType(discountTypeEnumToDiscountTypeEnum1(((DirectDiscountActionDto) actionDto).getDiscountType()));
            directDiscountActionDAO.setDistributeToAll(((DirectDiscountActionDto) actionDto).getDistributeToAll());
            directDiscountActionDAO.setOrder(actionDto.getOrder());
            directDiscountActionDAO.setPercent(((DirectDiscountActionDto) actionDto).getPercent());
            directDiscountActionDAO.setId(actionDto.getId());
            directDiscountActionDAO.setPrice(((DirectDiscountActionDto) actionDto).getPrice());
            directDiscountActionDAO.setPricePerUnit(((DirectDiscountActionDto) actionDto).getPricePerUnit());

            return directDiscountActionDAO;
        } else {
            ActionDAO actionDAO = new ActionDAO();
            actionDAO.setId(actionDto.getId());
            actionDAO.setOrder(actionDto.getOrder());

            return actionDAO;
        }
    }

    List<DirectDiscountActionDAO.CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypesEnumListToCalculationExclusionDiscountTypesEnumList1(List<DirectDiscountActionDto.CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypesEnumList);

    DirectDiscountActionDAO.DiscountTypeEnum discountTypeEnumToDiscountTypeEnum1(DirectDiscountActionDto.DiscountTypeEnum discountTypeEnum);

    @InheritInverseConfiguration
    OffersImportModel offersImportModelDAOToOffersImportModel(OffersImportModelDAO OffersImportModelDAO);

    default FilterDto filterDAOToFilterDto(FilterDAO filterDAO) {

        if (filterDAO instanceof CardListFilterDAO) {
            CardListFilterDto cardListFilterDto = new CardListFilterDto();
            cardListFilterDto.setName(filterDAO.getName());
            cardListFilterDto.setCards(((CardListFilterDAO) filterDAO).getCards());

            return cardListFilterDto;
        } else {
            FilterDto filterDto = new FilterDto();
            filterDto.setName(filterDAO.getName());
            return filterDto;
        }
    }

    default ActionDto actionDAOToActionDto(ActionDAO actionDAO) {

        if (actionDAO instanceof DirectDiscountActionDAO) {
            DirectDiscountActionDto directDiscountActionDto = new DirectDiscountActionDto();
            directDiscountActionDto.setAmount(((DirectDiscountActionDAO) actionDAO).getAmount());
            directDiscountActionDto.setAmountMeasure(((DirectDiscountActionDAO) actionDAO).getAmountMeasure());
            directDiscountActionDto.setAmountPerMeasure(((DirectDiscountActionDAO) actionDAO).getAmountPerMeasure());
            directDiscountActionDto.setAmountPerUniqueSku(((DirectDiscountActionDAO) actionDAO).getAmountPerUniqueSku());
            directDiscountActionDto.setAmountPerUnit(((DirectDiscountActionDAO) actionDAO).getAmountPerUnit());
            directDiscountActionDto.setAmountPerWeight(((DirectDiscountActionDAO) actionDAO).getAmountPerWeight());
            directDiscountActionDto.setAmountWeight(((DirectDiscountActionDAO) actionDAO).getAmountWeight());
            directDiscountActionDto.setCalculationExclusionDiscountTypes(calculationExclusionDiscountTypesEnumList1ToCalculationExclusionDiscountTypesEnumList(((DirectDiscountActionDAO) actionDAO).getCalculationExclusionDiscountTypes()));
            directDiscountActionDto.setDiscountType(discountTypeEnum1ToDiscountTypeEnum(((DirectDiscountActionDAO) actionDAO).getDiscountType()));
            directDiscountActionDto.setDistributeToAll(((DirectDiscountActionDAO) actionDAO).getDistributeToAll());
            directDiscountActionDto.setOrder(actionDAO.getOrder());
            directDiscountActionDto.setPercent(((DirectDiscountActionDAO) actionDAO).getPercent());
            directDiscountActionDto.setId(actionDAO.getId());
            directDiscountActionDto.setPrice(((DirectDiscountActionDAO) actionDAO).getPrice());
            directDiscountActionDto.setPricePerUnit(((DirectDiscountActionDAO) actionDAO).getPricePerUnit());

            return directDiscountActionDto;
        } else {
            ActionDto actionDto = new ActionDto();
            actionDto.setId(actionDAO.getId());
            actionDto.setOrder(actionDAO.getOrder());

            return actionDto;
        }
    }

    List<DirectDiscountActionDto.CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypesEnumList1ToCalculationExclusionDiscountTypesEnumList(List<DirectDiscountActionDAO.CalculationExclusionDiscountTypesEnum> calculationExclusionDiscountTypesEnumList);

    DirectDiscountActionDto.DiscountTypeEnum discountTypeEnum1ToDiscountTypeEnum(DirectDiscountActionDAO.DiscountTypeEnum discountTypeEnum);
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
