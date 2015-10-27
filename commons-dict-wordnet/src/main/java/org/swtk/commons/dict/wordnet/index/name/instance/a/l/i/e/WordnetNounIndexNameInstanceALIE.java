package org.swtk.commons.dict.wordnet.index.name.instance.a.l.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alien\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09507595\", \"10680441\", \"10123254\"]}");
	add("{\"term\":\"alienage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04807038\"]}");
	add("{\"term\":\"alienation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00036612\", \"01110055\", \"14439177\", \"07517626\"]}");
	add("{\"term\":\"alienator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09802810\"]}");
	add("{\"term\":\"alienee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09802978\"]}");
	add("{\"term\":\"alienism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04807038\", \"06066318\"]}");
	add("{\"term\":\"alienist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09803094\"]}");
	add("{\"term\":\"alienor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09803217\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }