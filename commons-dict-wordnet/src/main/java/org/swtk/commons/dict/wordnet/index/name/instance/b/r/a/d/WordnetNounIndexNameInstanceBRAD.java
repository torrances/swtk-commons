package org.swtk.commons.dict.wordnet.index.name.instance.b.r.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02892058\"]}");
	add("{\"term\":\"bradawl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02892139\"]}");
	add("{\"term\":\"bradbury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10880040\"]}");
	add("{\"term\":\"bradford\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10880185\"]}");
	add("{\"term\":\"bradley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10880403\", \"10880595\"]}");
	add("{\"term\":\"bradstreet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10880770\"]}");
	add("{\"term\":\"brady\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10880925\", \"10881131\"]}");
	add("{\"term\":\"bradycardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14385915\"]}");
	add("{\"term\":\"bradypodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02459407\"]}");
	add("{\"term\":\"bradypus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02459880\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }