package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fabaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11767245\"]}");
	add("{\"term\":\"faberge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10984821\"]}");
	add("{\"term\":\"fabian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095204\"]}");
	add("{\"term\":\"fabian society\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08260772\"]}");
	add("{\"term\":\"fabiana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12924554\"]}");
	add("{\"term\":\"fabiana imbricata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12924724\"]}");
	add("{\"term\":\"fabianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06230764\"]}");
	add("{\"term\":\"fable\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06383036\", \"06383718\", \"06770602\"]}");
	add("{\"term\":\"fabric\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04940540\", \"03314753\"]}");
	add("{\"term\":\"fabrication\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00753287\", \"00913832\", \"00926639\", \"00932855\", \"06770602\"]}");
	add("{\"term\":\"fabricator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10679772\"]}");
	add("{\"term\":\"fabulist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10095317\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }