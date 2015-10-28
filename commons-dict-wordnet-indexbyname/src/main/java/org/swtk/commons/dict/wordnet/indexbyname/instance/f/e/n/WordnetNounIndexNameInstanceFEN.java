package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09370676\", \"13732324\"]}");
	add("{\"term\":\"fence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10104870\", \"03332179\"]}");
	add("{\"term\":\"fencer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10104986\"]}");
	add("{\"term\":\"fencesitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357201\"]}");
	add("{\"term\":\"fencing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01174134\", \"14883251\", \"03332179\"]}");
	add("{\"term\":\"fender\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02914504\", \"03333021\", \"03333146\", \"03332786\"]}");
	add("{\"term\":\"fenestella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03702999\"]}");
	add("{\"term\":\"fenestra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05332926\"]}");
	add("{\"term\":\"fenestration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00675805\", \"05083878\"]}");
	add("{\"term\":\"fengtien\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08746295\"]}");
	add("{\"term\":\"fenland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09370676\"]}");
	add("{\"term\":\"fennel\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07830766\", \"07833734\", \"07833847\", \"12959864\"]}");
	add("{\"term\":\"fennic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06969284\"]}");
	add("{\"term\":\"fenoprofen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03333337\"]}");
	add("{\"term\":\"fenrir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09607580\"]}");
	add("{\"term\":\"fentanyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03333595\"]}");
	add("{\"term\":\"fenugreek\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07834109\", \"12594975\"]}");
	add("{\"term\":\"fenusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02221564\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }