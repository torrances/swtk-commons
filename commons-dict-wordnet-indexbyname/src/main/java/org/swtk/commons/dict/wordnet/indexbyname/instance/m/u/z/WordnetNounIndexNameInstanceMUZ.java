package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"muzhik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362501\"]}");
	add("{\"term\":\"muzjik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362501\"]}");
	add("{\"term\":\"muztag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09387146\"]}");
	add("{\"term\":\"muztagh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09387146\"]}");
	add("{\"term\":\"muzzle\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03415650\", \"03808824\", \"02455095\", \"03474810\"]}");
	add("{\"term\":\"muzzle loader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03808656\"]}");
	add("{\"term\":\"muzzle velocity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15309138\"]}");
	add("{\"term\":\"muzzler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362624\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }