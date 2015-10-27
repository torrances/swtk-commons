package org.swtk.commons.dict.wordnet.index.name.instance.a.g.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"agribusiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01106311\"]}");
	add("{\"term\":\"agricola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10829279\"]}");
	add("{\"term\":\"agriculturalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09799231\"]}");
	add("{\"term\":\"agriculture\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08092123\", \"08145946\", \"00918295\", \"01106311\"]}");
	add("{\"term\":\"agriculturist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09799231\"]}");
	add("{\"term\":\"agrigento\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08829664\"]}");
	add("{\"term\":\"agrimonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12643636\"]}");
	add("{\"term\":\"agrimony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12643636\"]}");
	add("{\"term\":\"agriocharis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01797101\"]}");
	add("{\"term\":\"agrippa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10829461\"]}");
	add("{\"term\":\"agrippina\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10829650\", \"10829819\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }