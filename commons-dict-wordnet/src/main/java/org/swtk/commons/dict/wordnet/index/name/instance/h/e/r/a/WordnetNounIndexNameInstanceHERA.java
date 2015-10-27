package org.swtk.commons.dict.wordnet.index.name.instance.h.e.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHERA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09586312\"]}");
	add("{\"term\":\"heracles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09601183\"]}");
	add("{\"term\":\"heracleum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12960424\"]}");
	add("{\"term\":\"heraclitus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11064290\"]}");
	add("{\"term\":\"herakles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09601183\"]}");
	add("{\"term\":\"herald\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06815429\", \"10190891\"]}");
	add("{\"term\":\"heraldry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03520482\", \"05809602\"]}");
	add("{\"term\":\"herat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08721786\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }