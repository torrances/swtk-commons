package org.swtk.commons.dict.wordnet.index.name.instance.a.l.b.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALBI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"albigenses\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08102074\"]}");
	add("{\"term\":\"albigensianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06237839\"]}");
	add("{\"term\":\"albinism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14175761\"]}");
	add("{\"term\":\"albino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09801091\"]}");
	add("{\"term\":\"albion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08893163\"]}");
	add("{\"term\":\"albite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14889684\"]}");
	add("{\"term\":\"albizia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11779693\"]}");
	add("{\"term\":\"albizzia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11779693\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }