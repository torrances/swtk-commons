package org.swtk.commons.dict.wordnet.index.name.instance.s.u.b.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUBL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sublease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13269827\"]}");
	add("{\"term\":\"sublet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13269827\"]}");
	add("{\"term\":\"sublieutenant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10688675\"]}");
	add("{\"term\":\"sublimate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15086851\"]}");
	add("{\"term\":\"sublimation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07312545\", \"07374893\"]}");
	add("{\"term\":\"sublimaze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03333595\"]}");
	add("{\"term\":\"sublimity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04878084\"]}");
	add("{\"term\":\"subluxation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07459749\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }