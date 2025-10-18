package io.kanghyun.chapter_03;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class BankStatementProcessor {

    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public SummaryStatistics summarizeTransactions() {
        DoubleSummaryStatistics doubleSummaryStatistics = bankTransactions.stream()
            .mapToDouble(BankTransaction::getAmount)
            .summaryStatistics();

        return new SummaryStatistics(doubleSummaryStatistics.getSum(),
            doubleSummaryStatistics.getMin(),
            doubleSummaryStatistics.getMax(),
            doubleSummaryStatistics.getAverage());
    }

    public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
        final List<BankTransaction> result = new ArrayList<>();
        for (final BankTransaction bankTransaction : bankTransactions) {
            if (bankTransactionFilter.test(bankTransaction)) {
                result.add(bankTransaction);
            }
        }
        return result;
    }



}
