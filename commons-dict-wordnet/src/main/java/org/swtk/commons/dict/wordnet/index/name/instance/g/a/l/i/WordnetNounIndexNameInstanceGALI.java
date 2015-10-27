package org.swtk.commons.dict.wordnet.index.name.instance.g.a.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGALI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"galicia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09050574\"]}");
	add("{\"term\":\"galician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06979234\"]}");
	add("{\"term\":\"galilaean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10137614\"]}");
	add("{\"term\":\"galilean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09308885\", \"10137614\"]}");
	add("{\"term\":\"galilee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08811766\"]}");
	add("{\"term\":\"galileo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11007720\"]}");
	add("{\"term\":\"galingale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12171687\"]}");
	add("{\"term\":\"galium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12685658\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }