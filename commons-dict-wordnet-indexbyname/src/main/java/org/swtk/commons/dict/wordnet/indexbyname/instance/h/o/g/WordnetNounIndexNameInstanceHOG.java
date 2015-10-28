package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hog\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02398058\", \"02415433\", \"10199280\"]}");
	add("{\"term\":\"hogan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03530020\", \"11075449\"]}");
	add("{\"term\":\"hogarth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11075607\"]}");
	add("{\"term\":\"hogback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09327282\"]}");
	add("{\"term\":\"hogchoker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02667880\"]}");
	add("{\"term\":\"hogfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02592724\", \"02611177\"]}");
	add("{\"term\":\"hogg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02415433\", \"11075802\"]}");
	add("{\"term\":\"hogget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02415433\"]}");
	add("{\"term\":\"hoggishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04893430\"]}");
	add("{\"term\":\"hogmanay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15207559\"]}");
	add("{\"term\":\"hogshead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03530156\", \"13644486\"]}");
	add("{\"term\":\"hogwash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06624034\"]}");
	add("{\"term\":\"hogweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12960634\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }