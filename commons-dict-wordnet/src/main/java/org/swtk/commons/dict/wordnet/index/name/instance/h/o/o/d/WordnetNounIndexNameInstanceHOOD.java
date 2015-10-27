package org.swtk.commons.dict.wordnet.index.name.instance.h.o.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hood\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"01750741\", \"03536090\", \"03536461\", \"03536627\", \"03536726\", \"03536871\", \"03536988\", \"08242255\", \"09328264\", \"10203700\"]}");
	add("{\"term\":\"hoodlum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10203700\"]}");
	add("{\"term\":\"hoodmold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03247298\"]}");
	add("{\"term\":\"hoodmould\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03247298\"]}");
	add("{\"term\":\"hoodoo\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03537260\", \"03609171\", \"10203909\", \"13923748\"]}");
	add("{\"term\":\"hoodooism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06255946\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }