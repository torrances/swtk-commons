package org.swtk.commons.dict.wordnet.indexbyname.instance.o.l.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOLF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"olfaction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05666448\"]}");
	add("{\"term\":\"olfactory brain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05485338\"]}");
	add("{\"term\":\"olfactory bulb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05485791\"]}");
	add("{\"term\":\"olfactory impairment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14082503\"]}");
	add("{\"term\":\"olfactory modality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05666448\"]}");
	add("{\"term\":\"olfactory nerve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05485598\"]}");
	add("{\"term\":\"olfactory organ\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05605902\"]}");
	add("{\"term\":\"olfactory perception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05721684\"]}");
	add("{\"term\":\"olfactory property\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04987257\"]}");
	add("{\"term\":\"olfactory sensation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05721684\"]}");
	add("{\"term\":\"olfersia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13219252\"]}");
	add("{\"term\":\"olfersia cervina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13219380\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }