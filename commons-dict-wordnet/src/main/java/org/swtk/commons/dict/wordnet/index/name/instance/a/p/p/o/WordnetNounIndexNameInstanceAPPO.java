package org.swtk.commons.dict.wordnet.index.name.instance.a.p.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"appoggiatura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06885033\"]}");
	add("{\"term\":\"appointee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09630660\", \"09820387\"]}");
	add("{\"term\":\"appointment\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00091213\", \"00587142\", \"09630660\", \"02733566\", \"08401740\", \"00164600\"]}");
	add("{\"term\":\"apportioning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01085569\"]}");
	add("{\"term\":\"apportionment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01085569\"]}");
	add("{\"term\":\"appositeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04723767\"]}");
	add("{\"term\":\"apposition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01053725\", \"13455121\", \"13823429\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }