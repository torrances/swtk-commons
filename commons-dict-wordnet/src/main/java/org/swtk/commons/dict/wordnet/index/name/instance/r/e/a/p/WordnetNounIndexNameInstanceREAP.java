package org.swtk.commons.dict.wordnet.index.name.instance.r.e.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reaper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03502017\", \"09511714\", \"10180956\"]}");
	add("{\"term\":\"reappearance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00051707\", \"07336567\"]}");
	add("{\"term\":\"reapportionment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01086104\"]}");
	add("{\"term\":\"reappraisal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05755527\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }