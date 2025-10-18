package io.kanghyun.chapter_03;

@FunctionalInterface // 추상 메서드가 하나인지 검사
public interface BankTransactionFilter {

    boolean test(BankTransaction bankTransaction); // 특정 필터 구현에 의존 X
}
