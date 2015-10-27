package org.swtk.commons.dict.wordnet.index.name.instance.r.o.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROSI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rosicrucian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10558835\", \"10559019\"]}");
	add("{\"term\":\"rosicrucianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06201218\"]}");
	add("{\"term\":\"rosidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12233327\"]}");
	add("{\"term\":\"rosilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11998356\"]}");
	add("{\"term\":\"rosin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14918291\"]}");
	add("{\"term\":\"rosiness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04978580\", \"04984679\", \"14074353\"]}");
	add("{\"term\":\"rosinweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11993810\", \"12035690\"]}");
	add("{\"term\":\"rosita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12311492\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }