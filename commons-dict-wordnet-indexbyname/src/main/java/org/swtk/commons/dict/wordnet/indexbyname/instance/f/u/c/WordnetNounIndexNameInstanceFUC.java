package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fucaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01406770\"]}");
	add("{\"term\":\"fucales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01406446\"]}");
	add("{\"term\":\"fuchs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11004585\"]}");
	add("{\"term\":\"fuchsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12363997\"]}");
	add("{\"term\":\"fuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00847651\"]}");
	add("{\"term\":\"fucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10134245\"]}");
	add("{\"term\":\"fuckhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10059388\"]}");
	add("{\"term\":\"fucking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00847651\"]}");
	add("{\"term\":\"fuckup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00075610\", \"09899210\"]}");
	add("{\"term\":\"fucoid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01407006\", \"01407136\"]}");
	add("{\"term\":\"fucus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01407648\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }