package org.swtk.commons.dict.wordnet.index.name.instance.g.a.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGARR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"garret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03691456\"]}");
	add("{\"term\":\"garrick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11011411\"]}");
	add("{\"term\":\"garrison\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08414993\", \"11011579\", \"03425469\"]}");
	add("{\"term\":\"garrote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03425845\"]}");
	add("{\"term\":\"garroter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10140903\"]}");
	add("{\"term\":\"garrotte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03425845\"]}");
	add("{\"term\":\"garrotter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10140903\"]}");
	add("{\"term\":\"garrulinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01582509\"]}");
	add("{\"term\":\"garrulity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04658739\"]}");
	add("{\"term\":\"garrulousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04658739\"]}");
	add("{\"term\":\"garrulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01582866\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }