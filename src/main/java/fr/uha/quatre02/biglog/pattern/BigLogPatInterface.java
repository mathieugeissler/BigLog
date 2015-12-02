package fr.uha.quatre02.biglog.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;

public interface BigLogPatInterface {

	public String LOG_ENTRY_PATTERN();

	public Pattern PATTERN();

	public BigLogMapperInterface parseLine(String line);

	Matcher CheckPattern(String line);

}
