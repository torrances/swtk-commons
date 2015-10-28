package org.swtk.commons.dict.wordnet.indexbyname.instance.e.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eucalypt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12355408\"]}");
	add("{\"term\":\"eucalyptus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12355408\", \"12355868\"]}");
	add("{\"term\":\"eucarya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12757215\"]}");
	add("{\"term\":\"eucaryote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01418267\"]}");
	add("{\"term\":\"eucharist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01037885\"]}");
	add("{\"term\":\"euchre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00493320\"]}");
	add("{\"term\":\"eucinostomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02639967\"]}");
	add("{\"term\":\"euclid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10982294\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }