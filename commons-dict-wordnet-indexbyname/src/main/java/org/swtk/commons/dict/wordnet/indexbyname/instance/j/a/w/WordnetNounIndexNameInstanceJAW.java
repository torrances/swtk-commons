package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jaw\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03599464\", \"05610915\", \"05553673\"]}");
	add("{\"term\":\"jawan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10239898\"]}");
	add("{\"term\":\"jawbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05283404\"]}");
	add("{\"term\":\"jawbreaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06316375\", \"07614732\"]}");
	add("{\"term\":\"jawfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02614191\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }