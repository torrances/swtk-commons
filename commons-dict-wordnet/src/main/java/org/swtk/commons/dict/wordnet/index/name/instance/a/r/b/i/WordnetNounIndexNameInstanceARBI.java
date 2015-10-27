package org.swtk.commons.dict.wordnet.index.name.instance.a.r.b.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARBI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arbiter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09822852\", \"09823476\"]}");
	add("{\"term\":\"arbitrage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01095889\"]}");
	add("{\"term\":\"arbitrager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09823223\"]}");
	add("{\"term\":\"arbitrageur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09823223\"]}");
	add("{\"term\":\"arbitrament\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01193374\"]}");
	add("{\"term\":\"arbitrariness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04679198\"]}");
	add("{\"term\":\"arbitration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01193374\", \"07165558\"]}");
	add("{\"term\":\"arbitrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09822852\"]}");
	add("{\"term\":\"arbitrement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01193374\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }