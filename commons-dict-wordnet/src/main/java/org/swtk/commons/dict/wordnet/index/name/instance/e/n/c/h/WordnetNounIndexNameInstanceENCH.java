package org.swtk.commons.dict.wordnet.index.name.instance.e.n.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENCH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"enchanter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10074893\"]}");
	add("{\"term\":\"enchantment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05988321\", \"14430940\", \"07513215\"]}");
	add("{\"term\":\"enchantress\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10075105\", \"10075218\"]}");
	add("{\"term\":\"enchilada\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07882997\"]}");
	add("{\"term\":\"enchiridion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06432944\"]}");
	add("{\"term\":\"enchondroma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14261523\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }