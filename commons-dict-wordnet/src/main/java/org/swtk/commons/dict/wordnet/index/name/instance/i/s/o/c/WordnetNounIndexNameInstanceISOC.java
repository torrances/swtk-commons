package org.swtk.commons.dict.wordnet.index.name.instance.i.s.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceISOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"isocarboxazid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03592611\"]}");
	add("{\"term\":\"isochrone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08607088\"]}");
	add("{\"term\":\"isoclinal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08607226\"]}");
	add("{\"term\":\"isocrates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11094759\"]}");
	add("{\"term\":\"isocyanate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14948010\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }