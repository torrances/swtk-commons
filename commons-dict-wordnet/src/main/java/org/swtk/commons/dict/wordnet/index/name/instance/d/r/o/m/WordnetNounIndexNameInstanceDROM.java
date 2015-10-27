package org.swtk.commons.dict.wordnet.index.name.instance.d.r.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDROM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dromaeosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01720501\"]}");
	add("{\"term\":\"dromaeosauridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01720307\"]}");
	add("{\"term\":\"dromaius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01522360\"]}");
	add("{\"term\":\"drome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02695091\"]}");
	add("{\"term\":\"dromedary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02439943\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }