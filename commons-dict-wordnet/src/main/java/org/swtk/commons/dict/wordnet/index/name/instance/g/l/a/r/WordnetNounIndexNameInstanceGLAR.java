package org.swtk.commons.dict.wordnet.index.name.instance.g.l.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glare\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14457235\", \"00880475\", \"04959747\"]}");
	add("{\"term\":\"glareola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02041491\"]}");
	add("{\"term\":\"glareole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02041647\"]}");
	add("{\"term\":\"glareolidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02041271\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }