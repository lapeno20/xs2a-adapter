package de.adorsys.xs2a.adapter.rest.psd2.model;

import javax.annotation.Generated;
import java.util.List;

@Generated("xs2a-adapter-codegen")
public class AccountAccessTO {
    private List<AccountReferenceTO> accounts;

    private List<AccountReferenceTO> balances;

    private List<AccountReferenceTO> transactions;

    private AdditionalInformationAccessTO additionalInformation;

    private String availableAccounts;

    private String availableAccountsWithBalance;

    private String allPsd2;

    public List<AccountReferenceTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountReferenceTO> accounts) {
        this.accounts = accounts;
    }

    public List<AccountReferenceTO> getBalances() {
        return balances;
    }

    public void setBalances(List<AccountReferenceTO> balances) {
        this.balances = balances;
    }

    public List<AccountReferenceTO> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<AccountReferenceTO> transactions) {
        this.transactions = transactions;
    }

    public AdditionalInformationAccessTO getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformationAccessTO additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getAvailableAccounts() {
        return availableAccounts;
    }

    public void setAvailableAccounts(String availableAccounts) {
        this.availableAccounts = availableAccounts;
    }

    public String getAvailableAccountsWithBalance() {
        return availableAccountsWithBalance;
    }

    public void setAvailableAccountsWithBalance(String availableAccountsWithBalance) {
        this.availableAccountsWithBalance = availableAccountsWithBalance;
    }

    public String getAllPsd2() {
        return allPsd2;
    }

    public void setAllPsd2(String allPsd2) {
        this.allPsd2 = allPsd2;
    }
}
