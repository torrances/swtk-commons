package org.swtk.commons.dict.wordnet.indexbyname.instance.a.n.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anhedonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14049767\"]}");
	add("{\"term\":\"anhidrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047275\"]}");
	add("{\"term\":\"anhima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01863354\"]}");
	add("{\"term\":\"anhimidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01862978\"]}");
	add("{\"term\":\"anhinga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02057156\"]}");
	add("{\"term\":\"anhingidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02056905\"]}");
	add("{\"term\":\"anhydride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14791470\"]}");
	add("{\"term\":\"anhydrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047275\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }