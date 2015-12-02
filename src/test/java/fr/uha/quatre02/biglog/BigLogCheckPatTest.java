package fr.uha.quatre02.biglog;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.uha.quatre02.biglog.data.BigLogMapperInterface;
import fr.uha.quatre02.biglog.pattern.BigLogPatInterface;

public class BigLogCheckPatTest {
	
	@Test
	public void checkPat() {
		String line = "d9a6da0c289240ff708bb11a2f9449da0a604afa90c83d118fa0c9c326085bed js-project [28/Oct/2015:23:02:12 +0000] 81.250.134.18 - 19317A4CAA13E3B9 REST.GET.OBJECT AS-2312790.js \"GET /js-project/AS-2312790.js HTTP/1.1\" 304 - - 8890 14 - \"http://cart.rueducommerce.fr/Cart/\" \"Mozilla/5.0 (Windows NT 6.3; rv:41.0) Gecko/20100101 Firefox/41.0\" -";
		BigLogPatInterface pat = BigLogCheckPat.Analyze(line);
		BigLogMapperInterface data = pat.parseLine(line);
		assertEquals(304, data.MapHttpCode().intValue());
	}

}
