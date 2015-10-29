package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03415650\", \"06790941\"]}");
	add("{\"term\":\"gag law\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06550403\", \"06679574\"]}");
	add("{\"term\":\"gag line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06791616\"]}");
	add("{\"term\":\"gag order\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06569576\"]}");
	add("{\"term\":\"gag reflex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00868101\"]}");
	add("{\"term\":\"gag rule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06679574\"]}");
	add("{\"term\":\"gagarin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11006862\"]}");
	add("{\"term\":\"gage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03434198\", \"03997192\"]}");
	add("{\"term\":\"gaggle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08008558\"]}");
	add("{\"term\":\"gagman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10136924\", \"10137072\"]}");
	add("{\"term\":\"gagster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10136924\"]}");
	add("{\"term\":\"gagwriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10136924\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }