package org.swtk.commons.dict.wordnet.indexbyname.instance.p.y.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePYX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pyx\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04036637\", \"04036750\"]}");
	add("{\"term\":\"pyxidanthera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12272094\"]}");
	add("{\"term\":\"pyxidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13160259\"]}");
	add("{\"term\":\"pyxie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12272257\"]}");
	add("{\"term\":\"pyxis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04036890\", \"09424488\", \"13160259\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }