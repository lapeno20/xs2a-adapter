package de.adorsys.xs2a.adapter.service.loader;

import de.adorsys.xs2a.adapter.service.RequestHeaders;
import de.adorsys.xs2a.adapter.service.Response;
import de.adorsys.xs2a.adapter.service.model.TokenResponse;
import de.adorsys.xs2a.adapter.service.psd2.Psd2AccountInformationService;
import de.adorsys.xs2a.adapter.service.psd2.model.*;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

public class Psd2AdapterDelegatingAccountInformationService implements Psd2AccountInformationService {

    private final Psd2AdapterServiceLoader adapterServiceLoader;

    public Psd2AdapterDelegatingAccountInformationService(Psd2AdapterServiceLoader adapterServiceLoader) {
        this.adapterServiceLoader = adapterServiceLoader;
    }

    @Override
    public Response<ConsentsResponse> createConsent(Map<String, String> headers, Consents consents) {
        return getAccountInformationService(headers)
            .createConsent(headers, consents);
    }

    private Psd2AccountInformationService getAccountInformationService(Map<String, String> headers) {
        return adapterServiceLoader.getPsd2AccountInformationService(RequestHeaders.fromMap(headers));
    }

    @Override
    public Response<ConsentInformationResponse> getConsentInformation(String consentId, Map<String, String> headers) {
        return getAccountInformationService(headers)
            .getConsentInformation(consentId, headers);
    }

    @Override
    public Response<Void> deleteConsent(String consentId, Map<String, String> headers) {
        return getAccountInformationService(headers)
            .deleteConsent(consentId, headers);
    }

    @Override
    public Response<ConsentStatusResponse> getConsentStatus(String consentId, Map<String, String> headers) {
        return getAccountInformationService(headers)
            .getConsentStatus(consentId, headers);
    }

    @Override
    public Response<ScaStatusResponse> getConsentScaStatus(String consentId,
                                                 String authorisationId,
                                                 Map<String, String> headers) {
        return getAccountInformationService(headers)
            .getConsentScaStatus(consentId, authorisationId, headers);
    }

    @Override
    public Response<StartScaprocessResponse> startConsentAuthorisation(String consentId,
                                                             Map<String, String> headers,
                                                             UpdateAuthorisation updateAuthentication) {
        return getAccountInformationService(headers)
            .startConsentAuthorisation(consentId, headers, updateAuthentication);
    }

    @Override
    public Response<UpdateAuthorisationResponse> updateConsentsPsuData(String consentId,
                                                             String authorisationId,
                                                             Map<String, String> headers,
                                                             UpdateAuthorisation updateAuthentication) {
        return getAccountInformationService(headers)
            .updateConsentsPsuData(consentId, authorisationId, headers, updateAuthentication);
    }

    @Override
    public URI getAuthorizationRequestUri(Map<String, String> headers, String state, URI redirectUri) throws IOException {
        // fixme headers parameter is needed only for service loading
        return getAccountInformationService(headers)
            .getAuthorizationRequestUri(headers, state, redirectUri);
    }

    @Override
    public TokenResponse getToken(Map<String, String> headers, String authorizationCode) throws IOException {
        return getAccountInformationService(headers)
            .getToken(headers, authorizationCode);
    }

    @Override
    public Response<AccountList> getAccounts(Map<String, String> queryParameters,
                                            Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getAccounts(queryParameters, headers);
    }

    @Override
    public Response<ReadAccountBalanceResponse> getBalances(String accountId,
                                                  Map<String, String> queryParameters,
                                                  Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getBalances(accountId, queryParameters, headers);
    }

    @Override
    public Response<?> getTransactions(String accountId,
                                                Map<String, String> queryParameters,
                                                Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getTransactions(accountId, queryParameters, headers);
    }
}
