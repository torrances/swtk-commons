package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"le douanier rousseau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11292962\"]}");
	add("{\"term\":\"le duc tho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11143429\"]}");
	add("{\"term\":\"led\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03671688\"]}");
	add("{\"term\":\"leda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09624393\"]}");
	add("{\"term\":\"ledbetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11143252\"]}");
	add("{\"term\":\"lede\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06281532\"]}");
	add("{\"term\":\"ledercillin vk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03917370\"]}");
	add("{\"term\":\"lederhosen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03659159\"]}");
	add("{\"term\":\"ledge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09360159\"]}");
	add("{\"term\":\"ledgeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09893070\"]}");
	add("{\"term\":\"ledger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03169877\", \"13425421\"]}");
	add("{\"term\":\"ledger board\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03659301\"]}");
	add("{\"term\":\"ledger entry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13426469\"]}");
	add("{\"term\":\"ledger line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06875449\"]}");
	add("{\"term\":\"ledger paper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14958367\"]}");
	add("{\"term\":\"ledum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258823\"]}");
	add("{\"term\":\"ledum groenlandicum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12259008\"]}");
	add("{\"term\":\"ledum palustre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12259430\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }