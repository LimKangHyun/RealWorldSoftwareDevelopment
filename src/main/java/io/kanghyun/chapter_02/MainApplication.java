package io.kanghyun.chapter_02;

public class MainApplication {

	public static void main(String[] args) throws Exception {

		final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

		final BankStatementParser bankStatementParser = new BankStatementCSVParser();

		bankStatementAnalyzer.analyze(args[0], bankStatementParser);

	}
}