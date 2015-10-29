package org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kelantan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08986475\"]}");
	add("{\"term\":\"keller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11119075\"]}");
	add("{\"term\":\"kellogg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11119428\"]}");
	add("{\"term\":\"kelly\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11119719\", \"11119913\", \"11120129\"]}");
	add("{\"term\":\"keloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14387318\"]}");
	add("{\"term\":\"kelp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01406098\"]}");
	add("{\"term\":\"kelp greenling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02651546\"]}");
	add("{\"term\":\"kelpie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02108064\", \"09567053\"]}");
	add("{\"term\":\"kelpwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11855123\"]}");
	add("{\"term\":\"kelpy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09567053\"]}");
	add("{\"term\":\"kelt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09707404\"]}");
	add("{\"term\":\"kelter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14520704\"]}");
	add("{\"term\":\"kelvin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11120250\", \"13736861\"]}");
	add("{\"term\":\"kelvin scale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13875199\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }