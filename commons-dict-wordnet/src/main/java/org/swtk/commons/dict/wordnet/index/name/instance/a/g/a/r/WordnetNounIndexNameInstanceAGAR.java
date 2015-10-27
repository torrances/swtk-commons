package org.swtk.commons.dict.wordnet.index.name.instance.a.g.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"agar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14924159\", \"14924335\"]}");
	add("{\"term\":\"agaric\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13019575\", \"13074833\"]}");
	add("{\"term\":\"agaricaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13021132\"]}");
	add("{\"term\":\"agaricales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13019109\"]}");
	add("{\"term\":\"agaricus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13021428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }