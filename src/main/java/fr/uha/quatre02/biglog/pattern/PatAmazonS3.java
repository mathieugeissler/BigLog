package fr.uha.quatre02.biglog.pattern;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.uha.quatre02.biglog.data.DataAmazonS3;
import fr.uha.quatre02.biglog.data.BigLogMapperInterface;

public class PatAmazonS3 implements BigLogPatInterface, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7057164129058202984L;

	private PatAmazonS3() {}
	
	private static class PatAmazonS3Holder {
		private final static PatAmazonS3 instance = new PatAmazonS3();
	}
	
	public static PatAmazonS3 getInstance() {
		return PatAmazonS3Holder.instance;
	}
	
	public transient Matcher m;

	@Override
	public String LOG_ENTRY_PATTERN() {
		return "(\\S+) (\\S+) \\[([\\w:/]+\\s[+\\-]\\d{4})\\] (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) \"(\\S+ \\S+ \\S+)\" (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) (\\S+) \"(\\S+)\" \"(.+)\" (\\S+)";
	}
	
	@Override
	public Pattern PATTERN() {
		return Pattern.compile(LOG_ENTRY_PATTERN());
	}

	@Override
	public Matcher CheckPattern(String line) {
		Matcher match = PATTERN().matcher(line);
		if (match.matches()) {
			return match;
		}
		return null;
	}

	@Override
	public BigLogMapperInterface parseLine(String line) {
		this.m = this.CheckPattern(line);
		if (m != null) {
			DataAmazonS3 data = new DataAmazonS3(m.group(1), m.group(2), m.group(3), m.group(4), m.group(5),
					m.group(6), m.group(7), m.group(8), m.group(9), m.group(10), m.group(11), m.group(12), m.group(13),
					m.group(14), m.group(15), m.group(16), m.group(17), m.group(18));

			return data;
		}
		return null;
	}

}
