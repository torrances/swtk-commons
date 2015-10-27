package org.swtk.commons.dict.wordnet.index.name.instance.l.a.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLARI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lari\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02043352\", \"13722767\"]}");
	add("{\"term\":\"lariat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03649692\"]}");
	add("{\"term\":\"laricariidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02523022\"]}");
	add("{\"term\":\"larid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02043739\"]}");
	add("{\"term\":\"laridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02043526\"]}");
	add("{\"term\":\"larium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03748219\"]}");
	add("{\"term\":\"larix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11639201\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }