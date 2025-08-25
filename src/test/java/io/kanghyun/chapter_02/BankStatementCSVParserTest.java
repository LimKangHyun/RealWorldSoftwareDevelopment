package io.kanghyun.chapter_02;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.Test;

class BankStatementCSVParserTest {

    private final BankStatementParser statementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectLine() throws Exception {
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction bankTransaction = statementParser.parseFrom(line);

        final BankTransaction expected
            = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
        assertThat(bankTransaction.getDate()).isEqualTo(expected.getDate());
        assertThat(bankTransaction.getAmount()).isEqualTo(expected.getAmount());
        assertThat(bankTransaction.getDescription()).isEqualTo(expected.getDescription());

    }
}