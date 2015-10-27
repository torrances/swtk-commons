package org.swtk.commons.dict.wordnet.index.name.instance.d.e.l.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDELP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"delphi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08804707\"]}");
	add("{\"term\":\"delphinapterus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02075317\"]}");
	add("{\"term\":\"delphinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02071388\"]}");
	add("{\"term\":\"delphinium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11753523\"]}");
	add("{\"term\":\"delphinus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02071924\", \"09287586\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }