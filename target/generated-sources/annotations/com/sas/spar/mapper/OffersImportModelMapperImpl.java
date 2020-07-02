package com.sas.spar.mapper;

import com.example.demo.restclient.model.ActionDto;
import com.example.demo.restclient.model.FilterDto;
import com.example.demo.restclient.model.HourMinuteModelDto;
import com.example.demo.restclient.model.LoyaltyProgramDto;
import com.example.demo.restclient.model.MerchantDto;
import com.example.demo.restclient.model.OfferActionsChainDto;
import com.example.demo.restclient.model.OfferDto;
import com.example.demo.restclient.model.OfferDto.WorkingStateEnum;
import com.example.demo.restclient.model.OfferEventDto;
import com.example.demo.restclient.model.OfferLoyaltyPrograms;
import com.example.demo.restclient.model.OfferPartners;
import com.example.demo.restclient.model.OfferRules;
import com.example.demo.restclient.model.OffersImportModel;
import com.example.demo.restclient.model.OffersImportModel.VersionEnum;
import com.example.demo.restclient.model.PartnerDto;
import com.example.demo.restclient.model.PointsOfSales;
import com.example.demo.restclient.model.TimeRefinementDto;
import com.example.demo.restclient.model.TimeRefinementDto.DaysOfWeekEnum;
import com.sas.spar.dao2.ActionDAO;
import com.sas.spar.dao2.FilterDAO;
import com.sas.spar.dao2.HourMinuteModelDAO;
import com.sas.spar.dao2.LoyaltyProgramDAO;
import com.sas.spar.dao2.MerchantDAO;
import com.sas.spar.dao2.OfferActionsChainDAO;
import com.sas.spar.dao2.OfferDAO;
import com.sas.spar.dao2.OfferDAO.ChangesStateEnum;
import com.sas.spar.dao2.OfferEventDAO;
import com.sas.spar.dao2.OfferLoyaltyProgramsDAO;
import com.sas.spar.dao2.OfferPartnersDAO;
import com.sas.spar.dao2.OfferRulesDAO;
import com.sas.spar.dao2.OffersImportModelDAO;
import com.sas.spar.dao2.PartnerDAO;
import com.sas.spar.dao2.PointsOfSalesDAO;
import com.sas.spar.dao2.TimeRefinementDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-02T12:24:57+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class OffersImportModelMapperImpl implements OffersImportModelMapper {

    @Override
    public OffersImportModelDAO offersImportModelToOffersImportModelDAO(OffersImportModel offersImportModel) {
        if ( offersImportModel == null ) {
            return null;
        }

        OffersImportModelDAO offersImportModelDAO = new OffersImportModelDAO();

        offersImportModelDAO.setOffers( offerDtoListToOfferDAOList( offersImportModel.getOffers() ) );
        offersImportModelDAO.setVersion( versionEnumToVersionEnum( offersImportModel.getVersion() ) );

        return offersImportModelDAO;
    }

    @Override
    public List<OfferDAO> offerDtoListToOfferDAOList(List<OfferDto> offers) {
        if ( offers == null ) {
            return null;
        }

        List<OfferDAO> list = new ArrayList<OfferDAO>( offers.size() );
        for ( OfferDto offerDto : offers ) {
            list.add( offerDtoToOfferDAO( offerDto ) );
        }

        return list;
    }

    @Override
    public OfferDAO offerDtoToOfferDAO(OfferDto offer) {
        if ( offer == null ) {
            return null;
        }

        OfferDAO offerDAO = new OfferDAO();

        offerDAO.setId( offer.getId() );
        offerDAO.setTitle( offer.getTitle() );
        offerDAO.setApplyChangesDateValue( offer.getApplyChangesDateValue() );
        offerDAO.setExpirationDateValue( offer.getExpirationDateValue() );
        offerDAO.setWorkingState( workingStateEnumToWorkingStateEnum( offer.getWorkingState() ) );
        offerDAO.setChangesState( changesStateEnumToChangesStateEnum( offer.getChangesState() ) );
        offerDAO.setPriority( offer.getPriority() );
        offerDAO.setIsSum( offer.isIsSum() );
        offerDAO.setTimeRefinement( timeRefinementDtoToTimeRefinementDAO( offer.getTimeRefinement() ) );
        offerDAO.setDescription( offer.getDescription() );
        offerDAO.setCategory( offer.getCategory() );
        offerDAO.setMarketingCampaign( offer.getMarketingCampaign() );
        offerDAO.setPartners( offerPartnersToOfferPartnersDAO( offer.getPartners() ) );
        offerDAO.setLoyaltyPrograms( offerLoyaltyProgramsToOfferLoyaltyProgramsDAO( offer.getLoyaltyPrograms() ) );
        offerDAO.setPointsOfSales( pointsOfSalesToPointsOfSalesDAO( offer.getPointsOfSales() ) );
        offerDAO.setRules( offerRulesToOfferRulesDAO( offer.getRules() ) );
        offerDAO.setApplyChangesDate( offer.getApplyChangesDate() );
        offerDAO.setExpirationDate( offer.getExpirationDate() );

        return offerDAO;
    }

    @Override
    public OffersImportModel offersImportModelDAOToOffersImportModel(OffersImportModelDAO OffersImportModelDAO) {
        if ( OffersImportModelDAO == null ) {
            return null;
        }

        OffersImportModel offersImportModel = new OffersImportModel();

        offersImportModel.setOffers( offerDAOListToOfferDtoList( OffersImportModelDAO.getOffers() ) );
        offersImportModel.setVersion( versionEnumToVersionEnum1( OffersImportModelDAO.getVersion() ) );

        return offersImportModel;
    }

    protected com.sas.spar.dao2.OffersImportModelDAO.VersionEnum versionEnumToVersionEnum(VersionEnum versionEnum) {
        if ( versionEnum == null ) {
            return null;
        }

        com.sas.spar.dao2.OffersImportModelDAO.VersionEnum versionEnum1;

        switch ( versionEnum ) {
            case VERSION10: versionEnum1 = com.sas.spar.dao2.OffersImportModelDAO.VersionEnum.VERSION10;
            break;
            case VERSION20: versionEnum1 = com.sas.spar.dao2.OffersImportModelDAO.VersionEnum.VERSION20;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + versionEnum );
        }

        return versionEnum1;
    }

    protected com.sas.spar.dao2.OfferDAO.WorkingStateEnum workingStateEnumToWorkingStateEnum(WorkingStateEnum workingStateEnum) {
        if ( workingStateEnum == null ) {
            return null;
        }

        com.sas.spar.dao2.OfferDAO.WorkingStateEnum workingStateEnum1;

        switch ( workingStateEnum ) {
            case STOPPED: workingStateEnum1 = com.sas.spar.dao2.OfferDAO.WorkingStateEnum.STOPPED;
            break;
            case RUNNING: workingStateEnum1 = com.sas.spar.dao2.OfferDAO.WorkingStateEnum.RUNNING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + workingStateEnum );
        }

        return workingStateEnum1;
    }

    protected ChangesStateEnum changesStateEnumToChangesStateEnum(com.example.demo.restclient.model.OfferDto.ChangesStateEnum changesStateEnum) {
        if ( changesStateEnum == null ) {
            return null;
        }

        ChangesStateEnum changesStateEnum1;

        switch ( changesStateEnum ) {
            case EDITING: changesStateEnum1 = ChangesStateEnum.EDITING;
            break;
            case ONAPPROVAL: changesStateEnum1 = ChangesStateEnum.ONAPPROVAL;
            break;
            case APPROVED: changesStateEnum1 = ChangesStateEnum.APPROVED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + changesStateEnum );
        }

        return changesStateEnum1;
    }

    protected com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum daysOfWeekEnumToDaysOfWeekEnum(DaysOfWeekEnum daysOfWeekEnum) {
        if ( daysOfWeekEnum == null ) {
            return null;
        }

        com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum daysOfWeekEnum1;

        switch ( daysOfWeekEnum ) {
            case SUNDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.SUNDAY;
            break;
            case MONDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.MONDAY;
            break;
            case TUESDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.TUESDAY;
            break;
            case WEDNESDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.WEDNESDAY;
            break;
            case THURSDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.THURSDAY;
            break;
            case FRIDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.FRIDAY;
            break;
            case SATURDAY: daysOfWeekEnum1 = com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum.SATURDAY;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + daysOfWeekEnum );
        }

        return daysOfWeekEnum1;
    }

    protected List<com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum> daysOfWeekEnumListToDaysOfWeekEnumList(List<DaysOfWeekEnum> list) {
        if ( list == null ) {
            return null;
        }

        List<com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum> list1 = new ArrayList<com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum>( list.size() );
        for ( DaysOfWeekEnum daysOfWeekEnum : list ) {
            list1.add( daysOfWeekEnumToDaysOfWeekEnum( daysOfWeekEnum ) );
        }

        return list1;
    }

    protected HourMinuteModelDAO hourMinuteModelDtoToHourMinuteModelDAO(HourMinuteModelDto hourMinuteModelDto) {
        if ( hourMinuteModelDto == null ) {
            return null;
        }

        HourMinuteModelDAO hourMinuteModelDAO = new HourMinuteModelDAO();

        hourMinuteModelDAO.setHour( hourMinuteModelDto.getHour() );
        hourMinuteModelDAO.setMinute( hourMinuteModelDto.getMinute() );

        return hourMinuteModelDAO;
    }

    protected TimeRefinementDAO timeRefinementDtoToTimeRefinementDAO(TimeRefinementDto timeRefinementDto) {
        if ( timeRefinementDto == null ) {
            return null;
        }

        TimeRefinementDAO timeRefinementDAO = new TimeRefinementDAO();

        timeRefinementDAO.setDaysOfWeek( daysOfWeekEnumListToDaysOfWeekEnumList( timeRefinementDto.getDaysOfWeek() ) );
        timeRefinementDAO.setBeginTime( hourMinuteModelDtoToHourMinuteModelDAO( timeRefinementDto.getBeginTime() ) );
        timeRefinementDAO.setEndTime( hourMinuteModelDtoToHourMinuteModelDAO( timeRefinementDto.getEndTime() ) );

        return timeRefinementDAO;
    }

    protected PartnerDAO partnerDtoToPartnerDAO(PartnerDto partnerDto) {
        if ( partnerDto == null ) {
            return null;
        }

        PartnerDAO partnerDAO = new PartnerDAO();

        partnerDAO.setId( partnerDto.getId() );

        return partnerDAO;
    }

    protected List<PartnerDAO> partnerDtoListToPartnerDAOList(List<PartnerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<PartnerDAO> list1 = new ArrayList<PartnerDAO>( list.size() );
        for ( PartnerDto partnerDto : list ) {
            list1.add( partnerDtoToPartnerDAO( partnerDto ) );
        }

        return list1;
    }

    protected OfferPartnersDAO offerPartnersToOfferPartnersDAO(OfferPartners offerPartners) {
        if ( offerPartners == null ) {
            return null;
        }

        OfferPartnersDAO offerPartnersDAO = new OfferPartnersDAO();

        offerPartnersDAO.setPartners( partnerDtoListToPartnerDAOList( offerPartners.getPartners() ) );

        return offerPartnersDAO;
    }

    protected LoyaltyProgramDAO loyaltyProgramDtoToLoyaltyProgramDAO(LoyaltyProgramDto loyaltyProgramDto) {
        if ( loyaltyProgramDto == null ) {
            return null;
        }

        LoyaltyProgramDAO loyaltyProgramDAO = new LoyaltyProgramDAO();

        loyaltyProgramDAO.setId( loyaltyProgramDto.getId() );

        return loyaltyProgramDAO;
    }

    protected List<LoyaltyProgramDAO> loyaltyProgramDtoListToLoyaltyProgramDAOList(List<LoyaltyProgramDto> list) {
        if ( list == null ) {
            return null;
        }

        List<LoyaltyProgramDAO> list1 = new ArrayList<LoyaltyProgramDAO>( list.size() );
        for ( LoyaltyProgramDto loyaltyProgramDto : list ) {
            list1.add( loyaltyProgramDtoToLoyaltyProgramDAO( loyaltyProgramDto ) );
        }

        return list1;
    }

    protected OfferLoyaltyProgramsDAO offerLoyaltyProgramsToOfferLoyaltyProgramsDAO(OfferLoyaltyPrograms offerLoyaltyPrograms) {
        if ( offerLoyaltyPrograms == null ) {
            return null;
        }

        OfferLoyaltyProgramsDAO offerLoyaltyProgramsDAO = new OfferLoyaltyProgramsDAO();

        offerLoyaltyProgramsDAO.setLoyaltyPrograms( loyaltyProgramDtoListToLoyaltyProgramDAOList( offerLoyaltyPrograms.getLoyaltyPrograms() ) );

        return offerLoyaltyProgramsDAO;
    }

    protected MerchantDAO merchantDtoToMerchantDAO(MerchantDto merchantDto) {
        if ( merchantDto == null ) {
            return null;
        }

        MerchantDAO merchantDAO = new MerchantDAO();

        merchantDAO.setId( merchantDto.getId() );

        return merchantDAO;
    }

    protected List<MerchantDAO> merchantDtoListToMerchantDAOList(List<MerchantDto> list) {
        if ( list == null ) {
            return null;
        }

        List<MerchantDAO> list1 = new ArrayList<MerchantDAO>( list.size() );
        for ( MerchantDto merchantDto : list ) {
            list1.add( merchantDtoToMerchantDAO( merchantDto ) );
        }

        return list1;
    }

    protected PointsOfSalesDAO pointsOfSalesToPointsOfSalesDAO(PointsOfSales pointsOfSales) {
        if ( pointsOfSales == null ) {
            return null;
        }

        PointsOfSalesDAO pointsOfSalesDAO = new PointsOfSalesDAO();

        pointsOfSalesDAO.setMerchants( merchantDtoListToMerchantDAOList( pointsOfSales.getMerchants() ) );

        return pointsOfSalesDAO;
    }

    protected FilterDAO filterDtoToFilterDAO(FilterDto filterDto) {
        if ( filterDto == null ) {
            return null;
        }

        FilterDAO filterDAO = new FilterDAO();

        filterDAO.setName( filterDto.getName() );

        return filterDAO;
    }

    protected List<FilterDAO> filterDtoListToFilterDAOList(List<FilterDto> list) {
        if ( list == null ) {
            return null;
        }

        List<FilterDAO> list1 = new ArrayList<FilterDAO>( list.size() );
        for ( FilterDto filterDto : list ) {
            list1.add( filterDtoToFilterDAO( filterDto ) );
        }

        return list1;
    }

    protected ActionDAO actionDtoToActionDAO(ActionDto actionDto) {
        if ( actionDto == null ) {
            return null;
        }

        ActionDAO actionDAO = new ActionDAO();

        actionDAO.setOrder( actionDto.getOrder() );
        actionDAO.setId( actionDto.getId() );

        return actionDAO;
    }

    protected List<ActionDAO> actionDtoListToActionDAOList(List<ActionDto> list) {
        if ( list == null ) {
            return null;
        }

        List<ActionDAO> list1 = new ArrayList<ActionDAO>( list.size() );
        for ( ActionDto actionDto : list ) {
            list1.add( actionDtoToActionDAO( actionDto ) );
        }

        return list1;
    }

    protected OfferActionsChainDAO offerActionsChainDtoToOfferActionsChainDAO(OfferActionsChainDto offerActionsChainDto) {
        if ( offerActionsChainDto == null ) {
            return null;
        }

        OfferActionsChainDAO offerActionsChainDAO = new OfferActionsChainDAO();

        offerActionsChainDAO.setFilters( filterDtoListToFilterDAOList( offerActionsChainDto.getFilters() ) );
        offerActionsChainDAO.setActions( actionDtoListToActionDAOList( offerActionsChainDto.getActions() ) );
        offerActionsChainDAO.setOrder( offerActionsChainDto.getOrder() );
        offerActionsChainDAO.setName( offerActionsChainDto.getName() );

        return offerActionsChainDAO;
    }

    protected List<OfferActionsChainDAO> offerActionsChainDtoListToOfferActionsChainDAOList(List<OfferActionsChainDto> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferActionsChainDAO> list1 = new ArrayList<OfferActionsChainDAO>( list.size() );
        for ( OfferActionsChainDto offerActionsChainDto : list ) {
            list1.add( offerActionsChainDtoToOfferActionsChainDAO( offerActionsChainDto ) );
        }

        return list1;
    }

    protected OfferEventDAO offerEventDtoToOfferEventDAO(OfferEventDto offerEventDto) {
        if ( offerEventDto == null ) {
            return null;
        }

        OfferEventDAO offerEventDAO = new OfferEventDAO();

        offerEventDAO.setChains( offerActionsChainDtoListToOfferActionsChainDAOList( offerEventDto.getChains() ) );

        return offerEventDAO;
    }

    protected List<OfferEventDAO> offerEventDtoListToOfferEventDAOList(List<OfferEventDto> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferEventDAO> list1 = new ArrayList<OfferEventDAO>( list.size() );
        for ( OfferEventDto offerEventDto : list ) {
            list1.add( offerEventDtoToOfferEventDAO( offerEventDto ) );
        }

        return list1;
    }

    protected OfferRulesDAO offerRulesToOfferRulesDAO(OfferRules offerRules) {
        if ( offerRules == null ) {
            return null;
        }

        OfferRulesDAO offerRulesDAO = new OfferRulesDAO();

        offerRulesDAO.setEvents( offerEventDtoListToOfferEventDAOList( offerRules.getEvents() ) );

        return offerRulesDAO;
    }

    protected WorkingStateEnum workingStateEnumToWorkingStateEnum1(com.sas.spar.dao2.OfferDAO.WorkingStateEnum workingStateEnum) {
        if ( workingStateEnum == null ) {
            return null;
        }

        WorkingStateEnum workingStateEnum1;

        switch ( workingStateEnum ) {
            case STOPPED: workingStateEnum1 = WorkingStateEnum.STOPPED;
            break;
            case RUNNING: workingStateEnum1 = WorkingStateEnum.RUNNING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + workingStateEnum );
        }

        return workingStateEnum1;
    }

    protected com.example.demo.restclient.model.OfferDto.ChangesStateEnum changesStateEnumToChangesStateEnum1(ChangesStateEnum changesStateEnum) {
        if ( changesStateEnum == null ) {
            return null;
        }

        com.example.demo.restclient.model.OfferDto.ChangesStateEnum changesStateEnum1;

        switch ( changesStateEnum ) {
            case EDITING: changesStateEnum1 = com.example.demo.restclient.model.OfferDto.ChangesStateEnum.EDITING;
            break;
            case ONAPPROVAL: changesStateEnum1 = com.example.demo.restclient.model.OfferDto.ChangesStateEnum.ONAPPROVAL;
            break;
            case APPROVED: changesStateEnum1 = com.example.demo.restclient.model.OfferDto.ChangesStateEnum.APPROVED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + changesStateEnum );
        }

        return changesStateEnum1;
    }

    protected DaysOfWeekEnum daysOfWeekEnumToDaysOfWeekEnum1(com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum daysOfWeekEnum) {
        if ( daysOfWeekEnum == null ) {
            return null;
        }

        DaysOfWeekEnum daysOfWeekEnum1;

        switch ( daysOfWeekEnum ) {
            case SUNDAY: daysOfWeekEnum1 = DaysOfWeekEnum.SUNDAY;
            break;
            case MONDAY: daysOfWeekEnum1 = DaysOfWeekEnum.MONDAY;
            break;
            case TUESDAY: daysOfWeekEnum1 = DaysOfWeekEnum.TUESDAY;
            break;
            case WEDNESDAY: daysOfWeekEnum1 = DaysOfWeekEnum.WEDNESDAY;
            break;
            case THURSDAY: daysOfWeekEnum1 = DaysOfWeekEnum.THURSDAY;
            break;
            case FRIDAY: daysOfWeekEnum1 = DaysOfWeekEnum.FRIDAY;
            break;
            case SATURDAY: daysOfWeekEnum1 = DaysOfWeekEnum.SATURDAY;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + daysOfWeekEnum );
        }

        return daysOfWeekEnum1;
    }

    protected List<DaysOfWeekEnum> daysOfWeekEnumListToDaysOfWeekEnumList1(List<com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum> list) {
        if ( list == null ) {
            return null;
        }

        List<DaysOfWeekEnum> list1 = new ArrayList<DaysOfWeekEnum>( list.size() );
        for ( com.sas.spar.dao2.TimeRefinementDAO.DaysOfWeekEnum daysOfWeekEnum : list ) {
            list1.add( daysOfWeekEnumToDaysOfWeekEnum1( daysOfWeekEnum ) );
        }

        return list1;
    }

    protected HourMinuteModelDto hourMinuteModelDAOToHourMinuteModelDto(HourMinuteModelDAO hourMinuteModelDAO) {
        if ( hourMinuteModelDAO == null ) {
            return null;
        }

        HourMinuteModelDto hourMinuteModelDto = new HourMinuteModelDto();

        hourMinuteModelDto.setHour( hourMinuteModelDAO.getHour() );
        hourMinuteModelDto.setMinute( hourMinuteModelDAO.getMinute() );

        return hourMinuteModelDto;
    }

    protected TimeRefinementDto timeRefinementDAOToTimeRefinementDto(TimeRefinementDAO timeRefinementDAO) {
        if ( timeRefinementDAO == null ) {
            return null;
        }

        TimeRefinementDto timeRefinementDto = new TimeRefinementDto();

        timeRefinementDto.setDaysOfWeek( daysOfWeekEnumListToDaysOfWeekEnumList1( timeRefinementDAO.getDaysOfWeek() ) );
        timeRefinementDto.setBeginTime( hourMinuteModelDAOToHourMinuteModelDto( timeRefinementDAO.getBeginTime() ) );
        timeRefinementDto.setEndTime( hourMinuteModelDAOToHourMinuteModelDto( timeRefinementDAO.getEndTime() ) );

        return timeRefinementDto;
    }

    protected PartnerDto partnerDAOToPartnerDto(PartnerDAO partnerDAO) {
        if ( partnerDAO == null ) {
            return null;
        }

        PartnerDto partnerDto = new PartnerDto();

        partnerDto.setId( partnerDAO.getId() );

        return partnerDto;
    }

    protected List<PartnerDto> partnerDAOListToPartnerDtoList(List<PartnerDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<PartnerDto> list1 = new ArrayList<PartnerDto>( list.size() );
        for ( PartnerDAO partnerDAO : list ) {
            list1.add( partnerDAOToPartnerDto( partnerDAO ) );
        }

        return list1;
    }

    protected OfferPartners offerPartnersDAOToOfferPartners(OfferPartnersDAO offerPartnersDAO) {
        if ( offerPartnersDAO == null ) {
            return null;
        }

        OfferPartners offerPartners = new OfferPartners();

        offerPartners.setPartners( partnerDAOListToPartnerDtoList( offerPartnersDAO.getPartners() ) );

        return offerPartners;
    }

    protected LoyaltyProgramDto loyaltyProgramDAOToLoyaltyProgramDto(LoyaltyProgramDAO loyaltyProgramDAO) {
        if ( loyaltyProgramDAO == null ) {
            return null;
        }

        LoyaltyProgramDto loyaltyProgramDto = new LoyaltyProgramDto();

        loyaltyProgramDto.setId( loyaltyProgramDAO.getId() );

        return loyaltyProgramDto;
    }

    protected List<LoyaltyProgramDto> loyaltyProgramDAOListToLoyaltyProgramDtoList(List<LoyaltyProgramDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<LoyaltyProgramDto> list1 = new ArrayList<LoyaltyProgramDto>( list.size() );
        for ( LoyaltyProgramDAO loyaltyProgramDAO : list ) {
            list1.add( loyaltyProgramDAOToLoyaltyProgramDto( loyaltyProgramDAO ) );
        }

        return list1;
    }

    protected OfferLoyaltyPrograms offerLoyaltyProgramsDAOToOfferLoyaltyPrograms(OfferLoyaltyProgramsDAO offerLoyaltyProgramsDAO) {
        if ( offerLoyaltyProgramsDAO == null ) {
            return null;
        }

        OfferLoyaltyPrograms offerLoyaltyPrograms = new OfferLoyaltyPrograms();

        offerLoyaltyPrograms.setLoyaltyPrograms( loyaltyProgramDAOListToLoyaltyProgramDtoList( offerLoyaltyProgramsDAO.getLoyaltyPrograms() ) );

        return offerLoyaltyPrograms;
    }

    protected MerchantDto merchantDAOToMerchantDto(MerchantDAO merchantDAO) {
        if ( merchantDAO == null ) {
            return null;
        }

        MerchantDto merchantDto = new MerchantDto();

        merchantDto.setId( merchantDAO.getId() );

        return merchantDto;
    }

    protected List<MerchantDto> merchantDAOListToMerchantDtoList(List<MerchantDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<MerchantDto> list1 = new ArrayList<MerchantDto>( list.size() );
        for ( MerchantDAO merchantDAO : list ) {
            list1.add( merchantDAOToMerchantDto( merchantDAO ) );
        }

        return list1;
    }

    protected PointsOfSales pointsOfSalesDAOToPointsOfSales(PointsOfSalesDAO pointsOfSalesDAO) {
        if ( pointsOfSalesDAO == null ) {
            return null;
        }

        PointsOfSales pointsOfSales = new PointsOfSales();

        pointsOfSales.setMerchants( merchantDAOListToMerchantDtoList( pointsOfSalesDAO.getMerchants() ) );

        return pointsOfSales;
    }

    protected FilterDto filterDAOToFilterDto(FilterDAO filterDAO) {
        if ( filterDAO == null ) {
            return null;
        }

        FilterDto filterDto = new FilterDto();

        filterDto.setName( filterDAO.getName() );

        return filterDto;
    }

    protected List<FilterDto> filterDAOListToFilterDtoList(List<FilterDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<FilterDto> list1 = new ArrayList<FilterDto>( list.size() );
        for ( FilterDAO filterDAO : list ) {
            list1.add( filterDAOToFilterDto( filterDAO ) );
        }

        return list1;
    }

    protected ActionDto actionDAOToActionDto(ActionDAO actionDAO) {
        if ( actionDAO == null ) {
            return null;
        }

        ActionDto actionDto = new ActionDto();

        actionDto.setOrder( actionDAO.getOrder() );
        actionDto.setId( actionDAO.getId() );

        return actionDto;
    }

    protected List<ActionDto> actionDAOListToActionDtoList(List<ActionDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<ActionDto> list1 = new ArrayList<ActionDto>( list.size() );
        for ( ActionDAO actionDAO : list ) {
            list1.add( actionDAOToActionDto( actionDAO ) );
        }

        return list1;
    }

    protected OfferActionsChainDto offerActionsChainDAOToOfferActionsChainDto(OfferActionsChainDAO offerActionsChainDAO) {
        if ( offerActionsChainDAO == null ) {
            return null;
        }

        OfferActionsChainDto offerActionsChainDto = new OfferActionsChainDto();

        offerActionsChainDto.setFilters( filterDAOListToFilterDtoList( offerActionsChainDAO.getFilters() ) );
        offerActionsChainDto.setActions( actionDAOListToActionDtoList( offerActionsChainDAO.getActions() ) );
        offerActionsChainDto.setOrder( offerActionsChainDAO.getOrder() );
        offerActionsChainDto.setName( offerActionsChainDAO.getName() );

        return offerActionsChainDto;
    }

    protected List<OfferActionsChainDto> offerActionsChainDAOListToOfferActionsChainDtoList(List<OfferActionsChainDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferActionsChainDto> list1 = new ArrayList<OfferActionsChainDto>( list.size() );
        for ( OfferActionsChainDAO offerActionsChainDAO : list ) {
            list1.add( offerActionsChainDAOToOfferActionsChainDto( offerActionsChainDAO ) );
        }

        return list1;
    }

    protected OfferEventDto offerEventDAOToOfferEventDto(OfferEventDAO offerEventDAO) {
        if ( offerEventDAO == null ) {
            return null;
        }

        OfferEventDto offerEventDto = new OfferEventDto();

        offerEventDto.setChains( offerActionsChainDAOListToOfferActionsChainDtoList( offerEventDAO.getChains() ) );

        return offerEventDto;
    }

    protected List<OfferEventDto> offerEventDAOListToOfferEventDtoList(List<OfferEventDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferEventDto> list1 = new ArrayList<OfferEventDto>( list.size() );
        for ( OfferEventDAO offerEventDAO : list ) {
            list1.add( offerEventDAOToOfferEventDto( offerEventDAO ) );
        }

        return list1;
    }

    protected OfferRules offerRulesDAOToOfferRules(OfferRulesDAO offerRulesDAO) {
        if ( offerRulesDAO == null ) {
            return null;
        }

        OfferRules offerRules = new OfferRules();

        offerRules.setEvents( offerEventDAOListToOfferEventDtoList( offerRulesDAO.getEvents() ) );

        return offerRules;
    }

    protected OfferDto offerDAOToOfferDto(OfferDAO offerDAO) {
        if ( offerDAO == null ) {
            return null;
        }

        OfferDto offerDto = new OfferDto();

        offerDto.setId( offerDAO.getId() );
        offerDto.setTitle( offerDAO.getTitle() );
        offerDto.setApplyChangesDateValue( offerDAO.getApplyChangesDateValue() );
        offerDto.setExpirationDateValue( offerDAO.getExpirationDateValue() );
        offerDto.setWorkingState( workingStateEnumToWorkingStateEnum1( offerDAO.getWorkingState() ) );
        offerDto.setChangesState( changesStateEnumToChangesStateEnum1( offerDAO.getChangesState() ) );
        offerDto.setPriority( offerDAO.getPriority() );
        offerDto.setIsSum( offerDAO.isIsSum() );
        offerDto.setTimeRefinement( timeRefinementDAOToTimeRefinementDto( offerDAO.getTimeRefinement() ) );
        offerDto.setDescription( offerDAO.getDescription() );
        offerDto.setCategory( offerDAO.getCategory() );
        offerDto.setMarketingCampaign( offerDAO.getMarketingCampaign() );
        offerDto.setPartners( offerPartnersDAOToOfferPartners( offerDAO.getPartners() ) );
        offerDto.setLoyaltyPrograms( offerLoyaltyProgramsDAOToOfferLoyaltyPrograms( offerDAO.getLoyaltyPrograms() ) );
        offerDto.setPointsOfSales( pointsOfSalesDAOToPointsOfSales( offerDAO.getPointsOfSales() ) );
        offerDto.setRules( offerRulesDAOToOfferRules( offerDAO.getRules() ) );
        offerDto.setApplyChangesDate( offerDAO.getApplyChangesDate() );
        offerDto.setExpirationDate( offerDAO.getExpirationDate() );

        return offerDto;
    }

    protected List<OfferDto> offerDAOListToOfferDtoList(List<OfferDAO> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferDto> list1 = new ArrayList<OfferDto>( list.size() );
        for ( OfferDAO offerDAO : list ) {
            list1.add( offerDAOToOfferDto( offerDAO ) );
        }

        return list1;
    }

    protected VersionEnum versionEnumToVersionEnum1(com.sas.spar.dao2.OffersImportModelDAO.VersionEnum versionEnum) {
        if ( versionEnum == null ) {
            return null;
        }

        VersionEnum versionEnum1;

        switch ( versionEnum ) {
            case VERSION10: versionEnum1 = VersionEnum.VERSION10;
            break;
            case VERSION20: versionEnum1 = VersionEnum.VERSION20;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + versionEnum );
        }

        return versionEnum1;
    }
}
