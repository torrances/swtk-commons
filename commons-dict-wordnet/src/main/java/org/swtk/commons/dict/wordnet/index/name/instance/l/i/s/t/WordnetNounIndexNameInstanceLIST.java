package org.swtk.commons.dict.wordnet.index.name.instance.l.i.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"list\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05075249\", \"06492991\"]}");
	add("{\"term\":\"listener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10185041\"]}");
	add("{\"term\":\"listening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00883837\"]}");
	add("{\"term\":\"lister\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03683092\", \"10285588\", \"11154885\"]}");
	add("{\"term\":\"listera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12091451\"]}");
	add("{\"term\":\"listeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01369724\"]}");
	add("{\"term\":\"listeriosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14160548\"]}");
	add("{\"term\":\"listing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01013108\", \"06492991\"]}");
	add("{\"term\":\"listlessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04644238\", \"07499249\"]}");
	add("{\"term\":\"liston\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11155034\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }