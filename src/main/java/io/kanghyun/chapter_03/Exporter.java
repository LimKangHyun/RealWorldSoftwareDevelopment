package io.kanghyun.chapter_03;

public interface Exporter {
    String export(SummaryStatistics summaryStatistics); // 기능 파악과 테스트 용이성 (Assertions)을 위해 반환타입은 void를 쓰지 않도록...
}
