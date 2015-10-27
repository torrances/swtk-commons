package org.swtk.commons.dict.wordnet.index.name.instance.p.l.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plutarch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11260129\"]}");
	add("{\"term\":\"pluteaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13039777\"]}");
	add("{\"term\":\"pluteus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13039962\"]}");
	add("{\"term\":\"pluto\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09418792\", \"09593643\", \"09626432\"]}");
	add("{\"term\":\"plutocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08379702\"]}");
	add("{\"term\":\"plutocrat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10463529\"]}");
	add("{\"term\":\"pluton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14956441\"]}");
	add("{\"term\":\"plutonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14673953\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }