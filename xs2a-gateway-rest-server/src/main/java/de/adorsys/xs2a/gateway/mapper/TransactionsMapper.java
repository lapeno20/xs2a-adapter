package de.adorsys.xs2a.gateway.mapper;

import de.adorsys.xs2a.gateway.model.ais.PurposeCodeTO;
import de.adorsys.xs2a.gateway.model.ais.TransactionDetails;
import de.adorsys.xs2a.gateway.service.account.BankTransactionCode;
import de.adorsys.xs2a.gateway.service.account.PurposeCode;
import de.adorsys.xs2a.gateway.service.account.Transactions;
import org.mapstruct.Mapper;

import java.util.Objects;

@Mapper(uses = {AmountMapper.class, AccountReferenceMapper.class, ExchangeRateMapper.class})
public interface TransactionsMapper {

    TransactionDetails toTransactionDetails(Transactions transactions);

    default PurposeCodeTO toPurposeCodeTO(PurposeCode purposeCode) {
        if (Objects.isNull(purposeCode)) {
            return null;
        }

        return PurposeCodeTO.fromValue(purposeCode.getCode());
    }

    default String toBankTransactionCode(BankTransactionCode bankTransactionCode) {
        if (Objects.isNull(bankTransactionCode)) {
            return null;
        }

        return bankTransactionCode.getCode();
    }
}
