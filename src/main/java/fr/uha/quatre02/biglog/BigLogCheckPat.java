package fr.uha.quatre02.biglog;

import fr.uha.quatre02.biglog.pattern.BigLogPatInterface;
import fr.uha.quatre02.biglog.pattern.PatAmazonS3;

public class BigLogCheckPat {

	public static BigLogPatInterface Analyze(String firstLine) {
		PatAmazonS3 amazon = PatAmazonS3.getInstance();
		if (amazon.CheckPattern(firstLine) != null) {
			return amazon;
		}
		return null;
	}
}
