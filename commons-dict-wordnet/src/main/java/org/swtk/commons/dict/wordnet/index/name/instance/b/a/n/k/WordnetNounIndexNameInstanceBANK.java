package org.swtk.commons.dict.wordnet.index.name.instance.b.a.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBANK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bank\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00170126\", \"02790795\", \"04146942\", \"09236735\", \"13377435\", \"13389491\", \"08479077\", \"09236341\", \"08437235\", \"09236472\"]}");
	add("{\"term\":\"bankbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13435332\"]}");
	add("{\"term\":\"banker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09857108\", \"09857212\"]}");
	add("{\"term\":\"bankhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10852900\"]}");
	add("{\"term\":\"bankia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01970037\"]}");
	add("{\"term\":\"banking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01102178\", \"01102563\"]}");
	add("{\"term\":\"banknote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13414935\"]}");
	add("{\"term\":\"bankroll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13377742\"]}");
	add("{\"term\":\"bankrupt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09857758\"]}");
	add("{\"term\":\"bankruptcy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01188887\", \"14502017\", \"14502268\"]}");
	add("{\"term\":\"banks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10853021\"]}");
	add("{\"term\":\"banksia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12236096\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }