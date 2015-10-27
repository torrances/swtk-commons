package org.swtk.commons.dict.wordnet.index.name.instance.f.r.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFRAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fracas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199205\"]}");
	add("{\"term\":\"fractal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05939938\"]}");
	add("{\"term\":\"fraction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13754218\", \"03395053\", \"14946245\"]}");
	add("{\"term\":\"fractionation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00390316\", \"13505285\"]}");
	add("{\"term\":\"fractiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04915573\"]}");
	add("{\"term\":\"fracture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00377802\", \"09301443\", \"14315592\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }