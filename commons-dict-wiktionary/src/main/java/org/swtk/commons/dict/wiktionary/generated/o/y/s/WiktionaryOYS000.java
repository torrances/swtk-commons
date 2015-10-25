package org.swtk.commons.dict.wiktionary.generated.o.y.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOYS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oyster", "{\"term\":\"oyster\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Old english (ca. 450-1100) \u0027ostre\u0027 reinforced or superseded in Middle english (1100-1500) by Anglo-norman \u0027oistre\u0027 which from Old french (842-ca. 1400) \u0027oistre\u0027 \u0027uistre\u0027 (compare modern French \u0027huître\u0027 ; both lines (Old English and Old French) from Latin \u0027ostrea\u0027 from Ancient greek (to 1453) \u0027ὄστρεον\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of certain marine bivalve mollusks, especially those of the family Ostreidae (the true oysters), usually found adhering to rocks or other fixed objects in shallow water along the seacoasts, or in brackish water in the mouth of rivers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1731\u0027\u0027, w:Jonathan Jonathan Swift, \u0027w:A Complete Collection of Genteel and Ingenious Polite Conversation\u0027, 1841, \u0027The Works of Jonathan Swift\u0027, Volume 2, [http://books.google.com.au/books?id\u003dmsVEAAAAYAAJ\u0026amp;pg\u003dPA344\u0026amp;dq\u003d%22He+was+a+bold+man+that+first+ate+an+oyster%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003d55VDU-LALsW8kQWyooGYBQ\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22He%20was%20a%20bold%20man%20that%20first%20ate%20an%20oyster%22\u0026amp;f\u003dfalse page 344\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"He was a bold man that first ate an \u0027\u0027oyster\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The delicate morsel of dark meat contained in a small cavity of the bone on each side of the lower part of the back of a fowl\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A pale beige color tinted with grey or pink, like that of an oyster\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A person who keeps secrets\", \"priority\":7}]}, \"synonyms\":{}}");

	add("oystercatcher", "{\"term\":\"oystercatcher\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|oyster|catcher|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several black or pied coastal wading birds in the genus \u0027Haematopus\u0027 that have a long red or orange bill and feed on shellfish\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oystery", "{\"term\":\"oystery\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|oyster|y|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fishery for oysters; a place where oysters are kept and grown\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }