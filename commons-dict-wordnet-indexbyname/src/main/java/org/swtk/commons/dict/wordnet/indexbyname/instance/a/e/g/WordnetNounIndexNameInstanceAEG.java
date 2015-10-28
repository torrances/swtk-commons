package org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAEG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aegates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08802757\"]}");
	add("{\"term\":\"aegean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09211506\"]}");
	add("{\"term\":\"aegiceras\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12936785\"]}");
	add("{\"term\":\"aegilops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12125131\"]}");
	add("{\"term\":\"aegina\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01913639\", \"08800699\"]}");
	add("{\"term\":\"aegir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07418520\"]}");
	add("{\"term\":\"aegis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02898416\", \"01217353\"]}");
	add("{\"term\":\"aegisthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09618891\"]}");
	add("{\"term\":\"aegospotami\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01271379\", \"09211791\"]}");
	add("{\"term\":\"aegospotamos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01271379\", \"09211791\"]}");
	add("{\"term\":\"aegypiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01619192\"]}");
	add("{\"term\":\"aegypius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01620590\"]}");
	add("{\"term\":\"aegyptopithecus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02481963\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }