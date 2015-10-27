package org.swtk.commons.dict.wordnet.index.name.instance.t.a.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTACK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tack\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00315221\", \"00352160\", \"04195411\", \"04302219\", \"04390217\", \"08698822\"]}");
	add("{\"term\":\"tacker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04310495\", \"09862436\", \"10707418\"]}");
	add("{\"term\":\"tackiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04825691\", \"04943081\"]}");
	add("{\"term\":\"tacking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00352160\", \"02808296\"]}");
	add("{\"term\":\"tackle\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00563022\", \"00729199\", \"03356280\", \"04098805\", \"10707566\"]}");
	add("{\"term\":\"tackler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10707734\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }