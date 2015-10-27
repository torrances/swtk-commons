package org.swtk.commons.dict.wordnet.index.name.instance.g.a.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gamba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04543890\"]}");
	add("{\"term\":\"gambelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01682478\"]}");
	add("{\"term\":\"gambia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08965594\"]}");
	add("{\"term\":\"gambian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09766826\"]}");
	add("{\"term\":\"gambist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10138400\"]}");
	add("{\"term\":\"gambit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00168771\", \"00173311\", \"06778322\"]}");
	add("{\"term\":\"gamble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00804623\", \"13364002\"]}");
	add("{\"term\":\"gambler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10138857\", \"10138501\"]}");
	add("{\"term\":\"gambling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00431125\"]}");
	add("{\"term\":\"gamboge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04973720\", \"14922515\"]}");
	add("{\"term\":\"gambol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00512828\"]}");
	add("{\"term\":\"gambrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03418594\"]}");
	add("{\"term\":\"gambusia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01451893\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }