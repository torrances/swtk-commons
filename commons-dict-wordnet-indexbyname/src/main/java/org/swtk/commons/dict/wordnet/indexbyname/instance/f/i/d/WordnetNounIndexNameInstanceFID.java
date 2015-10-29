package org.swtk.commons.dict.wordnet.indexbyname.instance.f.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fiddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04544161\"]}");
	add("{\"term\":\"fiddlehead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12974679\", \"13218952\"]}");
	add("{\"term\":\"fiddlehead fern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12974679\"]}");
	add("{\"term\":\"fiddleneck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12858226\"]}");
	add("{\"term\":\"fiddler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10731878\", \"10753892\", \"10774246\"]}");
	add("{\"term\":\"fiddler crab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01982807\"]}");
	add("{\"term\":\"fiddlestick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03337216\"]}");
	add("{\"term\":\"fidel castro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10906681\"]}");
	add("{\"term\":\"fidel castro ruz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10906681\"]}");
	add("{\"term\":\"fidelity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04884180\", \"04811555\"]}");
	add("{\"term\":\"fidget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07529034\"]}");
	add("{\"term\":\"fidgetiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07529034\"]}");
	add("{\"term\":\"fiduciary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10105843\"]}");
	add("{\"term\":\"fiduciary duty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01133977\"]}");
	add("{\"term\":\"fiduciary relation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13860585\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }