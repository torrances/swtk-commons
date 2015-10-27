package org.swtk.commons.dict.wordnet.index.name.instance.a.b.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aberdare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08915375\"]}");
	add("{\"term\":\"aberdeen\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08912413\", \"09116677\", \"09162102\", \"09176333\"]}");
	add("{\"term\":\"aberrance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14527267\"]}");
	add("{\"term\":\"aberrancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14527267\"]}");
	add("{\"term\":\"aberrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09775224\"]}");
	add("{\"term\":\"aberration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11440253\", \"14409995\", \"14527267\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }