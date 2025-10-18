package io.kanghyun.chapter_03;

import java.util.List;

public interface BankStatementParser {
    io.kanghyun.chapter_03.BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
