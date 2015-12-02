package fr.uha.quatre02.biglog.pattern;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;

public class PatKxcdn implements Serializable, BigLogPatInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8845682702352314911L;

	private PatKxcdn() {
	}

	private static class PatKxcdnHolder {
		private final static PatKxcdn instance = new PatKxcdn();
	}

	public static PatKxcdn getInstance() {
		return PatKxcdnHolder.instance;
	}

	public transient Matcher m;

	@Override
	public String LOG_ENTRY_PATTERN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pattern PATTERN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigLogMapperInterface parseLine(String line) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matcher CheckPattern(String line) {
		// TODO Auto-generated method stub
		return null;
	}

}
