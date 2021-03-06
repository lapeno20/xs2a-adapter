package de.adorsys.xs2a.adapter.rest.psd2.model;

import javax.annotation.Generated;
import java.time.LocalDate;

@Generated("xs2a-adapter-codegen")
public class PaymentInitiationWithStatusResponseTO {
    private String endToEndIdentification;

    private AccountReferenceTO debtorAccount;

    private AmountTO instructedAmount;

    private AccountReferenceTO creditorAccount;

    private String creditorAgent;

    private String creditorName;

    private AddressTO creditorAddress;

    private String remittanceInformationUnstructured;

    private String transactionStatus;

    private String chargeBearer;

    private ClearingSystemMemberIdentificationTO clearingSystemMemberIdentification;

    private String debtorName;

    private String debtorAgent;

    private String instructionPriority;

    private String serviceLevelCode;

    private String localInstrumentCode;

    private String categoryPurposeCode;

    private LocalDate requestedExecutionDate;

    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public AccountReferenceTO getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(AccountReferenceTO debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public AmountTO getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(AmountTO instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public AccountReferenceTO getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(AccountReferenceTO creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public String getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(String creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public AddressTO getCreditorAddress() {
        return creditorAddress;
    }

    public void setCreditorAddress(AddressTO creditorAddress) {
        this.creditorAddress = creditorAddress;
    }

    public String getRemittanceInformationUnstructured() {
        return remittanceInformationUnstructured;
    }

    public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
        this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(String chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public ClearingSystemMemberIdentificationTO getClearingSystemMemberIdentification() {
        return clearingSystemMemberIdentification;
    }

    public void setClearingSystemMemberIdentification(
        ClearingSystemMemberIdentificationTO clearingSystemMemberIdentification) {
        this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName;
    }

    public String getDebtorAgent() {
        return debtorAgent;
    }

    public void setDebtorAgent(String debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    public String getInstructionPriority() {
        return instructionPriority;
    }

    public void setInstructionPriority(String instructionPriority) {
        this.instructionPriority = instructionPriority;
    }

    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    public String getLocalInstrumentCode() {
        return localInstrumentCode;
    }

    public void setLocalInstrumentCode(String localInstrumentCode) {
        this.localInstrumentCode = localInstrumentCode;
    }

    public String getCategoryPurposeCode() {
        return categoryPurposeCode;
    }

    public void setCategoryPurposeCode(String categoryPurposeCode) {
        this.categoryPurposeCode = categoryPurposeCode;
    }

    public LocalDate getRequestedExecutionDate() {
        return requestedExecutionDate;
    }

    public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
        this.requestedExecutionDate = requestedExecutionDate;
    }
}
