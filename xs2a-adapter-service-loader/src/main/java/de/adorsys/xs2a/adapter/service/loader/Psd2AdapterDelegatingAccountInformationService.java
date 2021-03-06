package de.adorsys.xs2a.adapter.service.loader;

import de.adorsys.xs2a.adapter.service.RequestHeaders;
import de.adorsys.xs2a.adapter.service.Response;
import de.adorsys.xs2a.adapter.service.psd2.Psd2AccountInformationService;
import de.adorsys.xs2a.adapter.service.psd2.model.*;

import java.io.IOException;
import java.util.Map;

public class Psd2AdapterDelegatingAccountInformationService implements Psd2AccountInformationService {

    private final Psd2AdapterServiceLoader adapterServiceLoader;

    public Psd2AdapterDelegatingAccountInformationService(Psd2AdapterServiceLoader adapterServiceLoader) {
        this.adapterServiceLoader = adapterServiceLoader;
    }

    @Override
    public Response<ConsentsResponse> createConsent(Map<String, String> queryParameters,
                                                    Map<String, String> headers,
                                                    Consents consents) throws IOException {
        return getAccountInformationService(headers)
            .createConsent(queryParameters, headers, consents);
    }

    private Psd2AccountInformationService getAccountInformationService(Map<String, String> headers) {
        return adapterServiceLoader.getPsd2AccountInformationService(RequestHeaders.fromMap(headers));
    }

    @Override
    public Response<ConsentInformationResponse> getConsentInformation(String consentId,
                                                                      Map<String, String> queryParameters,
                                                                      Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getConsentInformation(consentId, queryParameters, headers);
    }

    @Override
    public Response<Void> deleteConsent(String consentId,
                                        Map<String, String> queryParameters,
                                        Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .deleteConsent(consentId, queryParameters, headers);
    }

    @Override
    public Response<ConsentStatusResponse> getConsentStatus(String consentId,
                                                            Map<String, String> queryParameters,
                                                            Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getConsentStatus(consentId, queryParameters, headers);
    }

    @Override
    public Response<ScaStatusResponse> getConsentScaStatus(String consentId,
                                                           String authorisationId,
                                                           Map<String, String> queryParameters,
                                                           Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getConsentScaStatus(consentId, authorisationId, queryParameters, headers);
    }

    @Override
    public Response<CardAccountList> getCardAccountList(Map<String, String> queryParameters,
                                                        Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getCardAccountList(queryParameters, headers);
    }

    @Override
    public Response<CardAccountDetailsResponse> getCardAccountDetails(String accountId,
                                                                      Map<String, String> queryParameters,
                                                                      Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getCardAccountDetails(accountId, queryParameters, headers);
    }

    @Override
    public Response<ReadCardAccountBalanceResponse> getCardAccountBalances(String accountId,
                                                                           Map<String, String> queryParameters,
                                                                           Map<String, String> headers
    ) throws IOException {
        return getAccountInformationService(headers)
            .getCardAccountBalances(accountId, queryParameters, headers);
    }

    @Override
    public Response<CardAccountsTransactionsResponse> getCardAccountTransactionList(String accountId,
                                                                                    Map<String, String> queryParameters,
                                                                                    Map<String, String> headers
    ) throws IOException {
        return getAccountInformationService(headers)
            .getCardAccountTransactionList(accountId, queryParameters, headers);
    }

    @Override
    public Response<StartScaProcessResponse> startConsentAuthorisation(String consentId,
                                                                       Map<String, String> queryParameters,
                                                                       Map<String, String> headers,
                                                                       UpdateAuthorisation updateAuthentication)
        throws IOException {

        return getAccountInformationService(headers)
            .startConsentAuthorisation(consentId, queryParameters, headers, updateAuthentication);
    }

    @Override
    public Response<UpdateAuthorisationResponse> updateConsentsPsuData(String consentId,
                                                                       String authorisationId,
                                                                       Map<String, String> queryParameters,
                                                                       Map<String, String> headers,
                                                                       UpdateAuthorisation updateAuthentication)
        throws IOException {

        return getAccountInformationService(headers)
            .updateConsentsPsuData(consentId, authorisationId, queryParameters, headers, updateAuthentication);
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
    public Response getTransactions(String accountId,
                                    Map<String, String> queryParameters,
                                    Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getTransactions(accountId, queryParameters, headers);
    }

    @Override
    public Response<TransactionDetailsResponse> getTransactionDetails(String accountId,
                                                                      String transactionId,
                                                                      Map<String, String> queryParameters,
                                                                      Map<String, String> headers) throws IOException {
        return getAccountInformationService(headers)
            .getTransactionDetails(accountId, transactionId, queryParameters, headers);
    }
}
