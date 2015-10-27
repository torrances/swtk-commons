package org.swtk.commons.dict.wordnet.index.name.instance.l.a.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLARC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"larcener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10266610\"]}");
	add("{\"term\":\"larcenist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10266610\"]}");
	add("{\"term\":\"larcenous\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04883130\"]}");
	add("{\"term\":\"larceny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00782543\"]}");
	add("{\"term\":\"larch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11639312\", \"11639587\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }