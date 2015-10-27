package org.swtk.commons.dict.wordnet.index.name.instance.g.u.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01801943\"]}");
	add("{\"term\":\"guanabana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07777285\"]}");
	add("{\"term\":\"guanabenz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03469198\"]}");
	add("{\"term\":\"guanaco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02440804\"]}");
	add("{\"term\":\"guangdong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743169\"]}");
	add("{\"term\":\"guangzhou\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743287\"]}");
	add("{\"term\":\"guanine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14916289\"]}");
	add("{\"term\":\"guano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14916440\"]}");
	add("{\"term\":\"guanosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15097852\"]}");
	add("{\"term\":\"guantanamo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08768819\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }