package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ruin\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00218640\", \"07332733\", \"07349843\", \"13487515\", \"04125729\", \"14585916\"]}");
	add("{\"term\":\"ruination\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00218640\", \"07332733\", \"07349843\", \"14585916\"]}");
	add("{\"term\":\"ruiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10028370\"]}");
	add("{\"term\":\"ruining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00218640\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }