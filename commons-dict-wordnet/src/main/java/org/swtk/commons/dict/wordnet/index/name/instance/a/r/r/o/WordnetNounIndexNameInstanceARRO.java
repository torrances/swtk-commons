package org.swtk.commons.dict.wordnet.index.name.instance.a.r.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARRO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arroba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13637708\", \"13739724\"]}");
	add("{\"term\":\"arrogance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04895107\"]}");
	add("{\"term\":\"arrogation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00086498\"]}");
	add("{\"term\":\"arrogator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09829769\"]}");
	add("{\"term\":\"arrow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02745758\", \"06830979\"]}");
	add("{\"term\":\"arrowhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02746055\"]}");
	add("{\"term\":\"arrowroot\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12371608\", \"12372307\", \"15078914\"]}");
	add("{\"term\":\"arrowsmith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09830038\"]}");
	add("{\"term\":\"arrowworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01926531\"]}");
	add("{\"term\":\"arroyo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09229784\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }