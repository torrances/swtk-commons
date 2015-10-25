package org.swtk.commons.dict.wiktionary.generated.h.a.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHAA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("haaf", "{\"term\":\"haaf\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"Danish\", \"English\", \"old norse\"], \"text\":\"From Old norse \u0027haf\u0027 (the sea) cognate with Danish \u0027hav\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The open sea, especially as a place to fish\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1822\u0027\u0027, Walter Scott, \u0027The Pirate\u0027, 1826, \u0027Novels and Romances of the Author of Waverley\u0027, Volume 19, [http://books.google.com.au/books?id\u003dc_4VAAAAYAAJ\u0026amp;pg\u003dPA320\u0026amp;dq\u003d%22haaf%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dFujPUtO8C47DkQWsyYD4BQ\u0026amp;ved\u003d0CLAEEOgBMG\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22haaf%22\u0026amp;f\u003dfalse page 320\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The banks to which they repair for the \u0027\u0027haaf\u0027\u0027 fishing, are often many miles distant from the station where the fish is dried; so that they are always twenty or thirty hours absent, frequently longer; and under unfavourable circumstances of wind and tide, they remain at sea, with a very small stock of provisions, and in a boat of a construction which seems extremely slender, for two or three days, and are sometimes heard of no more\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, Juliet Marillier, \u0027Foxmask\u0027: Saga of the Light Isles: 2, [http://books.google.com.au/books?id\u003d-Q7sWncw6Y4C\u0026amp;pg\u003dPA28\u0026amp;dq\u003d%22haaf%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dFujPUtO8C47DkQWsyYD4BQ\u0026amp;ved\u003d0CLYEEOgBMG\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22haaf%22\u0026amp;f\u003dfalse page 28\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027haaf\u0027\u0027-boat was as well maintained as any vessel in the islands; her master had a reputation for thoroughness, for all he was barely twenty years of age\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The practice of sea fishing for such as cod, ling and tusk\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, James Coull, \u00277: The development of fishing communities with special reference to Scotland\u0027, Jonathan Potts, Hance D. Smith (editors), \u0027Managing Britain\u0027s Marine and Coastal Environment: Towards a Sustainable Future\u0027, [http://books.google.com.au/books?id\u003dOYGj2Ukozc0C\u0026amp;pg\u003dPA145\u0026amp;dq\u003d%22haaf%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dFujPUtO8C47DkQWsyYD4BQ\u0026amp;ved\u003d0CL4CEOgBMD\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22haaf%22\u0026amp;f\u003dfalse page 145\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"Although men concentrated at the main \u0027\u0027haaf\u0027\u0027 stations during the summer fishing season, they reverted to their homes in crofting townships for the remainder of the year\", \"priority\":11}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }