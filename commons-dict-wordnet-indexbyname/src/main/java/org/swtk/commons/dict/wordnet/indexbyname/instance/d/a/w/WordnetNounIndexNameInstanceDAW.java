package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"daw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01582219\"]}");
	add("{\"term\":\"dawah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00732434\"]}");
	add("{\"term\":\"dawdler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10012790\"]}");
	add("{\"term\":\"dawdling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01069743\"]}");
	add("{\"term\":\"dawes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10945336\"]}");
	add("{\"term\":\"dawn\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15292774\", \"07340708\", \"15193837\"]}");
	add("{\"term\":\"dawn horse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02378514\"]}");
	add("{\"term\":\"dawn redwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11660583\"]}");
	add("{\"term\":\"dawning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15193837\"]}");
	add("{\"term\":\"dawson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08849248\"]}");
	add("{\"term\":\"dawson river salmon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02547784\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }