package org.swtk.commons.dict.wordnet.index.name.instance.l.a.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"laudability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04814594\"]}");
	add("{\"term\":\"laudableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04814594\"]}");
	add("{\"term\":\"laudanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03652422\"]}");
	add("{\"term\":\"laudator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10268408\"]}");
	add("{\"term\":\"lauder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10268408\", \"11138876\"]}");
	add("{\"term\":\"laudo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09359608\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }