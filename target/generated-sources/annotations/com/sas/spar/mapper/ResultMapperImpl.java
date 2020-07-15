package com.sas.spar.mapper;

import com.example.demo.restclient.model.ImportWarning;
import com.example.demo.restclient.model.ImportWarningAttribute;
import com.example.demo.restclient.model.OfferImportError;
import com.example.demo.restclient.model.OfferImportWarning;
import com.example.demo.restclient.model.OffersImportResponse;
import com.example.demo.restclient.model.Result;
import com.example.demo.restclient.model.ResultModelOfOffersImportResponse;
import com.example.demo.restclient.model.ValidationError;
import com.sas.spar.dao2.result.ImportWarningAttributeDAO;
import com.sas.spar.dao2.result.ImportWarningDAO;
import com.sas.spar.dao2.result.OfferImportErrorDAO;
import com.sas.spar.dao2.result.OfferImportWarningDAO;
import com.sas.spar.dao2.result.OffersImportResponseDAO;
import com.sas.spar.dao2.result.ResultDAO;
import com.sas.spar.dao2.result.ResultDAO.StateEnum;
import com.sas.spar.dao2.result.ResultModelOfOffersImportResponseDAO;
import com.sas.spar.dao2.result.ValidationErrorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-14T13:31:40+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class ResultMapperImpl implements ResultMapper {

    @Override
    public ResultModelOfOffersImportResponseDAO ResultModelOfOffersImportResponseToResultModelOfOffersImportResponseDAO(ResultModelOfOffersImportResponse resultModelOfOffersImportResponse) {
        if ( resultModelOfOffersImportResponse == null ) {
            return null;
        }

        ResultModelOfOffersImportResponseDAO resultModelOfOffersImportResponseDAO = new ResultModelOfOffersImportResponseDAO();

        resultModelOfOffersImportResponseDAO.setResult( resultToResultDAO( resultModelOfOffersImportResponse.getResult() ) );
        resultModelOfOffersImportResponseDAO.setData( offersImportResponseToOffersImportResponseDAO( resultModelOfOffersImportResponse.getData() ) );

        return resultModelOfOffersImportResponseDAO;
    }

    protected StateEnum stateEnumToStateEnum(com.example.demo.restclient.model.Result.StateEnum stateEnum) {
        if ( stateEnum == null ) {
            return null;
        }

        StateEnum stateEnum1;

        switch ( stateEnum ) {
            case SUCCESS: stateEnum1 = StateEnum.SUCCESS;
            break;
            case FAIL: stateEnum1 = StateEnum.FAIL;
            break;
            case ERROR: stateEnum1 = StateEnum.ERROR;
            break;
            case VALIDATIONERROR: stateEnum1 = StateEnum.VALIDATIONERROR;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + stateEnum );
        }

        return stateEnum1;
    }

    protected ValidationErrorDAO validationErrorToValidationErrorDAO(ValidationError validationError) {
        if ( validationError == null ) {
            return null;
        }

        ValidationErrorDAO validationErrorDAO = new ValidationErrorDAO();

        validationErrorDAO.setField( validationError.getField() );

        return validationErrorDAO;
    }

    protected List<ValidationErrorDAO> validationErrorListToValidationErrorDAOList(List<ValidationError> list) {
        if ( list == null ) {
            return null;
        }

        List<ValidationErrorDAO> list1 = new ArrayList<ValidationErrorDAO>( list.size() );
        for ( ValidationError validationError : list ) {
            list1.add( validationErrorToValidationErrorDAO( validationError ) );
        }

        return list1;
    }

    protected ResultDAO resultToResultDAO(Result result) {
        if ( result == null ) {
            return null;
        }

        ResultDAO resultDAO = new ResultDAO();

        resultDAO.setState( stateEnumToStateEnum( result.getState() ) );
        resultDAO.setMessage( result.getMessage() );
        resultDAO.setMessageCode( result.getMessageCode() );
        resultDAO.setValidationErrors( validationErrorListToValidationErrorDAOList( result.getValidationErrors() ) );

        return resultDAO;
    }

    protected OfferImportErrorDAO offerImportErrorToOfferImportErrorDAO(OfferImportError offerImportError) {
        if ( offerImportError == null ) {
            return null;
        }

        OfferImportErrorDAO offerImportErrorDAO = new OfferImportErrorDAO();

        offerImportErrorDAO.setOfferID( offerImportError.getOfferID() );
        offerImportErrorDAO.setErrorCode( offerImportError.getErrorCode() );
        offerImportErrorDAO.setErrorMessage( offerImportError.getErrorMessage() );

        return offerImportErrorDAO;
    }

    protected List<OfferImportErrorDAO> offerImportErrorListToOfferImportErrorDAOList(List<OfferImportError> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferImportErrorDAO> list1 = new ArrayList<OfferImportErrorDAO>( list.size() );
        for ( OfferImportError offerImportError : list ) {
            list1.add( offerImportErrorToOfferImportErrorDAO( offerImportError ) );
        }

        return list1;
    }

    protected ImportWarningAttributeDAO importWarningAttributeToImportWarningAttributeDAO(ImportWarningAttribute importWarningAttribute) {
        if ( importWarningAttribute == null ) {
            return null;
        }

        ImportWarningAttributeDAO importWarningAttributeDAO = new ImportWarningAttributeDAO();

        importWarningAttributeDAO.setName( importWarningAttribute.getName() );
        importWarningAttributeDAO.setValue( importWarningAttribute.getValue() );

        return importWarningAttributeDAO;
    }

    protected List<ImportWarningAttributeDAO> importWarningAttributeListToImportWarningAttributeDAOList(List<ImportWarningAttribute> list) {
        if ( list == null ) {
            return null;
        }

        List<ImportWarningAttributeDAO> list1 = new ArrayList<ImportWarningAttributeDAO>( list.size() );
        for ( ImportWarningAttribute importWarningAttribute : list ) {
            list1.add( importWarningAttributeToImportWarningAttributeDAO( importWarningAttribute ) );
        }

        return list1;
    }

    protected ImportWarningDAO importWarningToImportWarningDAO(ImportWarning importWarning) {
        if ( importWarning == null ) {
            return null;
        }

        ImportWarningDAO importWarningDAO = new ImportWarningDAO();

        importWarningDAO.setAttributes( importWarningAttributeListToImportWarningAttributeDAOList( importWarning.getAttributes() ) );

        return importWarningDAO;
    }

    protected OfferImportWarningDAO offerImportWarningToOfferImportWarningDAO(OfferImportWarning offerImportWarning) {
        if ( offerImportWarning == null ) {
            return null;
        }

        OfferImportWarningDAO offerImportWarningDAO = new OfferImportWarningDAO();

        offerImportWarningDAO.setOfferId( offerImportWarning.getOfferId() );
        offerImportWarningDAO.setWarning( importWarningToImportWarningDAO( offerImportWarning.getWarning() ) );

        return offerImportWarningDAO;
    }

    protected List<OfferImportWarningDAO> offerImportWarningListToOfferImportWarningDAOList(List<OfferImportWarning> list) {
        if ( list == null ) {
            return null;
        }

        List<OfferImportWarningDAO> list1 = new ArrayList<OfferImportWarningDAO>( list.size() );
        for ( OfferImportWarning offerImportWarning : list ) {
            list1.add( offerImportWarningToOfferImportWarningDAO( offerImportWarning ) );
        }

        return list1;
    }

    protected OffersImportResponseDAO offersImportResponseToOffersImportResponseDAO(OffersImportResponse offersImportResponse) {
        if ( offersImportResponse == null ) {
            return null;
        }

        OffersImportResponseDAO offersImportResponseDAO = new OffersImportResponseDAO();

        offersImportResponseDAO.setInserted( offersImportResponse.getInserted() );
        offersImportResponseDAO.setUpdated( offersImportResponse.getUpdated() );
        offersImportResponseDAO.setSkipped( offersImportResponse.getSkipped() );
        offersImportResponseDAO.setErrors( offerImportErrorListToOfferImportErrorDAOList( offersImportResponse.getErrors() ) );
        offersImportResponseDAO.setOfferImportWarnings( offerImportWarningListToOfferImportWarningDAOList( offersImportResponse.getOfferImportWarnings() ) );

        return offersImportResponseDAO;
    }
}
