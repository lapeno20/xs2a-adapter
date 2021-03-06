package de.adorsys.xs2a.adapter.service.impl;

import de.adorsys.xs2a.adapter.http.HttpClient;
import de.adorsys.xs2a.adapter.http.Request;
import de.adorsys.xs2a.adapter.service.RequestHeaders;
import de.adorsys.xs2a.adapter.service.RequestParams;
import de.adorsys.xs2a.adapter.validation.RequestValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.apache.http.protocol.HTTP.DATE_HEADER;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FiduciaAccountInformationServiceTest {
    private static final String ACCOUNT_ID = "1234567890";
    private static final String UNSUPPORTED_BOOKING_STATUS = "unsupported";
    private static final String SUPPORTED_BOOKING_STATUS = "booked";

    @Mock
    private HttpClient httpClient;
    @Mock
    private Request.Builder.Interceptor interceptor;

    @InjectMocks
    private FiduciaAccountInformationService service;

    @Test
    public void populatePostHeaders() {
        Map<String, String> postHeaders = service.populatePostHeaders(new HashMap<>());
        assertThat(postHeaders.size()).isEqualTo(1);
        assertThat(postHeaders).containsKeys(DATE_HEADER);
    }

    @Test
    public void populateGetHeaders() {
        Map<String, String> getHeaders = service.populateGetHeaders(new HashMap<>());
        assertThat(getHeaders.size()).isEqualTo(1);
        assertThat(getHeaders).containsKeys(DATE_HEADER);
    }

    @Test
    public void populatePutHeaders() {
        Map<String, String> putHeaders = service.populatePutHeaders(new HashMap<>());
        assertThat(putHeaders.size()).isEqualTo(1);
        assertThat(putHeaders).containsKeys(DATE_HEADER);
    }

    @Test
    public void populateDeleteHeaders() {
        Map<String, String> deleteHeaders = service.populateDeleteHeaders(new HashMap<>());
        assertThat(deleteHeaders.size()).isEqualTo(1);
        assertThat(deleteHeaders).containsKeys(DATE_HEADER);
    }

    @Test
    public void getTransactionList_failure_notSupportedBookingStatus() {
        RequestValidationException ex = Assertions.assertThrows(
            RequestValidationException.class,
            () -> service.getTransactionList(
                ACCOUNT_ID,
                RequestHeaders.fromMap(new HashMap<>()),
                RequestParams.fromMap(buildRequestParamsMapWithBookingStatus(UNSUPPORTED_BOOKING_STATUS))
            )
        );
    }

    @Test
    public void getTransactionListAsString_failure_notSupportedBookingStatus() {
        Assertions.assertThrows(
            RequestValidationException.class,
            () -> service.getTransactionListAsString(
                ACCOUNT_ID,
                RequestHeaders.fromMap(new HashMap<>()),
                RequestParams.fromMap(buildRequestParamsMapWithBookingStatus(UNSUPPORTED_BOOKING_STATUS))
            )
        );
    }

    private Map<String, String> buildRequestParamsMapWithBookingStatus(String bookingStatus) {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put(RequestParams.BOOKING_STATUS, bookingStatus);
        return requestParams;
    }
}
