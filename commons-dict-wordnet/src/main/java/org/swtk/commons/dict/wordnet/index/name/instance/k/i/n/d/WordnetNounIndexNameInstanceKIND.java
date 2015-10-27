package org.swtk.commons.dict.wordnet.index.name.instance.k.i.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05847533\"]}");
	add("{\"term\":\"kindergarten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08429093\"]}");
	add("{\"term\":\"kindergartener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10485626\"]}");
	add("{\"term\":\"kindergartner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10485626\"]}");
	add("{\"term\":\"kindheartedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07569056\"]}");
	add("{\"term\":\"kindliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04848895\"]}");
	add("{\"term\":\"kindling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00379287\", \"15126153\"]}");
	add("{\"term\":\"kindness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00035041\", \"04836995\", \"04847242\"]}");
	add("{\"term\":\"kindred\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07986142\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }